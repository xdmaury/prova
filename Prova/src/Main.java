
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maury
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int opMenu = 0;
        do {

            opMenu = menu();

            acoesDoMenu(opMenu);

        } while (opMenu != 0);
    }

    private static void acoesDoMenu(int opMenu) throws Exception {
        metodos metodos = new metodos();

        switch (opMenu) {
            case 1:
                metodos.SequenciaFibonacci(lerValorInt());
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Celsius: " + metodos.ConverterParaCelsius(lerValorFloat()));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Informe o valor de A B e C");
                JOptionPane.showMessageDialog(null, "Delata: " + metodos.EquacaoSegundoGrau(lerValorInt(), lerValorInt(), lerValorInt()));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Informe numero de linas de colunas\n");
                int linha = lerValorInt();
                int coluna = lerValorInt();
                JOptionPane.showMessageDialog(null, "Informe um valor para fazer a mutiplicação\n");
                int valor = lerValorInt();
                metodos.matriz(lerMatriz(linha, coluna), linha, coluna, valor);
            default:
                JOptionPane.showMessageDialog(null, "Entrada invalida!");
        }
    }

    private static int menu() {
        try {
            String opcaoString = JOptionPane.showInputDialog(null,
                    "Escolhar uma questao\n\n"
                    + "1 - Série de Fibonacci\n"
                    + "2 - Conveter Fahrenheit para Celsius\n"
                    + "3 - Equação 2 grau\n"
                    + "4 - Mutiplicar matriz\n"
                    + "0 - SAIR", "Prova", JOptionPane.QUESTION_MESSAGE);

            // Converter o valor em String para inteiro
            return Integer.parseInt(opcaoString);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Entrada invalida!");
        }
        return 0;
    }

    private static int[][] lerMatriz(int linha, int coluna) {
        int[][] matriz;
        matriz = new int[linha][coluna];
        try {
            JOptionPane.showMessageDialog(null, "Prenchar a matriz:");
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    String leitura = JOptionPane.showInputDialog(null, "Insira um valor: ", "Matriz", JOptionPane.QUESTION_MESSAGE);
                    matriz[i][j] = Integer.parseInt(leitura);
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Entrada invalida!");
        }
        return matriz;
    }

    private static int lerValorInt() {
        int valor = 0;
        try {
            String leitura = JOptionPane.showInputDialog(null, "Insira um valor: ", "Valor Int", JOptionPane.QUESTION_MESSAGE);
            valor = Integer.parseInt(leitura);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Entrada invalida!");
        }
        return valor;
    }

    private static float lerValorFloat() {
        float valor = 0;
        try {
            String leitura = JOptionPane.showInputDialog(null, "Insira um valor: ", "Valor Float", JOptionPane.QUESTION_MESSAGE);
            valor = Float.parseFloat(leitura);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Entrada invalida!");
        }
        return valor;
    }

}

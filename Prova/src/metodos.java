/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maury
 */
public class metodos {

    public void SequenciaFibonacci(int valor) {
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        if (valor >= 3) {
            for (int i = 0; i < (valor - 2); i++) {
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }

    }

    public float ConverterParaCelsius(float fahrenheit) {
        float celsius = 0;
        celsius = ((fahrenheit - 32) / 9) * 5;
        return celsius;
    }

    public int EquacaoSegundoGrau(int A, int B, int C) {

        int delta = (int) ((Math.pow(B, 2)) - ((4 * A) * C));

        return delta;
    }
    
        public void matriz(int[][] matriz, int l, int c, int valor) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] *= valor;
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println("");
        }
    }

}

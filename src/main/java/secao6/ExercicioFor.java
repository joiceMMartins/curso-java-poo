package secao6;

import java.util.Scanner;

public class ExercicioFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    /*
    Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    X, se for o caso
     */
        int numero = sc.nextInt();
        for(int i = 1; i <= numero; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

    /*
    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
    essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
     */

        int n = sc.nextInt();
        int quantidadeDentro = 0;
        int quantidadeFora = 0;

        for(int i = 0; i <= n; i++) {
            int numeroInformado = sc.nextInt();

            boolean dentroIntervalo = numeroInformado > 10 && numeroInformado < 20;

            if(dentroIntervalo) {
                quantidadeDentro++;
            } else {
                quantidadeFora++;
            }
        }

        System.out.printf("%d in", quantidadeDentro);
        System.out.printf("%d out", quantidadeFora);

        /*

         */

    }
}

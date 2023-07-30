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
        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        peso 5.
         */

        int quantidadeTestes = sc.nextInt();

        for(int num = 0; num < quantidadeTestes; num++) {
            double primeiroNumero = sc.nextDouble();
            double segundoNumero = sc.nextDouble();
            double terceiroNumero = sc.nextDouble();

            double media = (primeiroNumero * 2.0 + segundoNumero * 3.0 + terceiroNumero * 5.0) / 10.0;

            System.out.printf("%.1f/n", media);
        }

        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */

        int repeticao = sc.nextInt();

        for(int i = 0; i < repeticao; i++) {
            int primeiroNum = sc.nextInt();
            int segundoNum = sc.nextInt();

            if(segundoNum == 0) {
                System.out.print("Divisão impossível.");
            } else {
                System.out.print(primeiroNum / segundoNum);
            }
        }

        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1.
         */

        int valor = sc.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= valor; i++) {
            fatorial *= i;
        }

        System.out.print(fatorial);

        /*
        Ler um número inteiro N e calcular todos os seus divisores.
         */

        int numEscolhido = sc.nextInt();

        for(int i = 1; i <= numEscolhido; i++) {
            if(numEscolhido % i == 0) {
                System.out.println(i);
            }
        }

        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        exemplo.
         */

        int valorEscolhido = sc.nextInt();

        for(int i = 1; i <= valorEscolhido; i++) {
            int quadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }
    }
}

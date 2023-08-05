package secao10;

import java.util.Scanner;

public class ExercicioVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
         * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
         */

        System.out.print("Quantos números você vai digitar?");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for(int i = 0; i < n; i++){
            if(vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        /*
        * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        * - Imprimir todos os elementos do vetor
        * - Mostrar na tela a soma e a média dos elementos do vetor
         */

        System.out.print("Quantos números você vai digitar?");
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("VALORES = ");
        for(int numero : vetor){
            System.out.print(numero + " ");
        }

        int soma = 0;
        for(int numero : vetor){
            soma += vetor[numero];
        }
        System.out.printf("Soma = %d", soma);

        int media = soma / n;
        System.out.printf("Media = %d", media);

        /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.
        */

        System.out.print("Quantas pessoas serão digitadas?");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];


        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Dados da " + i+1 + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAlturas = 0;
        for(int i = 0; i < n; i++) {
            somaAlturas += alturas[i];
        }

        System.out.println("Altura média: " + somaAlturas / n);

        int menosDe16 = 0;
        for(int i = 0; i < n; i++){
            if(idades[i] < 16){
                menosDe16++;
            }
        }

        double porcentagemMenorDe16 = ((double)menosDe16 / n) * 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", porcentagemMenorDe16);

        for(int i = 0; i < n; i++){
            if(idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.
         */

        System.out.print("Quantos números você vai digitar?");
        n = sc.nextInt();
        int[] vetorNumeros = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetorNumeros[i] = sc.nextInt();
        }

        System.out.println("Números pares:");
        int quantidadePares = 0;
        for(int numero : vetorNumeros){
            if(numero % 2 == 0) {
                System.out.println(numero + "\t");
                quantidadePares++;
            }
        }

        System.out.printf("Quantidade de números pares: %d", quantidadePares);

        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).
         */

        System.out.print("Quantos números você vai digitar?");
        n = sc.nextInt();

        int[] vetorNumerosReais = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetorNumerosReais[i] = sc.nextInt();
        }

        int maiorNumero = 0;
        int posicaoMaiorNumero = 0;
        for(int i = 0; i < n; i++){
            if(vetorNumerosReais[i] > maiorNumero) {
                maiorNumero = vetorNumerosReais[i];
                posicaoMaiorNumero = i;
            }
        }

        System.out.printf("Maior valor = %d\n", maiorNumero);
        System.out.printf("Posição do maior valor = %d\n", posicaoMaiorNumero);

        /*
        Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado.
         */

        System.out.print("Quantos valores terão so vetores?");
        int quantidadeItens = sc.nextInt();

        int[] vetorA = new int[quantidadeItens];
        int[] vetorB = new int[quantidadeItens];
        int[] vetorC = new int[quantidadeItens];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < quantidadeItens; i++){
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < quantidadeItens; i++){
            vetorB[i] = sc.nextInt();
        }

        for(int i = 0; i < quantidadeItens; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor resultante:");
        for(int numero : vetorC){
            System.out.println(vetorC[numero]);
        }

        sc.close();
    }
}

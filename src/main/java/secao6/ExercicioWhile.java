package secao6;

import java.util.Scanner;

public class ExercicioWhile {

    public static void main(String[] args) {

        /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
         */

        Scanner sc = new Scanner(System.in);

        boolean valorBoolean = true;
        while(valorBoolean) {
            int valor = sc.nextInt();
            if(valor != 2002) {
                System.out.println("Senha inválida");
            }
            System.out.println("Acesso permitido.");
            valorBoolean = false;
        }

        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
         */

        boolean opcaoVazia = false;
        while(!opcaoVazia) {
            int retaX = sc.nextInt();
            int retaY = sc.nextInt();

            if(retaX == 0 || retaY == 0) {
                opcaoVazia = true;
            }

            if(retaX > 0 && retaY > 0) {
                System.out.print("primeiro quadrante");
            } else if(retaX < 0 && retaY > 0) {
                System.out.print("segundo quadrante");
            } else if(retaX < 0 && retaY < 0) {
                System.out.print("terceiro quadrante");
            } else {
                System.out.print("quarto quadrante");
            }
        }

        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.
         */

        int quantidadeAlcool = 0;
        int quantidadeGasolina = 0;
        int quantidadeDiesel = 0;

        int opcao = sc.nextInt();

        while(opcao != 4) {

            if (opcao == 1) {
                quantidadeAlcool++;
            }
            else if (opcao == 2) {
                quantidadeGasolina++;
            }
            else if (opcao == 3) {
                quantidadeDiesel++;
            }

            opcao = sc.nextInt();
        }

        System.out.println("Muito Obrigado");
        System.out.printf("Álcool: %d", quantidadeAlcool);
        System.out.printf("Gasolina: %d", quantidadeGasolina);
        System.out.printf("Diesel: %d", quantidadeDiesel);

    }

}

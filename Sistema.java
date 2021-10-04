package SistemaImobiliario;
//Os alunos/alunas devem criar um sistema de gestão para uma imobiliaria.
// O sistema deve permitir o cadastro de um imovel e de todos os seus moradores. Ao final do programa, deve ser exibido
// o endereço do imóvel, o valor do aluguel, quais são seus moradores e o nome do funcionário responsável pelo imóvel.
//Entrega mínima
//O sistema permite cadastrar um imóvel com valor do aluguel, endereço, os moradores e o funcionário responsável.
// No final, o sistema deve exibir os dados do imóvel.
//Entrega média:
//O sistema permite adicionar mais de um imóvel e exibir a lista de imóveis.

import java.util.Scanner;

public class Sistema {
    public static void menu(){
        System.out.println("1 para cadastrar morador");
        System.out.println("2 para cadastrar funcionário responsável");
        System.out.println("3 para cadastrar imóvel");
    }


    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

}

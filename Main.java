package listas_composicao27;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //instanciando morador
        Morador morador1 = new Morador("Joao");
        Morador morador2 = new Morador("Ana");
        Morador morador3 = new Morador("Paul");
        Morador morador4 = new Morador("Rebeca");




        //instanciando imovel
        Imovel imovel1 = new Imovel("Rua dois", 900);
        Imovel imovel2 = new Imovel("Rua oito", 1000);
        //instanciando funcionarios
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        //adicionando morador a imoveis
        imovel1.adicionar_morador(morador1);
        imovel1.adicionar_morador(morador3);

        imovel2.adicionar_morador(morador2);
        imovel2.adicionar_morador(morador4);

        //adicionando funcionario responsavel
        imovel1.adicionar_funcionario(funcionario2);
        imovel2.adicionar_funcionario(funcionario1);

        //exibindo imoveis
        System.out.println(imovel1.toString());
        System.out.println(imovel2.toString());


    }

}


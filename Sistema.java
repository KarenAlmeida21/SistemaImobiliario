package SistemaImobiliario;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static void menu() {
        System.out.println("1 para cadastrar imóvel");
        System.out.println("2 para exibir o cadastro ");
        System.out.println("3 para sair do menu");
    }


    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Imovel novoImovel() {

        String endereço = obterDados("Digite o endereço do imóvel: ").nextLine();
        double valorAlguel = obterDados("Digite o valor do aluguel: ").nextDouble();
        Imovel imovel = new Imovel(endereço, valorAlguel);
        return imovel;
    }

    public static Morador novoMorador() {
        String nome = obterDados("Digite o nome do morador: ").nextLine();
        Morador morador = new Morador(nome);
        morador.setNome(nome);
        return morador;

    }
    public static void encerrarMenu(){
        System.out.println("Volte Sempre");
    }

    public static Funcionario novoFuncionario() {
        String nome = obterDados("Digite o nome do funcionário Responsável: ").nextLine();
        Funcionario novoFuncionario = new Funcionario(nome);
        novoFuncionario.setNome(nome);
        return novoFuncionario;
    }

    public static void executar() {
        boolean menu = true;
        menu();
        Imobiliaria imobiliaria = new Imobiliaria();
        while (menu) {
            int opcaoMenu = obterDados("Digite sua opção do menu: ").nextInt();
            if (opcaoMenu == 1) {
                Imovel imovel = novoImovel();
                imobiliaria.cadastrarImovel(imovel);

                String confirmacaoMorador = obterDados("Deseja adicionar novo morador?").nextLine();
                if(confirmacaoMorador.equalsIgnoreCase("sim")){
                    int qtdeMoradoes = obterDados("Quantos moradoes? ").nextInt();
                    for (int x=0; x < qtdeMoradoes;x++){
                        imovel.adicionarMorador(novoMorador());
                        System.out.println("Morador Adicionado\n");
                    }
                }
                String confirmacaoFuncionario = obterDados("Deseja adicionar funcionario responsável?").nextLine();
                if(confirmacaoFuncionario.equalsIgnoreCase("sim")){
                    imovel.adicionarFuncionario(novoFuncionario());
                    System.out.println("Funcionário Cadastrado\n");
                }
            }if(opcaoMenu==2){
                System.out.println(imobiliaria);
            }
            if (opcaoMenu==3){
                encerrarMenu();
                menu=false;

            }

        }


    }
}
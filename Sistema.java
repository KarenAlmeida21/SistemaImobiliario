package SistemaImobiliario;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//O sistema deve permitir excluir um morador de um imóvel específico utilizando o  CPF do morador.
// E também, o sistema não pode permitir adicionar um morador com CPF repetido.

public class Sistema {
    //menu
    public static void menu() {
        System.out.println("1 para cadastrar imóvel");
        System.out.println("2 para exibir o cadastro ");
        System.out.println("3 excluir morador");
        System.out.println("4 para sair do menu");
    }

//método para receber dados do usuario
    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
//método para receber novo morador
    public static Imovel novoImovel() {

        String endereço = obterDados("Digite o endereço do imóvel: ").nextLine();
        double valorAlguel = obterDados("Digite o valor do aluguel: ").nextDouble();
        Imovel imovel = new Imovel(endereço, valorAlguel);
        return imovel;
    }
//método para criar um novo morador
    public static Morador novoMorador() {
        String nome = obterDados("Digite o nome do morador: ").nextLine();
        String cpf =obterDados("Digite o cpf do morador: ").nextLine();

        Morador morador = new Morador();
        morador.setCpf(cpf);
        morador.setNome(nome);
        return morador;

    }
    //método informação de encerrar menu
    public static void encerrarMenu(){
        System.out.println("Volte Sempre");
    }



//um foreah dentro do outro;
  //  metodo para validar cpf
   public static boolean validarCpf (Imobiliaria imobiliaria, Morador morador){
       //crio uma variavel que puxa o cpf do morador
    String cpfAserVerificado = morador.getCpf();
     for (Imovel percorrerListaImoveis:imobiliaria.getListaImoveis()) {
         //percorrer lista de moradores com um foreach
         for (Morador percorrerListaMoradores: percorrerListaImoveis.getListaMoradores()) {
             if(percorrerListaMoradores.getCpf().equals(cpfAserVerificado)){
                 return true;
             }

         }

     }
     return false;
    }


//método para criar um novo funcionário
    public static Funcionario novoFuncionario() {
        String nome = obterDados("Digite o nome do funcionário Responsável: ").nextLine();
        String cpf =obterDados("Digite o cpf do funcionario: ").nextLine();
        Funcionario novoFuncionario = new Funcionario();
     novoFuncionario.setNome(nome);
        novoFuncionario.setCpf(cpf);
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
                    for (int contador=0; contador < qtdeMoradoes;contador++){
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


            }else if(opcaoMenu==4){
                encerrarMenu();
                menu=false;
            }

        }


    }
}
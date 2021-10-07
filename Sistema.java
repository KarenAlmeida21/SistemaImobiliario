package SistemaImobiliario;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    //método para receber novo imovel
    public static Imovel novoImovel() {

        String endereço = obterDados("Digite o endereço do imóvel: ").nextLine();
        double valorAlguel = obterDados("Digite o valor do aluguel: ").nextDouble();
        Imovel imovel = new Imovel(endereço, valorAlguel);
        return imovel;
    }

    //método para criar um novo morador
    public static Morador novoMorador(Imobiliaria imobiliaria, Imovel imovel) {

        String nome = obterDados("Digite o nome do morador: ").nextLine();
        String cpf = obterDados("Digite o cpf do morador: ").nextLine();
        Morador morador = new Morador(nome, cpf);
        if (validarCpf(imobiliaria, morador)) {
            System.out.println("CPF já cadastrado");
        } else if (!validarCpf(imobiliaria, morador)) {

            imovel.adicionarMorador(morador);
        }


        return morador;
    }


    //método informação de encerrar menu
    public static void encerrarMenu() {
        System.out.println("Volte Sempre");
    }


    //
    //  metodo para validar cpf
    public static boolean validarCpf(Imobiliaria imobiliaria, Morador morador) {
        //crio uma variavel que puxa o cpf do morador
        String cpf = morador.getCpf();
        // um foreah dentro do outro;
        for (Imovel percorrerListaImoveis : imobiliaria.getListaImoveis()) {
            //percorrer lista de moradores com um foreach
            for (Morador percorrerListaMoradores : percorrerListaImoveis.getListaMoradores()) {

                if (percorrerListaMoradores.getCpf().equals(cpf)) {

                    return true;
                }

            }

        }
        return false;
    }


    public static Imobiliaria exibirLista(Imobiliaria imobiliaria) {
        for (Imovel percorrerListaImoveis : imobiliaria.getListaImoveis()) {
            System.out.println(imobiliaria);


        }
        return imobiliaria;
    }

    //método remover morador
    public static String removerMorador(Imobiliaria imobiliaria) {
        String cpf = obterDados("Digite o CPF do morador a ser removido: ").nextLine();

        for (Imovel percorrerListaImoveis : imobiliaria.getListaImoveis()) {

            for (Morador percorrerListaMoradores : percorrerListaImoveis.getListaMoradores()) {
                if (percorrerListaMoradores.getCpf().equals(cpf)) {
                    percorrerListaImoveis.getListaMoradores().remove(percorrerListaMoradores);
                    System.out.println("Morador Removido");

                    return "Morador removido com sucesso";
                }
            }
        }
        System.out.println("Morador  não cadastrado");
        return "Morador não cadastrado no sistema";
    }


    //método para criar um novo funcionário
    public static Funcionario novoFuncionario() {
        String nome = obterDados("Digite o nome do funcionário Responsável: ").nextLine();
        String cpf = obterDados("Digite o cpf do funcionario: ").nextLine();
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


                String confirmacaoMorador = obterDados("Deseja adicionar novo morador?").nextLine();
                if (confirmacaoMorador.equalsIgnoreCase("sim")) {
                    int qtdeMoradores = obterDados("Quantos moradores?").nextInt();


                    imobiliaria.cadastrarImovel(imovel);


                    for (int contador = 0; contador < qtdeMoradores; contador++) {
                        Morador morador = novoMorador(imobiliaria, imovel);
                    }
                    System.out.println("Morador Adicionado");
                }
                String confirmacaoFuncionario = obterDados("Deseja adicionar funcionario responsável?").nextLine();
                if (confirmacaoFuncionario.equalsIgnoreCase("sim")) {
                    //adiciono funcionario
                    imovel.adicionarFuncionario(novoFuncionario());
                    System.out.println("Funcionário Cadastrado\n");
                }
            }
            if (opcaoMenu == 2) {
                exibirLista(imobiliaria);
            }
            if (opcaoMenu == 3) {
                removerMorador(imobiliaria);


            } else if (opcaoMenu == 4) {
                encerrarMenu();
                menu = false;
            }

        }


    }
}
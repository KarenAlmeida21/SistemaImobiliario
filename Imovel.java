package SistemaImobiliario;


import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorAluguel;
    public List<Morador> listaMoradores = new ArrayList<>();
    public List<Funcionario> funcionarioResponsavel = new ArrayList<>();

    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public List<Morador> getListaMoradores() {
        return listaMoradores;
    }

    public void setListaMoradores(List<Morador> listaMoradores) {
        this.listaMoradores = listaMoradores;
    }

    public List<Funcionario> getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }
    public void adicionarMorador(  Morador novoMorador) {


        listaMoradores.add(novoMorador);


    }

    public void adicionarFuncionario(Funcionario novoFuncionario) {
        getFuncionarioResponsavel().add(novoFuncionario);


    }




    @Override
    public String toString() {
        return " \n Imovel" +
                "\n Endereco: " + endereco +
                "\n Valor aluguel R$: " + valorAluguel +
                "\n Lista de moradores: " + listaMoradores +
                "\n Funcionario responsavel: " + funcionarioResponsavel;
    }



}


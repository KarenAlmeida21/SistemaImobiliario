package Sistema_Imobiliario;


import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valor_aluguel;
    public List<Morador> lista_moradores = new ArrayList<>();
    public List<Funcionario> funcionario_responsavel = new ArrayList<>();

    public Imovel() {
    }

    public Imovel(String endereco, double valor_aluguel) {
        this.endereco = endereco;
        this.valor_aluguel = valor_aluguel;


    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor_aluguel() {
        return valor_aluguel;
    }

    public void setValor_aluguel(double valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    public List<Morador> getLista_moradores() {
        return lista_moradores;
    }

    public void setLista_moradores(List<Morador> lista_moradores) {
        this.lista_moradores = lista_moradores;
    }

    public List<Funcionario> getFuncionario_responsavel() {
        return funcionario_responsavel;
    }

    public void setFuncionario_responsavel(List<Funcionario> funcionario_responsavel) {
        this.funcionario_responsavel = funcionario_responsavel;
    }

    @Override
    public String toString() {
        return "Imovel" +
                "\t Endereco: " + endereco +
                "\t Valor aluguel R$: " + valor_aluguel +
                "\t Lista de moradores: " + lista_moradores +
                "\t Funcionario responsavel: " + funcionario_responsavel;
    }

    public void adicionar_morador(Morador novo_morador) {

        Morador morador = novo_morador;
        lista_moradores.add(morador);


    }


    public void adicionar_funcionario(Funcionario novo_funcionario) {
        funcionario_responsavel.add(novo_funcionario);


    }

}


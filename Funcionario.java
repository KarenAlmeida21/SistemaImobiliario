package SistemaImobiliario;

public class Funcionario {
    String nome;
    String cpf;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario:" +
                "\nNome:" + nome +
                "\n CPF:"+ cpf;

    }
}

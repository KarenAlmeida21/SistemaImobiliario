package SistemaImobiliario;



public class Morador {
  String nome;
  String cpf;

    public Morador() {
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
        return "\nMorador:" + nome +
                "\nCPF:" + cpf;
    }
}
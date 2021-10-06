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



    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nMorador:" + nome +
                "\nCPF:" + cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
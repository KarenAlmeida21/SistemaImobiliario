package listas_composicao27;



public class Morador {
    private String nome;

    public Morador() {
    }

    public Morador(String nome) {
        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

}
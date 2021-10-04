package SistemaImobiliario;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    public List <Imovel> listaImoveis = new ArrayList<>();

    public Imobiliaria() {
    }

    public List<Imovel> getListaImoveis() {
        return listaImoveis;
    }

    public void setListas_imoveis(List<Imovel> listas_imoveis) {
        this.listaImoveis = listas_imoveis;
    }
    public Imovel cadastrar_imovel(Imovel novoImovel){
        this.listaImoveis.add(novoImovel);
        return novoImovel;
    }

    @Override
    public String toString() {
        return "Imobiliaria: " +
                "\t Listas de imovéis: " + listaImoveis;

    }

    }

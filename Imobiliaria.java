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



    public Imovel cadastrarImovel(Imovel novoImovel){
        this.listaImoveis.add(novoImovel);
        return novoImovel;
    }

    @Override
    public String toString() {
        return "Imobiliaria: " +
                "\n Listas de imovéis: " + listaImoveis;

    }

    }

package listas_composicao27;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    public List <Imovel> listas_imoveis = new ArrayList<>();

    public Imobiliaria() {
    }

    public List<Imovel> getListas_imoveis() {
        return listas_imoveis;
    }

    public void setListas_imoveis(List<Imovel> listas_imoveis) {
        this.listas_imoveis = listas_imoveis;
    }
    public Imovel cadastrar_imovel(Imovel novo_imovel){
        this.listas_imoveis.add(novo_imovel);
        return novo_imovel;
    }
}

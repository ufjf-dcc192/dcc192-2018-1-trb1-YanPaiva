/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.Dados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YanNotebook
 */
public class Estoque {
    private List<Itens> estoque;

    public Estoque() {
        estoque = new ArrayList<Itens>();
        Itens aux = new Itens();
        for(int i=0;i<15;i++){
            aux.setPreco((float)Math.random());
            aux.setDescricaoDoProduto("iten "+i);
            aux.setCodigoDoProduto(i+1);
            estoque.add(aux);
        }
        
    }
    
}

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

    private static List<Itens> estoque;

    public static List<Itens> getItensEstoque() {
        if (estoque == null) {
            estoque = new ArrayList<>();
            for (int i = 0; i <= 4; i++) {
                estoque.add(new Itens((Double) 1.2 * (i+1), "iten " + i, i + 1, "intem......."));
            }
            return estoque;
        }
        return estoque;
    }

    public static Itens getInstanceById(Integer id) {
        if (estoque == null) {
            getItensEstoque();
        }
        return estoque.get(id);

    }

    public static Itens getInstanceByName(String name) {
        int i;
        for (i = 0; !name.equals(estoque.get(i).getNome()); i++);
        return estoque.get(i);

    }
}

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
public class Pedido {

    private static List<Itens> pedido;

    public static List<Itens> getItensEstoque() {
        if (pedido == null) {
            pedido = new ArrayList<>();
            return pedido;
        }
        return pedido;
    }

    public static Itens getInstanceById(Integer id) {
        if (pedido == null) {
            getItensEstoque();
        }
        return pedido.get(id);

    }

    public static Itens getInstanceByName(String name) {
        int i;
        for (i = 0; !name.equals(pedido.get(i).getNome()); i++);
        return pedido.get(i);

    }
}
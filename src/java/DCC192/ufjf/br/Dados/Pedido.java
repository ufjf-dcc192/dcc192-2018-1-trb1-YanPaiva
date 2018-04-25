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

    private static ArrayList<Itens> pedido;

    public static ArrayList<Itens> getItensEstoque() {
        if (pedido == null) {
            pedido = new ArrayList<>();
            return pedido;
        }
        return pedido;
    }
    public static void limpaArray(){
        pedido.removeAll(pedido);
    }
    public static int getIndiceByName(String name) {
        int i =0;
        if (pedido.size() != 0) {
            for (i =0; !name.equals(pedido.get(i).getNome())
                    && i < pedido.size(); i++);
        }
        if (i == pedido.size()) {
            return -1;
        }
        return i;
    }

    public static Itens getInstanceById(Integer id) {
        if (pedido == null) {
            getItensEstoque();
        }
        return pedido.get(id);

    }

}

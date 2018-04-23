/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.Dados;

import java.util.List;

/**
 *
 * @author YanNotebook
 */
public class RestauranteDeVo {

    private static List<Mesas> mesasDoRestaurante;
    private static Estoque estoque = new Estoque();

    public static List<Mesas> getInstance() {
        for (int i = 0; i < 10; i++) {
            mesasDoRestaurante.add(new Mesas(i, "Mesa"+ i));
        }
        return mesasDoRestaurante;
    }
}

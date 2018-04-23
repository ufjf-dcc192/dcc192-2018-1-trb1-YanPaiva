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
public class Restaurante {

    private static List<Mesas> restaurante;
  
    public static List<Mesas> getMesasRestaurante() {
        if (restaurante == null) {
            restaurante = new ArrayList<>();
            for (int i = 0; i <= 5; i++) {
                restaurante.add(new Mesas(i));
            }
            return restaurante;
        }
        return restaurante;
    }
}

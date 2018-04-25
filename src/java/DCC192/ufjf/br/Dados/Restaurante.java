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

    private static ArrayList<Mesas> restaurante;
  
    public static ArrayList<Mesas> getMesasRestaurante() {
        if (restaurante == null) {
            restaurante = new ArrayList<>();
            for (int i = 0; i <= 5; i++) {
                restaurante.add(new Mesas(i));
            }
            return restaurante;
        }
        return restaurante;
    }
    
    public static Mesas getInstanceById(Integer id) {
        if(restaurante == null) {
            getMesasRestaurante();
        }
        return restaurante.get(id);
    }
    public static int getIndiceByMesa(Mesas buscando){
        int i;
       // for(i=0;buscando.get restaurante.get(i).getCodigo() ;i++)
       return 0;
    }
}

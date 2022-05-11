/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.umlacodigo;

import java.util.ArrayList;

/**
 *
 * @author adria
 */
class Pedido {
    private int total;
    private EstadoPedido estado;
    public LineaDePedido t_producto;
    
    public boolean cobrar(){
        return false;
    }
    public void servir(){
    }
    public void confirmar(){
    }
    public int obtener_total(){
        return 0;
    }
    public void obtener_detalle(){
    }
    public ArrayList<Cuenta> obtener_cuenta(){
        ArrayList<Cuenta> c = new ArrayList<>();
        return c;
    }
    public boolean anyadirProducto(Producto p, int num){
        return false;
    }
}

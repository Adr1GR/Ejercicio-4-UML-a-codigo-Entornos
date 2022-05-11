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
public class PedidoSimple extends Pedido{
    
    public Cuenta cuenta;
    
    public int obtener_total(){
        return 0;
    }
    public boolean cobrar(){
        return false;
    }
    public void obtener_detalle(){
    }
    public ArrayList<Cuenta> obtener_cuentas(){
        ArrayList<Cuenta> c = new ArrayList<>();
        return c;
    }
}

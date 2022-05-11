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
public class PedidoCompuesto extends Pedido{
    
    public ArrayList<Pedido> pedidos;
    
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
    public void anyadir_pedido(Pedido p){
    }
    public void eliminar_pedido(Pedido p){
    }
}

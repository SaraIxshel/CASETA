/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import entidad.Peaje;
import entidad.Vehiculo;

/**
 *
 * @author sarai
 */
public class Main {
    public static void main(String[] args){
        Peaje peaje = new Peaje();
        Vehiculo v1 = new Vehiculo();
        //Recibir el vehiculo
        peaje.recibirVehiculo(v1);
        //pagar peaje
        peaje.pagar(50);
        peaje.salirVehiculo();
        //Total recaudado
        System.out.println(peaje.totalRecaudado());
    }
}

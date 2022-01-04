/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author sarai
 */
public class Caseta {
    private Barrera barrera;
    private Caja caja;
    private Cajero cajero;
    
    public Caseta(){
        barrera = new Barrera();
        caja = new Caja();
        cajero = new Cajero();
    }

    void bajarBarrera() {
        barrera.bajarBarrera();
    }

    void pagar(int i) {
        //Cajero temporalmente tiene el dinero
        cajero.recibirDinero(i);
        caja.guardarDinero(cajero.entregarDinero());
        barrera.levantarBarrera();
    }

    int totalRecaudado() {
      return caja.obtenerMonto();
    }

    
}

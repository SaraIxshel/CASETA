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
public class Peaje {
    private Caseta caseta;
    private Vehiculo vehiculo;
    
    public Peaje(){
        caseta = new Caseta();
        caseta.bajarBarrera(); 
    }

    public void recibirVehiculo(Vehiculo v1) {
        vehiculo = v1;
    }

    public void pagar(int i) {
        caseta.pagar(i);
    }

    public void salirVehiculo() {
        vehiculo = null;
        caseta.bajarBarrera();
    }

    public String totalRecaudado() {
        int total = caseta.totalRecaudado();
        return "El monto recaudado es " + total;
    }
}

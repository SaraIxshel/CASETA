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
public class Cajero {
    private String nombre;
    private int monto;

    void recibirDinero(int i) {
        monto = i;
    }
    
    int entregarDinero(){
        //Cajero dejo de tener temporalmente el dinero
        int dinero = monto;
        monto = 0;
        return dinero;
    }
}

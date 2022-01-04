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
public class Caja {
    private int monto;
    
    public Caja(){
        monto = 0;
    }

    void guardarDinero(int entregarDinero) {
        monto = monto + entregarDinero;
    }

    int obtenerMonto() {
        return monto;
    }
    
}

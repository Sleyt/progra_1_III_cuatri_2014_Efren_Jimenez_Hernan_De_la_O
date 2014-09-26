/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg2;

/**
 *
 * @author COMPAQ
 */
public class CuentaBancaria {
private double saldoInicial;
private boolean hayError;

public CuentaBancaria()
        
{
    saldoInicial=0;
    hayError=false;
    
}

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public boolean isHayError() {
        return hayError;
    }

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

}

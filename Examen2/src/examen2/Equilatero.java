/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author ESFOT
 */
public class Equilatero implements Figuras {

    private int txtLadoEqui;
    
        @Override
    public double calcularPerimetro() {
        return (txtLadoEqui*3);
    }

    @Override
    public double calcularArea() {
        return 0.0;
    }

    @Override
    public double calcularAltura() {
        return 0.0;
    }
    
}

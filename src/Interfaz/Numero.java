/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author HECTOR MAURICIO
 */
public class Numero {
    
    private int numero;
    private Numero siguiente;

    public Numero(int numero) {
        this.numero = numero;
        this.siguiente = siguiente;
    }

    public Numero() {
        this.numero = 0;
        this.siguiente = null;
    }
    
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Numero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Numero siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}

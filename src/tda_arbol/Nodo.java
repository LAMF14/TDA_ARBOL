/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_arbol;

/**
 *
 * @author hectorguevarapinto
 */
public class Nodo {

    

    private int hijo_mas_izquierdo;
    private Object dato;
    private int hermano_derecho;

    /**
     * @return the hijo_mas_izquierdo
     */
    public int getHijo_mas_izquierdo() {
        return hijo_mas_izquierdo;
    }

    /**
     * @param hijo_mas_izquierdo the hijo_mas_izquierdo to set
     */
    public void setHijo_mas_izquierdo(int hijo_mas_izquierdo) {
        this.hijo_mas_izquierdo = hijo_mas_izquierdo;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    /**
     * @return the hermano_derecho
     */
    public int getHermano_derecho() {
        return hermano_derecho;
    }

    /**
     * @param hermano_derecho the hermano_derecho to set
     */
    public void setHermano_derecho(int hermano_derecho) {
        this.hermano_derecho = hermano_derecho;
    }
   
    
    @Override
    public String toString()
    {
        return "            "+hijo_mas_izquierdo+ "            "+dato+"        "+hermano_derecho;
    }

}

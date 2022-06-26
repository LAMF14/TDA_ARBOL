/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_arbol;

import java.util.ArrayList;

/**
 *
 * @author hectorguevarapinto
 */
public class Cursor {

    private int raiz;
    private boolean[] Memoria = new boolean[15];
    private Nodo[] arreglo_arbol = new Nodo[15];

    public Cursor() {
        for (int i = 0; i < Memoria.length; i++) {
            Memoria[i] = true;
        }
        for (int i = 0; i < arreglo_arbol.length; i++) {
            arreglo_arbol[i] = new Nodo();
            arreglo_arbol[i].setHijo_mas_izquierdo(-1);
            arreglo_arbol[i].setHermano_derecho(-1);
   
        }

        raiz = -1;
    }

    public int asigna_memoria() {
        for (int i = 0; i < Memoria.length; i++) {
            if (Memoria[i] == true) {
                Memoria[i] = false;
                return i;
            }

        }

        return -1;
    }

    public int getRaiz() {
        return raiz;
    }

    public void setRaiz(int raiz) {
        this.raiz = raiz;
    }

    public boolean getMemoria(int i) {
        return Memoria[i];
    }

    public void setMemoria(boolean b, int i) {
        this.Memoria[i] = b;
    }

    public int getArreglo_arbol_izq(int i) {
        return arreglo_arbol[i].getHijo_mas_izquierdo();
    }

    public int getArreglo_arbol_der(int i) {
        return arreglo_arbol[i].getHermano_derecho();
    }

    public Object getArreglo_arbol_dato(int i) {
        return arreglo_arbol[i].getDato();
    }


    public void setArreglo_arbol_izq(int izq, int i) {
        this.arreglo_arbol[i].setHijo_mas_izquierdo(izq);
    }

    public void setArreglo_arbol_der(int der, int i) {
        this.arreglo_arbol[i].setHermano_derecho(der);
    }

    public void setArreglo_arbol_dato(Object o, int i) {
        this.arreglo_arbol[i].setDato(o);
    }


    public void lista() {
        System.out.println("Cubeta   hijo-mas-izquierdo       Etiqueta     Hermano-Derecho");
        for (int i = 0; i < arreglo_arbol.length; i++) {
            System.out.println(i + " ---> " + arreglo_arbol[i].toString());

        }
    }

    public void limpiaMemoria() {
        for (int i = 0; i < Memoria.length; i++) {
            Memoria[i] = true;
        }
    }

    public int get_papa(int n) {
        int i;
        ArrayList<Integer> padres = new ArrayList<>();
        for (int p = 0; p < arreglo_arbol.length; p++) {
            if (arreglo_arbol[p].getHijo_mas_izquierdo() != -1) {
                padres.add(p);
            }
        }
        int sigue;
        for(int papa : padres){
            sigue = arreglo_arbol[papa].getHijo_mas_izquierdo();
            if(sigue == n)
                return papa;
            while (sigue != -1) {                
               sigue = arreglo_arbol[sigue].getHermano_derecho();
               if(sigue == n)
                   return papa;
            }
        }
        return -1;
    }

}

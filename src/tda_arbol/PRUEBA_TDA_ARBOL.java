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
public class PRUEBA_TDA_ARBOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol mi_arbol = new Arbol();
        mi_arbol.CREA3("RAIZ", mi_arbol.CREA0("ARBOL 1"), mi_arbol.CREA0("ARBOL 2"),mi_arbol.CREA2("ARBOL 3",mi_arbol.CREA0("ARBOL 4"),mi_arbol.CREA0("ARBOL 5")));
        System.out.println("La raiz del arbol esta en la cuebeta "+mi_arbol.RAIZ()+" del arreglo de registros\n\n");
        mi_arbol.visualizar();
        System.out.println("\n\n++++++++++++++++++++++++++++RECORRIDO EN ORDEN PREVIO+++++++++++++++++++++++++++++++++");
        mi_arbol.ORD_PRE(mi_arbol.RAIZ());
        System.out.println("\n+++++++++++++++++++++++++++RECORRIDO EN ORDEN POSTERIOR+++++++++++++++++++++++++++++++");
        mi_arbol.ORD_POS(mi_arbol.RAIZ());
        System.out.println("\n+++++++++++++++++++++++++++RECORRIDO EN ORDEN SIMETRICO+++++++++++++++++++++++++++++++");
        mi_arbol.ORD_SIM(mi_arbol.RAIZ());
        System.out.println("\n\n=====================FINAL DE LAS PRUEBAS=====================");
        
          Arbol personas = new Arbol();
        personas.CREA4("Carlos", personas.CREA2("Maria", personas.CREA0("Jose"), personas.CREA0("Laura")), personas.CREA0("Juan"), personas.CREA3("Pedro", personas.CREA0("Rosa"), personas.CREA2("Ana",personas.CREA0("Mario"),personas.CREA0("Karla")),personas.CREA0("Luis") ),personas.CREA0("Tania"));
        System.out.println("La raiz del arbol esta en la cuebeta " + personas.RAIZ() + " del arreglo de registros\n\n");
        personas.visualizar();
        System.out.println("\n\n++++++++++++++++++++++++++++RECORRIDO EN ORDEN PREVIO+++++++++++++++++++++++++++++++++");
        personas.ORD_PRE(personas.RAIZ());
        System.out.println("\n+++++++++++++++++++++++++++RECORRIDO EN ORDEN POSTERIOR+++++++++++++++++++++++++++++++");
        personas.ORD_POS(personas.RAIZ());
        System.out.println("\n+++++++++++++++++++++++++++RECORRIDO EN ORDEN SIMETRICO+++++++++++++++++++++++++++++++");
        personas.ORD_SIM(personas.RAIZ());
        System.out.println("\n\n=====================FINAL DE LAS PRUEBAS=====================\n\n");

        System.out.println("el arbol personas tiene " + personas.Niveles(personas.RAIZ()) + " Niveles.");

        
       
    }
    
    
}

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
public class Arbol implements OperacionesARBOL {

    private Cursor arbol = new Cursor();

  /*  @Override
    public int PADRE(int n) {
        return arbol.getArreglo_arbol_padre(n);
    } */
    
     @Override
    public int PADRE(int n) {
      return arbol.get_papa(n);
    }

    @Override
    public int HIJO_MAS_IZQ(int n) {
        return arbol.getArreglo_arbol_izq(n);
    }

    @Override
    public int HERMANO_DER(int n) {
        return arbol.getArreglo_arbol_der(n);
    }

    @Override
    public Object ETIQUETA(int n) {
        return arbol.getArreglo_arbol_dato(n);
    }

    @Override
    public int RAIZ() {
        return arbol.getRaiz();
    }

    @Override
    public void ANULA() {
        arbol.setRaiz(-1);
        arbol.limpiaMemoria();
    }

    @Override
    public int CREA0(Object v) {
        int disp;
        disp = arbol.asigna_memoria();
        arbol.setArreglo_arbol_dato(v, disp);
        arbol.setRaiz(disp);
        return disp;
    }

    @Override
    public int CREA1(Object v, int A1) {
        int temp, disp;
        disp = arbol.asigna_memoria();
        temp = disp;
        arbol.setArreglo_arbol_izq(A1, temp);
        arbol.setArreglo_arbol_dato(v, temp);
        arbol.setRaiz(temp);
        return temp;
    }

    @Override
    public int CREA2(Object v, int A1, int A2) {
        int temp, disp;
        disp = arbol.asigna_memoria();
        temp = disp;
        arbol.setArreglo_arbol_izq(A1, temp);
        arbol.setArreglo_arbol_dato(v, temp);
        arbol.setArreglo_arbol_der(-1, temp);
        arbol.setArreglo_arbol_der(A2, A1);
        arbol.setRaiz(temp);
        return temp;
    }

    @Override
    public int CREA3(Object v, int A1, int A2, int A3) {
        int temp, disp;
        disp = arbol.asigna_memoria();
        temp = disp;
        arbol.setArreglo_arbol_izq(A1, temp);
        arbol.setArreglo_arbol_dato(v, temp);
        arbol.setArreglo_arbol_der(-1, temp);
        arbol.setArreglo_arbol_der(A2, A1);
        arbol.setArreglo_arbol_der(A3, A2);
        arbol.setRaiz(temp);
        return temp;
    }

    @Override
    public int CREA4(Object v, int A1, int A2, int A3, int A4) {
        int temp, disp;
        disp = arbol.asigna_memoria();
        temp = disp;
        arbol.setArreglo_arbol_izq(A1, temp);
        arbol.setArreglo_arbol_dato(v, temp);
        arbol.setArreglo_arbol_der(-1, temp);
        arbol.setArreglo_arbol_der(A2, A1);
        arbol.setArreglo_arbol_der(A3, A2);
        arbol.setArreglo_arbol_der(A4, A3);
        arbol.setRaiz(temp);
        return temp;
    }

    @Override
    public int CREA5(Object v, int A1, int A2, int A3, int A4, int A5) {
        int temp, disp;
        disp = arbol.asigna_memoria();
        temp = disp;
        arbol.setArreglo_arbol_izq(A1, temp);
        arbol.setArreglo_arbol_dato(v, temp);
        arbol.setArreglo_arbol_der(-1, temp);
        arbol.setArreglo_arbol_der(A2, A1);
        arbol.setArreglo_arbol_der(A3, A2);
        arbol.setArreglo_arbol_der(A4, A3);
        arbol.setArreglo_arbol_der(A5, A4);
        arbol.setRaiz(temp);
        return temp;
    }

    @Override
    public int CREA6(Object v, int A1, int A2, int A3, int A4, int A5, int A6) {
        int temp, disp;
        disp = arbol.asigna_memoria();
        temp = disp;
        arbol.setArreglo_arbol_izq(A1, temp);
        arbol.setArreglo_arbol_dato(v, temp);
        arbol.setArreglo_arbol_der(-1, temp);
        arbol.setArreglo_arbol_der(A2, A1);
        arbol.setArreglo_arbol_der(A3, A2);
        arbol.setArreglo_arbol_der(A4, A3);
        arbol.setArreglo_arbol_der(A5, A4);
        arbol.setArreglo_arbol_der(A6, A5);
        arbol.setRaiz(temp);
        return temp;
    }

    @Override
    public int CREA7(Object v, int A1, int A2, int A3, int A4, int A5, int A6, int A7) {
        int temp, disp;
        disp = arbol.asigna_memoria();
        temp = disp;
        arbol.setArreglo_arbol_izq(A1, temp);
        arbol.setArreglo_arbol_dato(v, temp);
        arbol.setArreglo_arbol_der(-1, temp);
        arbol.setArreglo_arbol_der(A2, A1);
        arbol.setArreglo_arbol_der(A3, A2);
        arbol.setArreglo_arbol_der(A4, A3);
        arbol.setArreglo_arbol_der(A5, A4);
        arbol.setArreglo_arbol_der(A6, A5);
        arbol.setArreglo_arbol_der(A7, A6); 
        arbol.setRaiz(temp);
        return temp;
    }

    
    @Override
    public int CREA(Object v, int... A) {
        int temp, disp;
        disp = arbol.asigna_memoria();
        temp = disp;
        arbol.setArreglo_arbol_izq(A[0], temp);
        arbol.setArreglo_arbol_dato(v, temp);
        arbol.setArreglo_arbol_der(-1, temp);
        for (int i = 0;i<A.length-1;i++) {
            arbol.setArreglo_arbol_der(A[i+1], A[i]);
        }
        arbol.setRaiz(temp);
        return temp;
    }
    
    @Override
    public int CREA(Object v) {
        int disp;
        disp = arbol.asigna_memoria();
        arbol.setArreglo_arbol_dato(v, disp);
        arbol.setRaiz(disp);
        return disp;
    }

    public void visualizar() {
        arbol.lista();
    }

    @Override
    public void ORD_PRE(int n) {

        int c;

        System.out.print(arbol.getArreglo_arbol_dato(n) + " , ");
        c = arbol.getArreglo_arbol_izq(n);
        while (c != -1) {
            ORD_PRE(c);
            c = arbol.getArreglo_arbol_der(c);
        }
    }

    @Override
    public void ORD_POS(int n) {
        int c;

        c = arbol.getArreglo_arbol_izq(n);
        while (c != -1) {
            ORD_POS(c);
            c = arbol.getArreglo_arbol_der(c);
        }
        System.out.print(arbol.getArreglo_arbol_dato(n) + " , ");

    }

    @Override
    public void ORD_SIM(int n) {
        int c;

        if (arbol.getArreglo_arbol_izq(n) == -1) {
            System.out.print(arbol.getArreglo_arbol_dato(n) + " , ");
        } else {
            ORD_SIM(arbol.getArreglo_arbol_izq(n));
            System.out.print(arbol.getArreglo_arbol_dato(n) + " , ");
            c = arbol.getArreglo_arbol_der(arbol.getArreglo_arbol_izq(n));
            while (c != -1) {
                ORD_SIM(c);
                c = arbol.getArreglo_arbol_der(c);
            }
        }
    }
    
    @Override
    public int Niveles (int n){
        int niv = 0;
        int c;
        c = arbol.getArreglo_arbol_izq(n);
        while (c != -1) {
            Niveles(c);
            c = arbol.getArreglo_arbol_der(c);
            niv++;
        }
        return niv;
    }

}

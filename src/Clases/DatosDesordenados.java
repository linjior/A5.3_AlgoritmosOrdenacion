/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author linji
 */
public class DatosDesordenados {

    int i, j, temporal, pasadas;

    public DatosDesordenados() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    //Metodo burbuja version 1
    public void burbuja(int[] arreglo) {
        pasadas = 0;
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en " + pasadas + " Pasadas");
    }

    //Metodo burbuja version 2
    public void burbija2(int[] arreglo) {
        pasadas = 0;
        for (i = 1; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en " + pasadas + " Pasadas");
    }

    //Metodo Radix
    public String Radix(int[] arreglo) {
        int x, i, j;

        for (x = Integer.SIZE - 1; x >= 0; x--) {//menon menos o mas mas
            int auxiliar[] = new int[arreglo.length];
            j = 0;
            for (i = 0; i < arreglo.length; i++) {
                boolean mover = arreglo[i] << x >= 0;//Si x<=0 devuelves un true o in false para asignar a este arreglo en la posicion i que se llama mover
                /*
                 *if(x>y){
                    mayor=x;
                 }else{
                    mayor=y;
                 }
                 Operador Ternario ?
                 resultado=(condicion)? valor1:valor2
                 mayor=(x>y)?x:y;
                 */
                if (x == 0 ? !mover : mover) {
                    auxiliar[j] = arreglo[i];
                    j++;
                } else {
                    arreglo[i - j] = arreglo[i];
                }
            }
            for (i = j; i < auxiliar.length; i++) {
                auxiliar[i] = arreglo[i - j];
            }
            arreglo = auxiliar;
        }
        System.out.println("El arreglo ordenado con Radix es: ");
        return mostrarArreglo(arreglo);
    }

    public String mostrarArreglo(int[] arreglo) {
        int k;
        String cadena = "";
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]" + "\n");
            cadena = cadena + (k + 1) + "----->" + "[" + arreglo[k] + "]" + "\n";
        }
        System.out.println("");
        return cadena;
    }
}

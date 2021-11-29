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
public class GeneradorNumeros {
    private int nNumeros , s;
    private int [] arreglo;

    public GeneradorNumeros(int n, int s) {
        this.arreglo = new int[n]; 
        this.nNumeros = n;
        this.s = s;
    }

    public int getnNumeros() {
        return nNumeros;
    }

    public void setnNumeros(int nNumeros) {
        this.nNumeros = nNumeros;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public int[] generarNumeros(){
        this.arreglo = new int[nNumeros];
        for (int i=0; i<nNumeros; i++){
            arreglo[i] = (int)(Math.random() * s) + 1;
        }
        return arreglo;
    }
    
    public String listaDesordenada(){
        this.arreglo = new int[nNumeros];
        String cadena = "";
        for (int i=0; i<nNumeros; i++){
            arreglo[i] = (int)(Math.random() * s) + 1;
            cadena = cadena + (i+1) + "--->"+ arreglo[i]+"\n";
        }
        return cadena;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.nim;

import java.util.ArrayList;

/**
 *
 * @author GCM-Ataks
 */
public class generarArbol extends ArrayList{
        int[] pila;
        int apunSig=0,apunCima=0;
        public void generarArbol(){
            pila = new int[1000];
            agregarPila(7,0,0);
        }
    public void agregarPila(int can, int ret, int pad){ 
        for(int a=1;a<=3;a++){
            if(a==1)
                pila[apunCima]=can;
            else if(a==2)
                pila[apunCima]=ret;
            else
                pila[apunCima]=pad;  
            apunCima++;
        }
    }

    public void evalArbol(){
        
    }
    
    public void sacarPila(int can, int ret, int pad){
            
    }

    public void heuristicaUno(int can){

    }

    public void heuristicaDos(int can){

    }

    public void heuristicaTres(int can){

    }
}
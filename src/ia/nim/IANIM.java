package ia.nim;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author GCM-Ataks
 */
public class IANIM {
    
    static int playerOne,PC;
    String player;
    static ArrayList<Integer> arreglo;
    
    public static void canQuit(int a, int play){
        play++;
        while(!arreglo.isEmpty()){
            if(playerOne<=2){
                
            }
        }
        gameSt();
    }
       
    public static void Start(){
        for(int a=1;a<=7;a++){
            
            System.out.println("a");
        }
        gameSt();
    }
    
public static void gameSt(){
        playerOne = 0;
        arreglo = new ArrayList<>();
        System.out.println("0 para SALIR");
        arreglo.add(1);
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduce el Numero de Pz a Eliminar \n");
        n = sc.nextInt();
        if(n>0&&n<7){
            for(int pnt =1; pnt<=arreglo.size(); pnt++){
                if(n==arreglo.get(pnt)){
                    System.out.println("eliminando el numero: " +pnt);
                    IANIM.canQuit(pnt,0);
                }
            }
            System.out.println(arreglo + " " + n);
        }
}
    public static void main(String[] args) {
        Start();
    }
}

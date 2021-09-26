/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion_colombia;

import java.util.Scanner;
import jugador.Jugador;

/**
 *
 * @author migue
 */
public class Seleccion_colombia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        int contador = 0;
        
        Jugador [] jugadores=new Jugador[3];
        
        do
        {
            System.out.println("Bienbenido");
            System.out.println("****************************");
            System.out.println("1. Agregar un jagador");
            System.out.println("2. Buscar un jugador por el numero");
            System.out.println("3. Editar a un jugador");
            System.out.println("4. Mostrar toda la convocatoria de jugadores");
            System.out.println("5. Salir");
            
            System.out.println("Digite la opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    jugadores[contador]=new Jugador();
                    System.out.println("Digite el id del jugador");
                    jugadores[contador].setID(entrada.nextInt());
                    System.out.println("Digite el Nombre del jugador");
                    jugadores[contador].setNombre(entrada.next());
                    System.out.println("Digite el Apellido del jugador");
                    jugadores[contador].setApalleido(entrada.next());
                    System.out.println("Digite la edad del jugador");
                    jugadores[contador].setEdad(entrada.next());
                    System.out.println("Digite la posicion del jugador");
                    jugadores[contador].setPosicion(entrada.next());
                    System.out.println("Digite el numero del jugador");
                    jugadores[contador].setNumero(entrada.next());
                    System.out.println("Digite el nombre del equipo del jugador");
                    jugadores[contador].setNombre_del_Equio(entrada.next());
                    break;
                case 2:
                    System.out.println("Digite la posicion del jugador");
                    
                    
                    
                    break;
                    
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion!=5);
        
    }
    
}

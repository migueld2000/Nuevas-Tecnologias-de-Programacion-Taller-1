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
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int contador=0;
        
        Jugador[] jugadores=new Jugador[23];
        do{
            System.out.println("Bienvenidos");
            System.out.println("***********");
            System.out.println("1.Agregar Jugador");
            System.out.println("2.Buscar Jugador");
            System.out.println("3.Editar Jugador");
            System.out.println("4.Mostar Jugadores");
            System.out.println("5.Salir");
            
            System.out.println("Digite una opcion");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    jugadores[contador]=new Jugador();
                    
                    System.out.println("Digite id:");
                    jugadores[contador].setId(entrada.nextInt());
                    System.out.println("Digite nombre:");
                    jugadores[contador].setNombre(entrada.next());
                    System.out.println("Digite Apellido:");
                    jugadores[contador].setApellido(entrada.next());
                    System.out.println("Digite Posicion:");
                    System.out.println("Digite el numero de la camisa");
                    jugadores[contador].setNumero(entrada.nextInt());
                    jugadores[contador].setPosicion(entrada.next());
                    System.out.println("Digite Edad:");
                    jugadores[contador].setEdad(entrada.nextInt());
                    System.out.println("Digite Equipo:");
                    jugadores[contador].setEquipo(entrada.next());
                    contador++;
                    
                    break;  
                case 2:
                    boolean jugador = true;
                    System.out.println("Digite el camiseta jugador a buscar");
                    int camisetaabuscar=entrada.nextInt();
                    
                    for(int i=0; i<contador; i++){
                        if(camisetaabuscar==jugadores[i].getNumero()){
                            System.out.println("el jugador existe:");
                            
                            break;
                        }else{
                            System.out.println("el jugador no existe:");
                            break;
                        }
                    }
                   
                    
                    break;
          
                case 3: 
                   boolean Jugador = true;
                    System.out.println("Digite el  jugador a editar");
                    int editjugador =entrada.nextInt();
                    
                    for(int i=0; i<contador; i++){
                        if(editjugador==jugadores[i].getNumero()){
                            System.out.println("Digite id:");
                            jugadores[i].setId(entrada.nextInt());
                            System.out.println("dita el nuevo nombre");
                            jugadores[i].setNombre(entrada.next());
                            System.out.println("Digite nuevo apellido:");
                            jugadores[i].setApellido(entrada.next());
                            System.out.println("Digite la nueva posicion:");
                            jugadores[i].setPosicion(entrada.next());
                            System.out.println("Digite el nuevo numero de la camisa");
                            jugadores[i].setNumero(entrada.nextInt());
                            System.out.println("Digite la nueva edad:");
                            jugadores[i].setEdad(entrada.nextInt());
                            System.out.println("Digite el nuevo equipo:");
                            jugadores[i].setEquipo(entrada.next());
                            break;
                        }else{
                            System.out.println("el jugador no editado:");
                            break;
                        }
                    }
                    
                    break;
                case 4:
                    for(int i=0; i<contador; i++){
                    System.out.println(jugadores[i].getId());    
                    System.out.println(jugadores[i].getNombre());
                    System.out.println(jugadores[i].getApellido());
                    System.out.println(jugadores[i].getPosicion());
                    System.out.println(jugadores[i].getNumero());
                    System.out.println(jugadores[i].getEdad());
                    System.out.println(jugadores[i].getEquipo());
                        
                        
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
               
                 
            
            
            }
            
        }while(opcion!=5);{
        
        
    }
        
    }
    
}

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
                    System.out.println("Digite Numcamisa");
                    jugadores[contador].setNumcamisa(entrada.nextInt());
                    System.out.println("Digite nombre:");
                    jugadores[contador].setnombre(entrada.next());
                    System.out.println("Digite Apellido:");
                    jugadores[contador].setApellido(entrada.next());
                    System.out.println("Digite Posicion:");
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
                        if(camisetaabuscar==jugadores[i].getNumcamisa()){
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
                        if(editjugador==jugadores[i].getNumcamisa()){
                            System.out.println("Digite id:");
                            jugadores[i].setId(entrada.nextInt());
                            System.out.println("Digite Numcamisa");
                            jugadores[i].setNumcamisa(entrada.nextInt());
                            System.out.println("dita el nuevo nombre");
                            jugadores[i].setnombre(entrada.next());
                            System.out.println("Digite Apellido:");
                            jugadores[i].setApellido(entrada.next());
                            System.out.println("Digite Posicion:");
                            jugadores[i].setPosicion(entrada.next());
                            System.out.println("Digite Edad:");
                            jugadores[i].setEdad(entrada.nextInt());
                            System.out.println("Digite Equipo:");
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
                    System.out.println(jugadores[i].getNumcamisa());
                    System.out.println(jugadores[i].getnombre());
                    System.out.println(jugadores[i].getApellido());
                    System.out.println(jugadores[i].getPosicion());
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

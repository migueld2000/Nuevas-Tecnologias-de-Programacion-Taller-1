/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author migue
 */
public class Jugador {

    private int id;
    private int Numcamisa;
    private String nombre;
    private String apellido;
    private String posicion;
    private int edad;
    private String equipo;

    public Jugador() {
    }
    
    public Jugador(int id, int Numcamisa, String nombre, String apellido, String posicion, int edad, String equipo) {
        this.id = id;
        this.Numcamisa = Numcamisa;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.edad = edad;
        this.equipo = equipo;
    }
     //GET Y SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumcamisa() {
        return Numcamisa;
    }

    public void setNumcamisa(int Numcamisa) {
        this.Numcamisa = Numcamisa;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
    public int buscarNumcamisa(){
 
        return(0);    
    
}

    
    
    
}  

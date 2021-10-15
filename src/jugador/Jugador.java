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
    private int Numero;
    private String Nombre;
    private String Apellido;
    private String Posicion;
    private int Edad;
    private String Equipo;

    public Jugador() {
    }

    public Jugador(int id, int Numero, String Nombre, String Apellido, String Posicion, int Edad, String Equipo) {
        this.id = id;
        this.Numero = Numero;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Posicion = Posicion;
        this.Edad = Edad;
        this.Equipo = Equipo;
    }

    
    
     //GET Y SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int buscarNumero(){
 
        return(0);
    }

}  

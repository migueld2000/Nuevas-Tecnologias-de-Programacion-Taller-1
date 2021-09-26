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

    private int ID;
    private String Nombre;
    private String Apalleido;
    private String Edad;
    private String Posicion;
    private String Numero;
    private String Nombre_del_Equio;

    public Jugador() {
    }

    public Jugador(int ID, String Nombre, String Apalleido, String Edad, String Posicion, String Numero, String Nombre_del_Equio) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apalleido = Apalleido;
        this.Edad = Edad;
        this.Posicion = Posicion;
        this.Numero = Numero;
        this.Nombre_del_Equio = Nombre_del_Equio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApalleido() {
        return Apalleido;
    }

    public void setApalleido(String Apalleido) {
        this.Apalleido = Apalleido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getNombre_del_Equio() {
        return Nombre_del_Equio;
    }

    public void setNombre_del_Equio(String Nombre_del_Equio) {
        this.Nombre_del_Equio = Nombre_del_Equio;
    }

    
    
    
}  

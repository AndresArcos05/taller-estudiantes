/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class EstudiantesModelo {

    String Nombre, IDE, EnuevoNombre, nuevoID;

    public String getEnuevoNombre() {
        return EnuevoNombre;
    }

    public void setEnuevoNombre(String EnuevoNombre) {
        this.EnuevoNombre = EnuevoNombre;
    }

    public String getNuevoID() {
        return nuevoID;
    }

    public void setNuevoID(String nuevoID) {
        this.nuevoID = nuevoID;
    }

    public EstudiantesModelo(String Nombre, String ID) {
        this.Nombre = Nombre;
        this.IDE = IDE;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String ID) {
        this.IDE = IDE;
    }

}

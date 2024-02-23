/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

import Controlador.EstudianteControlador;
import Modelo.EstudiantesModelo;
import Vista.EstudianteVista;
import java.util.ArrayList;
import java.util.List;


public class Estudiantes {


    public static void main(String[] args) {
       
        List<EstudiantesModelo> estudiantes = new ArrayList<>();
        EstudianteVista vista = new EstudianteVista();
        EstudianteControlador cont = new  EstudianteControlador(vista, estudiantes);
        cont.iniciar();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.EstudiantesModelo;
import Vista.EstudianteVista;
import java.util.List;

/**
 *
 * @author El Pepe
 */
public class EstudianteControlador {

    private EstudianteVista vista;
    private EstudiantesModelo modelo;
    private final List<EstudiantesModelo> estudiantes;
    

    public EstudianteControlador(EstudianteVista vista, List<EstudiantesModelo> estudiantes) {
        this.vista = vista;
        this.estudiantes = estudiantes;

    }

    public void iniciar() {
        boolean salir = false;
        EstudiantesModelo estudiante = null;
        while (!salir) {
            int opcion = vista.MostrarMenu();
            switch (opcion) {
                case 1:
                    EstudiantesModelo nuevoEstudiante = vista.AgregarEstudiantes();
                    estudiantes.add(nuevoEstudiante);
                    break;
                case 2:
                    if (estudiante != null) {
                        estudiante = vista.ModificarEstudiante(estudiante);
                        vista.mostrarmensaje("se modifico");
                    } else {
                        vista.mostrarmensaje("No modificado");
                    }
                    break;
                case 3:
                    EstudiantesModelo estudianteAEliminar = vista.eliminarEstudiante(estudiantes);
                    if (estudianteAEliminar != null) {
                        estudiantes.remove(estudianteAEliminar);
                        vista.mostrarmensaje("Estudiante eliminado correctamente");
                    } else {
                        vista.mostrarmensaje("No se encontro ningun estudiante con esa ID.");
                    }
                    break;

                case 4:
                    vista.mostrarEstudiantes(estudiantes);
                    break;
                case 5:
                    vista.salir();
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

            }
        }
    }
}

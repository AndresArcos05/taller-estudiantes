/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.EstudiantesModelo;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author El Pepe
 */
public class EstudianteVista {

    private Scanner Leer;

    public EstudianteVista() {
        this.Leer = new Scanner(System.in);
    }

    public int MostrarMenu() {
        System.out.println("------------------------------------------------------");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Actualizar estudiante");
        System.out.println("3. eliminar estudiante");
        System.out.println("4. ver estudiante");
        System.out.println("5. Salir");
        System.out.print("Ingrese su opción: ");
        int opcion = Leer.nextInt();
        Leer.nextLine();
        return opcion;
    }

    public EstudiantesModelo AgregarEstudiantes() {
        System.out.println("------------------------------------------------------");
        System.out.println("Nombre del estudiante");
        String Nombre = Leer.nextLine();
        Leer.nextLine();
        System.out.println("id del estudiante");
        String IDE = Leer.nextLine();
        Leer.nextLine();
        return new EstudiantesModelo(Nombre, IDE);
    }

    public EstudiantesModelo ModificarEstudiante(EstudiantesModelo estudiante) {
        System.out.println("------------------------------------------------------");
        System.out.println("Nombre actual: " + estudiante.getNombre());
        System.out.println("ID actual: " + estudiante.getIDE());
        System.out.print("Ingrese el nombre del estudiante que desea modificar: ");
        String nombre = Leer.nextLine();
        System.out.print("Ingrese el nuevo nombre del estudiante: ");
        String nuevoNombre = Leer.nextLine();
        System.out.print("Ingrese el nuevo ID del estudiante: ");
        String nuevoID = Leer.nextLine();
        estudiante.setNombre(nuevoNombre);
        estudiante.setIDE(nuevoID);
        return estudiante;

    }
     public void mostrarEstudiantes(List<EstudiantesModelo> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes para mostrar.");
        } else {
            System.out.println("Estudiantes:");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i+1) + ". ID: " + estudiantes.get(i).getIDE() + ", Nombre: " + estudiantes.get(i).getNombre());
            }
        }
    }
    public String salir() {
        System.exit(0);
        return null;
    }
    public void mostrarmensaje(String mensaje) {
        System.out.println(mensaje);
    }
    public String recibirIdEliminar() {
        System.out.print("Ingrese la nombre del estudiante que desea eliminar: ");
        return Leer.nextLine();
    }

    public EstudiantesModelo eliminarEstudiante(List<EstudiantesModelo> estudiantes) {
        mostrarEstudiantes(estudiantes);

        String idEliminar = recibirIdEliminar();

        EstudiantesModelo estudianteAEliminar = null;
        for (EstudiantesModelo estudiante : estudiantes) {
            if (estudiante.getNombre().equals(idEliminar)) {
                estudianteAEliminar = estudiante;
                break;
            }
        }

        if (estudianteAEliminar != null) {
            mostrarmensaje("Estudiante eliminado correctamente: " + estudianteAEliminar.getNombre());
        } else {
            mostrarmensaje("No se encontro ningun estudiante con esa ID.");
        }

        return estudianteAEliminar;
    }
}

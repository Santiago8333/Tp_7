/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_7;

import java.awt.List;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;

/**
 *
 * @author santi
 */
public class Alumno {
    int legajo;
    String nombre;
    String apellido;


    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
      
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList materias) {
        this.materias = materias;
    }
   
ArrayList materias = new ArrayList();
    
    public void agregarMateria(){
        materias.add(Materia);
    }
    
    public void cantidadMaterias(){
       Iterator iter = materias.iterator();
while (iter.hasNext())
  System.out.println(iter.next());
}
}

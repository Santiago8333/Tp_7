/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_7;

/**
 *
 * @author santi
 */
public class Materia {
    int idMateria;
    String nmMateria;
    int año;

    public Materia(int idMateria, String nmMateria, int año) {
        this.idMateria = idMateria;
        this.nmMateria = nmMateria;
        this.año = año;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNmMateria() {
        return nmMateria;
    }

    public void setNmMateria(String nmMateria) {
        this.nmMateria = nmMateria;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}

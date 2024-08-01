/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosr;

public class ProgramaAcademico {
    //Atributos
    String matricula = "";
    String estatus = "";
    int grado = 0;
    String grupo = "";
    String nombre_programa = "";
    
    public ProgramaAcademico(){
        
    }
    
    public String mostrarDatosPrograma(){
        return ("\nPrograma Academico: "+nombre_programa+"\nMatricula: "+matricula+"\nEstatus: "+estatus+"\nGrado: "+grado+"\nGrupo: "+grupo);
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombre_programa() {
        return nombre_programa;
    }

    public void setNombre_programa(String nombre_programa) {
        this.nombre_programa = nombre_programa;
    }

    @Override
    public String toString() {
        return "ProgramaAcademico{" + "matricula=" + matricula + ", estatus=" + estatus + ", grado=" + grado + ", grupo=" + grupo + ", nombre_programa=" + nombre_programa + '}';
    }
}

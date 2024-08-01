/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author arace
 */
public class Alumno {
    private int id;
    private String alumno;
    private String ap;
    private String am;
    private String sexo;
    private Boolean estatus;
    private String fecha; 
    private int edad;
   private int matricula;
    private String programaacademico;
       ProgramaAcademico programa = new ProgramaAcademico();

    public Alumno(int id,String alumno, String ap, String am, String sexo, String fecha,String programaacademico, int matricula,Boolean estatus,int edad) {
        this.alumno = alumno;
        this.ap = ap;
        this.am = am;
        this.sexo = sexo;
        this.estatus = estatus;
        this.fecha = fecha;
        this.edad = edad;
        this.matricula= matricula;
        this.programaacademico = programaacademico;
    }

    public String getNombre() {
        return alumno;
    }

    public void setNombre(String nombre) {
        this.alumno = nombre;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
         
        this.sexo = sexo;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getProgramaacademico() {
        return programaacademico;
    }

    public void setProgramaacademico(String programaacademico) {
        this.programaacademico = programaacademico;
    }
    public ProgramaAcademico getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramaAcademico programa) {
        this.programa = programa;
    }
    
   
    @Override
    public String toString() {
        return "Alumno{" + "alumno=" + alumno + ", ap=" + ap + ", am=" + am + ", sexo=" + sexo + ", fechaNacimiento=" + fecha + ", edad=" + edad + ", carrera=" + programaacademico + ", matricula=" + matricula + ", estatus=" + estatus + '}';
    }
    public static void main(String[] args) {////////////////////////////////////////////////////////////////////////
        ViewRegistro registro = new ViewRegistro();
        registro.setVisible(true);
    }
    
    
    
      
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnosr;

import java.util.ArrayList;

/**
 *
 * @author arace
 */
public class ArraAlum {
      ArrayList<Alumno> lista;
      ArrayList<Alumno> alumnos = new ArrayList<>();
    public ArraAlum(){
        //this.alumnos= new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
    }
    
    public Alumno getAlumno(int index){
        return this.alumnos.get(index);
    }
    
    public void setAlumno(int index, Alumno alumno){
        this.alumnos.set(index, alumno);
    }
    
    //MÉTODOS BÁSICOS DE UNA LISTA LIGADA
    public int sizeListaAlumno(){
        return this.alumnos.size();
    }
    
    public Boolean isEmptyListaAlumno(){
        return this.alumnos.isEmpty();
    }//end isEmpty
    
    public void clearListaAlumno(){
        this.alumnos.clear();
    }
    
    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    
    public void deleteAlumno(int index){
        this.alumnos.remove(index);
    }

   public void addAlum(Alumno alumno)
   {
       this.alumnos.add(alumno);
   }
    
     public int removeAlumno(int index) {
        try {
           // this.alumnos.remove(index);
          alumnos.remove(index);
            return 1;
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
    }
    
    
}

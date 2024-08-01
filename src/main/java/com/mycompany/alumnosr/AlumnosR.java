/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alumnosr;

import java.util.ArrayList;

/**
 *
 * @author arace
 */
public class AlumnosR {
    public static  ArrayList<Alumno> alumnos = new ArrayList<>();
    public static void main(String[] args) {
        alumnos = new ArrayList<>();
        
        ViewRegistro van = new ViewRegistro();
        van.setVisible(true);    
    }
    
    
}

//Paquete actual
package clinicanino.interfaz;

 //Se importa el package anteriormente utilizado
import clinicanino.modelo.Paciente;

 //Clase importada del sistema Java

import java.util.Scanner;

//Declaracion de la clase
public class Ejecutable {
     static void main(String [ ] args) { //metodo main

         //Instanciación
         Scanner sc = new Scanner(System.in); //objeto lector por teclado
         Paciente paciente = new Paciente(); //objeto contenedor


         System.out.println("::::        CLINICA NIÑO SOFT V1.28      ::::");
         System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
         System.out.println("Bienvenido a la Clinica Niño...");
         System.out.print("Ingrese el nombre del paciente: ");
         paciente.setNombre(sc.nextLine());  //nextLine metodo q hace refe a escribir x teclado
         System.out.print("Ingrese la identificacion del paciente:");
         paciente.setIdentificacion(sc.nextLine());
         System.out.print("Ingrese la edad del paciente:");
         paciente.setEdad(Integer.parseInt(sc.nextLine()));
         System.out.print("Ingrese el genero del paciente: M corresponde a Masculino; F a femenino:");
         paciente.setGenero(sc.nextLine());
         System.out.println("Ingrese la epicrisis del paciente");
         paciente.setEpicrisis(sc.nextLine());


         String referenciamiento;

         if (paciente.getGenero().equals("M")){
             referenciamiento = "Sr.";
         } else {
             referenciamiento = "Sra.";
         }

         //Mensaje
         System.out.print("Paciente registrado: ");
         System.out.println(referenciamiento + " " + paciente.getNombre());
         System.out.println(" Su triage es: " + paciente.asignarTriage(paciente.getEpicrisis()));


     }
}


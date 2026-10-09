package clinicanino.modelo;

//Clase
public class Paciente {

    //Atributos
    private String nombre;
    private String identificacion;
    private int edad;
    private String epicrisis;
    private int triage;
    private String genero;

    //Constructor
    public Paciente () {}

    //Metodo
    public int asignarTriage (String nivel) {

        String texto= nivel.toLowerCase();  // toma el texto que entró (nivel) y lo convierte a minúsculas
        // texto es una declaracion de varible nueva

        int asignar =0;

        //TRIAGE 1
        if (texto.matches(".*trauma.*") ||
                texto.matches(".*paro.*cardiorrespiratorio.*") ||
                texto.matches(".*shock.*") ||
                texto.matches(".*hemorragia.*")) {
            asignar= 1;

        }

        //TRIAGE 2
        else if (texto.matches(".*dolor.*toracico.*") ||
                texto.matches(".*fractura.*") ||
                texto.matches(".*crisis.*")) {
            asignar= 2;
        }

        //TRIAGE 3
        else if (texto.matches(".*dolor.*abdominal.*") ||
                texto.matches(".*diarrea.*") ||
                texto.matches(".*migraña.*") ||
                texto.matches(".*vomito.*")) {
            asignar= 3;

        }


        //TRIAGE 4
        else if (texto.matches(".*amigdalitis.*") ||
                texto.matches(".*gripe.*") ||
                texto.matches(".*malestar.*")) {
            asignar = 4;

        }

        //TRIAGE 5
        else {
            asignar = 5;


        }
        return asignar;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEpicrisis() {
        return epicrisis;
    }

    public void setEpicrisis(String epicrisis) {
        this.epicrisis = epicrisis;
    }

    public int getTriage() {
        return triage;
    }

    public void setTriage(int triage) {
        this.triage = triage;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}


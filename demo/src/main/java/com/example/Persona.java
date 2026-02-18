package com.example;

// Este es la clase molde para crear personas
public class Persona {
    
    // Atributos que identifica a una persona
    int cedula;
    String nombre;
    String correo;

    //Constructor metodo inicial de la clase, se ejecuta inmediatamente creemos un objeto o una instancia de la clase
    public Persona() {
        System.out.println("Aqui se ejecuto el constructor vacio");
    }

    
    public Persona(int cedula) {
        System.out.println("Se ejecuto el constructor con la cedula");
        this.cedula = cedula;
    }


    public Persona(int cedula, String nombre, String correo) {
        System.out.println("Se ejecuto el constructor con todos los parametros");
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
    }

    // Aqui creamos los medtodos que indican las acciones que puede ejecutar o hacer una persona

    public String hablar(String saludo){
        System.out.println("El metodo hablar se ejecuto");
        return saludo + " " + this.nombre;
    }

}

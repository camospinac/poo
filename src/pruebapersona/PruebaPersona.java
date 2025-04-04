package pruebapersona;

import persona.Persona;

public class PruebaPersona {
     public static void main(String[] args) {
        System.out.println("***** Impresión de clase y objetos tipo Persona *******");
        System.out.println("Contador de personas: " + Persona.getContadorPersona());
        var persona1 = new Persona("Camilo", "Ospina");
        System.out.println(persona1);
        System.out.println("Contador de personas: " + Persona.getContadorPersona());
        var persona2 = new Persona("Juan Jose", "Porras");
        System.out.println(persona2);
        System.out.println("Contador de personas: "+ Persona.getContadorPersona());
    }
}

package pruebapersona;

import persona.Persona;

public class PruebaPersona {
     public static void main(String[] args) {
        System.out.println("***** Impresión de clase y objetos tipo Persona *******");
        var persona1 = new Persona();
        persona1.setNombre("Camilo Antonio");
        persona1.setApellido("Ospina Cruz");
        System.out.print("Nombre completo: "+persona1.getNombre()+" "+persona1.getApellido());
    }
}

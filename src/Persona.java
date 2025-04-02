public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }

    public static void main(String[] args) {
        System.out.println("***** Impresión de clase y objetos tipo Persona *******");

        var persona1 = new Persona();
        persona1.nombre = "Camilo";
        persona1.apellido = "Ospina";
        persona1.mostrarPersona();
        System.out.println();
        var persona2 = new Persona();
        persona2.nombre = "Juan Jose";
        persona2.apellido = "Porras";
        persona2.mostrarPersona();

    }

}

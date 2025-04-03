package persona;
public class Persona {
    private String nombre;
    private String apellido;

    public Persona(){
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarPersona(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

}

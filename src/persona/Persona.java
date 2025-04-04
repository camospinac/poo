package persona;
public class Persona {
    private static int contadorPersona = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        Persona.contadorPersona++;
        this.idPersona = Persona.contadorPersona;
    }

    public int getIdpersona(){
        return this.idPersona;
    }
    
    public static int getContadorPersona(){
        return Persona.contadorPersona;
    }

    @Override
    public String toString(){
        return "Id unico: "+this.idPersona+" Nombre: "+this.nombre+" Apellido: "+this.apellido;
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

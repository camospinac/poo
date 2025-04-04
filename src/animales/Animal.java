package animales;

public class Animal {
    
    protected void comer(){
        System.out.println("Estoy comiendo...");
    }

    protected void dormir(){
        System.out.println("Estoy durmiendo...");
    }
}

class Perro extends Animal {

    public void ladrar(){
        System.out.println("Guau Guau...");
    }

    public void cuidar(){
        System.out.println("Estoy cuidando...");
    }

    @Override
    protected void dormir(){
        System.out.println("Durmiendo como un perro...");
    }
    
}

class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("***** Prueba animales *****");

        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        System.out.println("***** Clase Perro *****");
        var perro1 = new Perro();
        perro1.ladrar();
        perro1.cuidar();
        perro1.dormir();
        perro1.comer();
    }
}
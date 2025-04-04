package animales;

public class Animal {
    protected void hacerSonido(){
        System.out.println("Estoy haciendo un sonido...");
    }
}

class Perro extends Animal {
    @Override
    protected void hacerSonido(){
        System.out.println("Guau Guau...");
    }    
}

class Gato extends Animal {
    @Override
    protected void hacerSonido(){
        System.out.println("Miau Miau...");
    }
}

class PruebaAnimal {

    static void reproducirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        System.out.println("***** Prueba animales *****");
        var animal = new Animal();
        var perro = new Perro();
        var gato = new Gato();

        reproducirSonido(animal);
        reproducirSonido(perro);
        reproducirSonido(gato);;

    }
}
package aritmetica;
public class Aritmetica {
     int numero1;
     int numero2;

     public Aritmetica() {
     }

     public Aritmetica(int numero1, int numero2) {
          this.numero1 = numero1;
          this.numero2 = numero2;
     }

     public void sumar() {
          var suma = numero1 + numero2;
          System.out.println("La suma es: " + suma);
     }

     public void restar() {
          var resta = numero1 - numero2;
          System.out.println("La resta es: " + resta);
     }
}

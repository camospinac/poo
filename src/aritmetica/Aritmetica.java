package aritmetica;
public class Aritmetica {
     private int numero1;
     private int numero2;

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

     public int getNumero1(){
          return this.numero1;
     }

     public void setNumero1(int numero1){
          this.numero1 = numero1;
     }

     public int getNumero2(){
          return this.numero2;
     }

     public void setNumero2(int numero2){
          this.numero2 = numero2;
     }
}

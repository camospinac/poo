public class Aritmetica {
    int numero1;
    int numero2;

    public int sumar(int numero1, int numero2){
        return numero1+numero2;
    }

   public int restar(int numero1, int numero2){
        return numero1-numero2;
   }

   public int multiplicar(int numero1, int numero2){
        return numero1*numero2;
   }

   public double dividir(int numero1, int numero2){
        return (double)numero1/numero2;
   }

   public static void main(String[] args) {
        System.out.println("***** Operaciones matematicas *******");
        var calculadora = new Aritmetica();
        calculadora.numero1 = 5983485;
        calculadora.numero2 = 43843;
        System.out.println("Suma: "+calculadora.sumar(calculadora.numero1, calculadora.numero2));
        System.out.println("Resta: "+calculadora.restar(calculadora.numero1, calculadora.numero2));
        System.out.println("Multiplicación: "+calculadora.multiplicar(calculadora.numero1, calculadora.numero2));
        System.out.println("División: "+calculadora.dividir(calculadora.numero1, calculadora.numero2));
        
   }
}

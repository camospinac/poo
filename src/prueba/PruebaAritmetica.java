package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
         public static void main(String[] args) {
          System.out.println("***** Operaciones matematicas desde Prueba *******");
          var calculadora = new Aritmetica(5485754, 4938489);
          calculadora.sumar();
          calculadora.restar();
     }
}

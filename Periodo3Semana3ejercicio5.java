import java.util.Scanner;
class Main { 
  
  public static void main(String[] args) {
    byte opcion = 0;
    Scanner lectura= new Scanner (System.in);
    do {
    System.out.println("1.Mostrar 100 números con un bucle for");
      System.out.println("2.Mostrar 100 números con un bucle while");
      System.out.println("3.Introduce un número. ¿Es mayor que cero?");

       System.out.println("3.Introduce un número:");
      opcion = lectura.nextByte();
      
  } while (opcion<1   || opcion> 3);
    switch (opcion) {
      case 1:
         System.out.println("Opcion 1 ejecutada");
        break;
      case 2:
        System.out.println("Opcion 2 ejecutada");
        break;
      case 3:
        System.out.println("Opcion 3 ejecutada");
        break;
      default:
         System.out.println("Es imposible que el programa entre aqui");
}
   }
  }
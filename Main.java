import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
    Scanner Entrada= new Scanner(System.in);
    
    int numero1;
    int numero2;
    
    System.out.println("Digite el primer entero:");
    numero1 = Entrada.nextInt();

    System.out.println("Digite el primer entero:");
    numero2 = Entrada.nextInt();

    if(numero1 == numero2)
      System.out.println("El numero" + numero1 + "es igual a" + numero2 );

    if(numero1 != numero2)
      System.out.println("El numero" + numero1 + "es distinto a" + numero2 );
    
      if(numero1  < numero2)
      System.out.println("El numero" + numero1 + "es menor a" + numero2 );

     if(numero1  > numero2)
      System.out.println("El numero" + numero1 + "es mayor a" + numero2 );

    if(numero1  <= numero2)
      System.out.println("El numero" + numero1 + "es menor o igual a" + numero2 );

    if(numero1  >= numero2)
      System.out.println("El numero" + numero1 + "es mayor o igual a" + numero2 );
  }
}
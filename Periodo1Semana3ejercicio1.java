import java.util.Scanner;
class Main {
  public static void main(String[]args) {
     Scanner Entrada = new Scanner(System.in);
    int numero1;
    int numero2;
    int numero3;
    int suma;
    
    System.out.println("Escriba el primer entero: ");
    numero1 = Entrada.nextInt();

    System.out.println("Escriba el segundo entero:");
    numero2 = Entrada.nextInt();
    
System.out.println("Escriba el tercero entero:");
    numero3 = Entrada.nextInt();
    suma= numero1 + numero2 + numero3;
    
    System.out.println("La suma es: " + suma);
  }
}
  
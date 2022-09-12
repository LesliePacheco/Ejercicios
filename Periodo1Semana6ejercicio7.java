import java.util.Scanner;
class Main { 
  
  public static void main(String[] args) {
    String nombre,clave;
    Scanner entrada= new Scanner(System.in);
    System.out.println("Ingrese el nombre de los usuarios:");
  nombre = entrada.nextLine();
    System.out.println("Ingrese la clave de usuario:");
    clave = entrada.nextLine();
    if(nombre.equals("gaby") && clave.equals("123456")){
      System.out.println("Bienvenido al sistema:");   
}
    else{
      System.out.println("Nombre del usuario o contraseña Incorrecta:");   
} 
}
  }
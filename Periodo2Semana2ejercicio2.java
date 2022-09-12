import java.util.Scanner;
class Main { 
  
  public static void main(String[] args) {
    String Banch = "CSE";
    int year = 2;
    switch (year)
       {     
         case 1:
        System.out.println("Cursos electivos: Ingles, Calculo");  
           break;
           case 2:
           switch (Banch)
             { 
               case "CSE":
                 case "CCE":
        System.out.println("Cursos electivos: Machine Learning, Big Data");
                 break;
                 case "ECE":
                 System.out.println("Cursos electivos: Programacion");
                 break;
                 default:
           System.out.println("Cursos electivos: Ingenieria de Software");
}
 }  
  }
  }
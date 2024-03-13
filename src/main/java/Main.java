import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int x,y;
    System.out.println("Podaj liczby ");
    x=scanner.nextInt();
    y=scanner.nextInt();
    
    System.out.println("1.Suma");
    System.out.println("2.dzielnie");
    System.out.println("3.mnożenie");
    System.out.println("4.odejmowanie");
      int wybo = scanner.nextInt(); 
   
   
   switch(wybo){
     case 1:
       System.out.println(x+y);
       break;
     case 2:
       System.out.println(x/y);
       break;
     case 3:
       System.out.println(x*y);
       break;
     case 4:
       System.out.println(x-y);
       break;
     default:
       System.out.println("nie ma takiej opcji");
   } 


    }


}
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Temperature {
	static double farhinite(double celcius){
		double C=celcius;
		double F=0;
		C = (F - 32) * 5/9;
		
		return F;		
	}
		static double celcius(double farhinite){
		double F=farhinite;
	    double C=0;
		C = (F - 32) * 5/9;
		
		return C;		
	}
		
			

    public static void main(String[] args) {
         /*Temperature Converter:
*/

//calling game
Scanner sc = new Scanner(System.in);
System.out.println("Enter scale press c for celsius and f for fahrenheit:");
       String op=sc.nextLine();
	   
      switch(op) {
		  case "C":
		  case "c":
		  System.out.println("Enter the temperature in celsius :- ");
		  double c=sc.nextDouble();
		  System.out.println("The temperature in fahrenheit :- "+farhinite(c));
		  break;
		  case "F":
		  case "f":
		  System.out.println("Enter the temperature in fahrenheit :- ");
		  double f=sc.nextDouble();
		  System.out.println("The temperature in celsius :- "+celcius(f));
		  break;
		  
	  }
		
        }
}

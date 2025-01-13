import java.util.Scanner;

class SimpleInterestLevel2 {
    public static void main(String args[]) {
        /* Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___


*/

     //declear variable
        int principal,rate,time;
		

        Scanner sc = new Scanner(System.in);
		
        //Taking weight from user
        System.out.print("Enter the principal : ");
        principal = sc.nextInt();
		
		 //Taking rate from user
        System.out.print("Enter the rate : ");
        rate = sc.nextInt();
		
		 //Taking weight from user
        System.out.print("Enter the time : ");
        time = sc.nextInt();
		
		int simpleInterest = principal * rate * time / 100;//Simple Interest = Principal * Rate * Time / 100
		
       
        // The result
        System.out.println("\nThe Simple Interest is " +simpleInterest+ "  for Principal"+principal+", Rate of Interest"+rate+" and Time "+time);
    }
}

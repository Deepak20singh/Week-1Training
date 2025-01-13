import java.util.Scanner;

class ChocolatesForStudent {
    public static void main(String args[]) {
        /*Create a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___

*/

     //declear variable
        int numberOfchocolates,numberOfChildren;
		

        Scanner sc = new Scanner(System.in);
		
        //Taking numberOfchocolates from user
        System.out.print("Enter the number of chocolates : ");
        numberOfchocolates = sc.nextInt();
		
		 //Taking numberOfChildren from user
        System.out.print("Enter the number of children : ");
        numberOfChildren = sc.nextInt();
		
		//declear variable
		int eachStudentChocolates=numberOfchocolates/numberOfChildren;
		int remainingChocolates=numberOfchocolates%numberOfChildren;
		
		
        // The result
        System.out.println("\nThe number of chocolates each child gets is " +eachStudentChocolates+ " and the number of remaining chocolates are "+remainingChocolates);
    }
}

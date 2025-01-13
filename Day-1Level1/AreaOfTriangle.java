import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String args[]) {
        /* Write a program to find the side of the square whose perimeter you read from user
           Hint => Perimeter of Square is 4 times side
           I/P => perimeter
           O/P => The length of the side is ___ whose perimeter is ____ 
        */

     
        int height,base;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of triangle : ");
        height = sc.nextInt();
		
		System.out.print("\nEnter the base of triangle : ");
        base = sc.nextInt();
	
	    int area=base*height/2;

       
        // The result
        System.out.println("\nThe area of triangle is " + area + " whose length is "+height+" and base of the triangle is "+base);
    }
}

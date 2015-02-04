/**
 * @author cw29482
 * Author: Crystal Wang
 * Date: 2/4/15
 * Contact: cw29482@email.vccs.edu
 */
import java.util.Scanner;//gets Scanner to work
public class DelimitersAverageNumber { //class name
	public static void main(String [] args) { //used to begin a program 

		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, sumOfNumbers;//the n's are the variables that holds whole numbers
		double average; //using "double because the average is going to be a decimal 
		Scanner keyboard1 = new Scanner(System.in);//getting ready to receive keyboard input
		keyboard1.useDelimiter(",");//comma is the delimiter/boundary created between two characters
		System.out.println("Please enter 10 numbers.");//displays output on the screen

		n1 = keyboard1.nextInt();//the n's reads numbers from the keyboard input
		n2 = keyboard1.nextInt();
		n3 = keyboard1.nextInt();
		n4 = keyboard1.nextInt();
		n5 = keyboard1.nextInt();
		n6 = keyboard1.nextInt();
		n7 = keyboard1.nextInt();
		n8 = keyboard1.nextInt();
		n9 = keyboard1.nextInt();
		n10 = keyboard1.nextInt();

		System.out.println("You entered are ");//displays output on the screen

		System.out.println(n1+"\t"+n2+"\t"+n3+"\t"+n4+"\t"+n5+"\t"+n6+"\t"+n7+"\t"+n8+"\t"+n9+"\t"+n10+"\t");
		//prints out the numbers from the keyboard input that are stored in the variables 

		sumOfNumbers = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 +n9 + n10;//sum is stored as all the numbers added in total
		average = sumOfNumbers/10;//the average is stored and printed as the total of numbers divided by 10 
		System.out.println("The average is " + average);//prints out the sentence and the numbers that is stored as the average
	}
}


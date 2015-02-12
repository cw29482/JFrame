/** @author cw29482
 * Author: Crystal Wang
 * Date: 2/11/15
 * Purpose: "String Class" Class Exercise
 */
public class StringClassExercise {
	public static void main(String [] args) {
		char character; 
		boolean equality;
		
		String word = new String("The digital world");
		String word2 = new String("THE DIGITAL WORLD");
		String a = "The digital world";
		String word3 = new String("   Digimon    ");
		
	
		
		character = word.charAt(4);
		System.out.println(character);
		
		a = a.concat(" is prodigious!!");
		System.out.println(a);
		
		equality = word.equals("SUBDERMATOGLYPHIC");
		System.out.println(equality);
		
		equality = word.equalsIgnoreCase(word2);
		System.out.print("Ignore case: ");
		System.out.println(equality);
		
		System.out.print("To lowercase: ");
		System.out.println(word2.toLowerCase());
		
		System.out.print("To uppercase: ");
		System.out.println(word.toUpperCase());
		
		System.out.print("Replaced values: ");
		System.out.println(word.replace("i", "!"));
		
		System.out.print("SubString Start: ");
		System.out.println(word.substring(4));
		
		System.out.print("SubString Start End: ");
		System.out.println(word.substring(4, 11));
		
		System.out.print("Trim: ");
		System.out.println(word3.trim());
		
	}

}

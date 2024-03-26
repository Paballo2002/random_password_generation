package random_generator;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
        char[] pass_array = {'1','2','3','4','5','6','7','8','9','1','a','b','c','d','e','f','g','h','i','p','r','_','#','@','!','&','^','$','~','+'};            
        try (Scanner sc = new Scanner(System.in)) {
        	System.out.println("Enter the length of the password");
			int length = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			Random rand = new Random();
			for(int i = 0 ; i < length ; i++)
			{
				int rnd = rand.nextInt(pass_array.length);
				sb.append(pass_array[rnd]);
			}
			
			System.out.println("Your password is : "+sb.toString());
		}
	}
}

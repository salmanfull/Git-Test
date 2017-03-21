
/*
 * Salmankhan
 * 06/03/2017
 * NotaString project
 */
import static java.lang.System.out;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println("Enter Name: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		out.println("Hi "+input);
		in.close();

	}

}

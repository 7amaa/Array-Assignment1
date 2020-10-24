import java.util.Scanner;
import java.util.Arrays;

public class Hama{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Hello, do you want to know, how much letters your name exists of, then please insert your name: ");

		String x = scanner.nextLine();

		char[] haai = new char[x.length()];

		System.out.println("Your name consists of "+x.length()+" letters.");

		int i;

		for( i=0 ; i<x.length() ; i++ ){

			haai[i]=x.charAt(i);

			}

		System.out.print("See you later ");

		for( i=0 ; i<x.length() ; i++ ){

			System.out.print(haai[i]);
			}
			System.out.println();

			System.out.println("Now all the letters of your name are saved in indexes of an array");



		}

}

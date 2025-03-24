package exercicios2;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangle retangle = new Retangle();
		
		System.out.println("\nEnter Width and Heigth: ");
		retangle.width = sc.nextDouble();
		retangle.heigth = sc.nextDouble();
		
		double area = retangle.Area();
		double perimeter = retangle.Perimeter();
		double diagonal = retangle.Diagonal();
		
		System.out.printf("\nÁrea: %.2f ",area);
		System.out.printf("\nPerimeter: %.2f ",perimeter);
		System.out.printf("\nDiagonal: %.2f",diagonal);
		
		sc.close();
	}
}

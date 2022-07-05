package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class curso {

	public static void main(String[] args) {
		//Calculo de Area de um triangulo
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		//lado dos triangulos
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do triangulo X: \n");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo Y: \n");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
		
			//calculo da formula
			double areaX = x.area();
			
			
			//calculo da formula
			double areaY = y.area();
		//resultado
		System.out.printf("Area triangulo X: %.4f\n", areaX);	
		System.out.printf("Area triangulo Y: %.4f\n", areaY);	
			//definindo maior area
			if( areaX > areaY) {
				System.out.println("maior area: triangulo X");
			}else {
				System.out.println("maior area: triangulo Y");
			}
		
		
		sc.close();
	}

}

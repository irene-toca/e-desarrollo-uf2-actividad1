package calculadora;

import java.util.Locale;
import java.util.Scanner;

import operaciones.Suma;

public class Principal {
	
	
	public static void main(String[] args) {
		double a; 
		double b;
		double c;
		int a1;
		int b1;
		double resultado;
		int solucion;
		
		
		
		System.out.println("\nPRIMER M�TODO  SUMA DE  2 REALES\n");
		System.out.println("Introduce un numero");
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		 a = scanner.nextDouble();
		System.out.println(a);
		System.out.println("Introduce otro numero");
		 b = scanner.nextDouble();
		System.out.println(b);
		
		Suma suma1 = new Suma();
		resultado = suma1.suma2Reales(a, b);
		System.out.println(" el resultado de la suma es: " + resultado);
		System.out.println("\n***********************\n");
		
		
		
		
		System.out.println("\nSEGUNDO M�TODO  SUMA DE ENTEROS\n");
		System.out.println("Introduce un numero");
		 a1 = scanner.nextInt();
		System.out.println(a1);
		System.out.println("Introduce otro numero");
		 b1 = scanner.nextInt();
		System.out.println(b1);
		
		solucion = suma1.suma2Enteros(a1, b1);
		System.out.println(" el resultado de la suma es: " + solucion);
		System.out.println("\n***********************\n");
		
		
		
		System.out.println("\nTERCER M�TODO  SUMA DE 3 REALES\n");
		System.out.println("Introduce un numero");
		 a = scanner.nextDouble();
		System.out.println(a);
		System.out.println("Introduce otro numero");
		 b = scanner.nextDouble();
		System.out.println(b);
		System.out.println("Introduce �ltimo numero");
		c = scanner.nextDouble();
		
		resultado = suma1.suma3Reales(a, b, c);
		System.out.println(" el resultado de la suma es: " + resultado);
		System.out.println("\n***********************\n");
		
		
		
		System.out.println("\nCUARTO M�TODO ACUMULANDO \n");
		System.out.println("Introduce un numero");
		 a1 = scanner.nextInt();
		 solucion = suma1.valorAcumulado(a1);
		System.out.println("El valor acumulado es : "  + solucion);
		
		System.out.println("\nCUARTO M�TODO ACUMULANDO \n");
		System.out.println("Introduce un numero");
		 a1 = scanner.nextInt();
		 solucion = suma1.valorAcumulado(a1);
		System.out.println("El valor acumulado es : "  + solucion);
		
		System.out.println("\nCUARTO M�TODO ACUMULANDO \n");
		System.out.println("Introduce un numero");
		 a1 = scanner.nextInt();
		 solucion = suma1.valorAcumulado(a1);
		System.out.println("El valor acumulado es : "  + solucion);
		
		//CLASE 2 RESTA
		
		System.out.println("PRIMER METODO RESTA 2 NUMEROS REALES");

        System.out.println("Introduce un número");

        a = scanner.nextDouble();

        System.out.println("Introduce otro número");

        b = scanner.nextDouble();

        resta resta1 = new resta();

        resultado = resta1.resta2Reales(a, b);

        System.out.println("El resultado de la resta es " + resultado);
        System.out.println();

        System.out.println("SEGUNDO METODO RESTA 2 NUMEROS ENTEROS");

        System.out.println("Introduce un número");

        a1 = scanner.nextInt();

        System.out.println("Introduce otro número");

        b1 = scanner.nextInt();

        solucion = resta1.resta2Enteros(a1, b1);

        System.out.println("El resultado de la resta es " + resultado);
        System.out.println();

        System.out.println("TERCER METODO RESTA 3 NUMEROS REALES");

        System.out.println("Introduce un número");

        a = scanner.nextDouble();

        System.out.println("Introduce otro número");

        b = scanner.nextDouble();

        System.out.println("Introduce el ultimo numero");

        c = scanner.nextDouble();

        resultado = resta1.resta3Reales(a, b, c);

        System.out.println("El resultado de la resta es " + resultado);
        System.out.println();

        System.out.println("CUARTO METODO RESTA CON VALOR ACUMULADO");

        System.out.println("Introduce un número");

        a1 = scanner.nextInt();

        solucion = resta1.restaAcumulado(a1);
        System.out.println("El valor acumulado es " + solucion);

        System.out.println("CUARTO METODO RESTA CON VALOR ACUMULADO");

        System.out.println("Introduce un número");

        a1 = scanner.nextInt();

        solucion = resta1.restaAcumulado(a1);
        System.out.println("El valor acumulado es " + solucion);

        System.out.println("CUARTO METODO RESTA CON VALOR ACUMULADO");

        System.out.println("Introduce un número");

        a1 = scanner.nextInt();

        solucion = resta1.restaAcumulado(a1);
        System.out.println("El valor acumulado es " + solucion);
		
		
	}

}

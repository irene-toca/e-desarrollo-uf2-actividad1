package calculadora;

import java.util.Locale;
import java.util.Scanner;

import operaciones.Resta;
import operaciones.Suma;

/**
 * Prueba de los metodos de la calculadora
 * @author irene, Félix, rober, Pedro
 *
 */
public class Principal {
	
	/**
	 * Metodo de entrada a la aplicacion
	 * @param args Parametros del metodo
	 */
	public static void main(String[] args) {
		double a; 
		double b;
		double c;
		int a1;
		int b1;
		double resultado;
		int solucion;
		
		
		
		System.out.println("\nPRIMER MÉTODO  SUMA DE  2 REALES\n");
		System.out.println("Introduce un número");
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		 a = scanner.nextDouble();
		System.out.println(a);
		System.out.println("Introduce otro número");
		 b = scanner.nextDouble();
		System.out.println(b);
		
		Suma suma1 = new Suma();
		resultado = suma1.suma2Reales(a, b);
		System.out.println(" el resultado de la suma es: " + resultado);
		System.out.println("\n***********************\n");
		
		
		
		
		System.out.println("\nSEGUNDO MÉTODO  SUMA DE ENTEROS\n");
		System.out.println("Introduce un número");
		 a1 = scanner.nextInt();
		System.out.println(a1);
		System.out.println("Introduce otro número");
		 b1 = scanner.nextInt();
		System.out.println(b1);
		
		solucion = suma1.suma2Enteros(a1, b1);
		System.out.println(" el resultado de la suma es: " + solucion);
		System.out.println("\n***********************\n");
		
		
		
		System.out.println("\nTERCER MÉTODO  SUMA DE 3 REALES\n");
		System.out.println("Introduce un número");
		 a = scanner.nextDouble();
		System.out.println(a);
		System.out.println("Introduce otro número");
		 b = scanner.nextDouble();
		System.out.println(b);
		System.out.println("Introduce último número");
		c = scanner.nextDouble();
		
		resultado = suma1.suma3Reales(a, b, c);
		System.out.println(" el resultado de la suma es: " + resultado);
		System.out.println("\n***********************\n");
		
		
		
		System.out.println("\nCUARTO MÉTODO ACUMULANDO \nejecutado 3 veces");
		System.out.println("Introduce un número");
		 a1 = scanner.nextInt();
		 solucion = suma1.valorAcumulado(a1);
		System.out.println("El valor acumulado es : "  + solucion);
		
		System.out.println("Introduce un número");
		 a1 = scanner.nextInt();
		 solucion = suma1.valorAcumulado(a1);
		System.out.println("El valor acumulado es : "  + solucion);
		
		System.out.println("Introduce un número");
		 a1 = scanner.nextInt();
		 solucion = suma1.valorAcumulado(a1);
		System.out.println("El valor acumulado es : "  + solucion);
		
		//CLASE 2 RESTA
		
		System.out.println("\n***********\nPRIMER MÉTODO RESTA 2 NUMEROS REALES");

        System.out.println("Introduce un número");

        a = scanner.nextDouble();

        System.out.println("Introduce otro número");

        b = scanner.nextDouble();

        Resta resta1 = new Resta();

        resultado = resta1.resta2Reales(a, b);

        System.out.println("El resultado de la Resta es " + resultado);
        System.out.println();

        System.out.println("SEGUNDO MÉTODO RESTA 2 NUMEROS ENTEROS");

        System.out.println("Introduce un número");

        a1 = scanner.nextInt();

        System.out.println("Introduce otro número");

        b1 = scanner.nextInt();

        solucion = resta1.resta2Enteros(a1, b1);

        System.out.println("El resultado de la Resta es " + solucion);
        System.out.println();

        System.out.println("TERCER MÉTODO RESTA 3 NUMEROS REALES");

        System.out.println("Introduce un número");

        a = scanner.nextDouble();

        System.out.println("Introduce otro número");

        b = scanner.nextDouble();

        System.out.println("Introduce el ultimo número");

        c = scanner.nextDouble();

        resultado = resta1.resta3Reales(a, b, c);

        System.out.println("El resultado de la Resta es " + resultado);
        System.out.println();

        System.out.println("CUARTO MÉTODO RESTA CON VALOR ACUMULADO\nejecutado 3 veces");

        System.out.println("Introduce un número");

        a1 = scanner.nextInt();

        solucion = resta1.restaAcumulado(a1);
        System.out.println("El valor acumulado es " + solucion);


        System.out.println("Introduce un número");

        a1 = scanner.nextInt();

        solucion = resta1.restaAcumulado(a1);
        System.out.println("El valor acumulado es " + solucion);


        System.out.println("Introduce un número");

        a1 = scanner.nextInt();

        solucion = resta1.restaAcumulado(a1);
        System.out.println("El valor acumulado es " + solucion);
		
		System.out.println("Fin del programa");
	}

}

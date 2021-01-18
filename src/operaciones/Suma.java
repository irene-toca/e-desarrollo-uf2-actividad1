package operaciones;
/**
 * Clase 1: Suma. Esta clase implementar� todos los m�todos que est�n relacionados con la sumas de la calculadora.
 * 
 * @author irene
 *
 */
public class Suma {	
	static int acumulador = 0;
	
	double resultado;
	int solucion;
	
	
	/**
	 * Sumamos dos n�meros reales
	 * 
	 * @param num1 primer n�mero real a sumar
	 * @param num2 segundo n�mero real a sumar
	 * @return  double, suma de (num1, num2)
	 */
	public double suma2Reales(double num1, double num2) {
		resultado = num1 + num2;
		return resultado;
	}
	
	
	/**
	 * Sumamos 2 n�meros Enteros
	 * 
	 * @param num1 primer n�mero real a sumar
	 * @param num2 segundo n�mero real a sumar
	 * @return int, suma de (num1, num2) 
	 */
	public int suma2Enteros(int num1, int num2) {
		solucion = num1 + num2;
		return solucion;
		
	}
	
	
	/**
	 *  Sumamos tres n�meros reales
	 * 
	 * @param num1 primer n�mero real a sumar
	 * @param num2 segundo n�mero real a sumar
	 * @param num3 terser n�mero  real a sumar
	 * @return  double, suma de (num1, num2, num3)
	 */
	public double suma3Reales(double num1, double num2, double num3) {
		resultado = num1 + num2 + num3;
		return resultado;
	}
	
	
	/**
	 * Obtenemos el valor acumulado
	 * 
	 * @param num valor a�adido al acumulador 
	 * @return int el total del acumulador
	 */

	public int valorAcumulado(int num) {
		//Suma.acumulador += num;
		Suma.acumulador = Suma.acumulador + num;
		return Suma.acumulador;
	}
}

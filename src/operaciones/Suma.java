package operaciones;
/**
 * 
 * @author irene
 *
 */
public class Suma {	
	static int acumulador = 0;
	
	double resultado;
	int solucion;
	
	
	public double suma2Reales(double num1, double num2) {
		resultado = num1 + num2;
		return resultado;
	}
	
	
	public int suma2Enteros(int num1, int num2) {
		solucion = num1 + num2;
		return solucion;
		
	}
	
	public double suma3Reales(double num1, double num2, double num3) {
		resultado = num1 + num2 + num3;
		return resultado;
	}

	public int valorAcumulado(int num) {
		//Suma.acumulador += num;
		Suma.acumulador = Suma.acumulador + num;
		return Suma.acumulador;
	}
}

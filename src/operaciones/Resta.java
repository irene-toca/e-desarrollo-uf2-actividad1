package operaciones;

/**
 * Esta clase definirá las operaciones relacionadas con la resta
 * 
 * @author rober
 ** @version 1.0
 * @since 18-01-2021 .
 */
public class Resta {
	
	/**
	 * Usando la variable entera acumuLador iremos restando numeros 
	 */
    static int acumuLador = 0;
    
    /**
	 * Variable de tipo double para restar los dos numeros reales
	 */
	double resultado;
	
	 /**
	  * Variable de tipo integer para restar los numeros enteros
	  */
	int solucion;
	
	
	public double resta2Reales(double num1, double num2) {
		resultado = num1 - num2;
		return resultado;
	}
        
        public int resta2Enteros(int num1, int num2){
                solucion=num1 - num2;
                return solucion;
        }
        
        public double resta3Reales(double num1, double num2, double num3) {
		resultado = num1 - num2 - num3;
		return resultado;
	}
        
        public int restaAcumulado(int num){
            Resta.acumuLador= Resta.acumuLador - (num);
            return Resta.acumuLador;
            
        }
        
}

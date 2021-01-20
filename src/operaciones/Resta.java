package operaciones;

/**
 * Esta clase definira las operaciones relacionadas con la Resta
 * 
 * @author rober
 *
 */
public class Resta {
    
    static int acumuLador = -0;
	
	double resultado;
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

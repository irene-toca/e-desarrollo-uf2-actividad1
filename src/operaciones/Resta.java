package operaciones;

/**
 * Esta clase definirá las operaciones relacionadas con la resta
 * 
 * @author rober
 *
 */
public class resta {
    
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
            resta.acumuLador= resta.acumuLador - (num);
            return resta.acumuLador;
            
        }
        
}

package ClasesOperadores;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerouno = 8 ;
		int numerodos = 2 ;
		int aux = 0 ;
		System.out.println("variable uno es: "+numerouno+ " variable dos es: " +numerodos);
		System.out.println("cambio de variable");
		aux = numerouno;
		numerouno = numerodos;
		numerodos = aux;
		System.out.println("variable uno es: "+numerouno+ " variable dos es: " +numerodos);
	}

}

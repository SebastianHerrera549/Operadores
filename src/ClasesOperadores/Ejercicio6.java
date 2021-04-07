package ClasesOperadores;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ladoCuadrado = 8;
		int baseTriangulo =9;
		int alturaTriangulo =8;
		int ladoUnoTriangulo =8;
		int ladoDosTriangulo =8;
		int baseRectangulo =8;
		int alturaRectangulo =6 ;
		
		System.out.println("********   Cuadrado   ********");
		System.out.println("el area del cuadrado con un lado de: "+ladoCuadrado+" es es: "+(ladoCuadrado*ladoCuadrado));
		System.out.println("el perimetro del cuadrado con un lado de: "+ladoCuadrado+" es es: "+(ladoCuadrado*4));
		System.out.println("");
		System.out.println("********   Triangulo   ********");
		System.out.println("el area del triangulo con una altura de: "+alturaTriangulo+" y base de: "+baseTriangulo+" es es: "+(baseTriangulo*alturaTriangulo)/2);
		System.out.println("el perimetro del Triangulo base de: "+baseTriangulo+" lado uno es: "+ladoUnoTriangulo+" y un lado dos de: "+ladoDosTriangulo+" es de:" +(baseTriangulo+ladoUnoTriangulo+ladoDosTriangulo));
		System.out.println("");
		System.out.println("********   Rectangulo   ********");
		System.out.println("El area de un Rectangulo de base: "+baseRectangulo+" y altura "+alturaRectangulo+ " es de: "+(baseRectangulo*alturaRectangulo) );
		System.out.println("El perimetro de un Recatangulo de base: "+baseRectangulo+" y altura "+alturaRectangulo+ " es de: "+ ((baseRectangulo*2)+(alturaRectangulo*2)));

	}

}

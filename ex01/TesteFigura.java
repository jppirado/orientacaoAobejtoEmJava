package pratica.ex01;

public class TesteFigura {

	public static void main(String[] args) {
		
		Figura circulo = new Ciruclo(3.0, "Black");
		System.out.print( circulo.toString() ) ;
		
		Triangulo Triangulo = new Triangulo( 10.0 , 10.0 , "Balkc");
		System.out.println(Triangulo.toString());
		
		Retangulo Retangulo = new Retangulo( 10.0 , 10.0 , "Balkc");
		System.out.println(Retangulo.toString());
		
		Retangulo quadrado = new Quadrado( 3.0 , 0.0, "black ");
		System.out.println(quadrado	.toString());
		
		
		
	}
	
}

package pratica.ex01;

public class Retangulo extends Figura implements INTER_RETANGULO {

	private double lado1 ; 
	private double lado2 ;
	
	public Retangulo ( double lado1 , double lado2  , String cor) {
		setLado1(lado1);
		setLado2(lado2);
		super.setCor(cor);
	}
	
	public void setLado1( double lado1 ) {
		this.lado1 = lado1;
	}
	
	public void setLado2( double lado2 ) {
		this.lado2 = lado2;
	}
	
	public double getLado1( ) {
		return this.lado1; 
	}
	
	public double getLado2( ) {
		return this.lado2; 
	}
	
	public double getArea( ) {
		return getLado1() * getLado2();
	}
	
	public String toString( ) {
		return "Lado1 : " + getLado1() + ""
				+ "\n Lado2 : " + getLado2( ) +""
						+ " Area : " + getArea()  + " "
								+ "Cor : " + super.getCor();
				
	}

	@Override
	public double Retangulo(double lado1, double lado2, String cor) {
		
		setLado1(lado1);
		setLado2(lado2);
		super.setCor(cor);
		return 0;
	}
	
}

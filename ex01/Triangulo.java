package pratica.ex01;

public class Triangulo extends Figura implements INTER_TRIENGULO {

	private double base ; 
	private double altura ;
	
	public Triangulo (double b ,  double a , String c ){
		setAltura(a);
		setBase(b);
		super.setCor(c);

	}
	
	public void setBase(double base ) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura ;
	}
	
	public double getBase( ) {
		return this.base ;
	}
	
	public double getAltura ( ) {
		return this.altura; 
	}
	
	public double getArea( ) {
		
		return  (this.getAltura() * this.getBase() )/ 2 ; 
	}
	
	public String toString( ) {
		
		return "Base : " + getBase() + " \n Altura: " + getAltura( )  +"\n Àrea: " + getArea() + "\n Cor : " + this.getCor() ; 
	}

	@Override
	public double Triangulo(double base, double altura, String cor) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

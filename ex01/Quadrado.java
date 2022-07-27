package pratica.ex01;

public class Quadrado extends Retangulo implements INTER_QUADRADO{

	public Quadrado(double lado1, double lado2, String cor) {
		super(lado1, lado2, cor);
		// TODO Auto-generated constructor stub
	}

	public double Quadrado(double lado1 , String cor){
		super.setLado1(lado1);
		super.setCor(cor);
		return 0;
	}

	public String toString( ) {
		return "Lado : " + getLado1( )+ "\n Cor : " +super.getCor();
	}

	
}

package pratica.ex01;

public class Ciruclo extends Figura implements INTER_CIRCULO{

	private double raio ;
	
	public Ciruclo(double raio, String cor ) {
		setRaio(raio);
		super.setCor(cor);
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio( ) {
		return this.raio;
	}
	
	public double getArea ( ) {
		return Math.pow(2, getRaio( )) * Math.PI ;
	}
	
	public double getDiametro( ) {
		return getRaio() * 2 ;
	}
	
	public String toString( ) {
		return "Raio: " + getRaio() + ""
				+ "\n Área: " + getArea( ) +""
						+ "\nDiametro: " + getDiametro()  + " "
								+ "\nCor : " + super.getCor();
				
	}

	@Override
	public double Ciruclo(double raio, String cor) {
		// TODO Auto-generated method stub
		return 0;
	}
}

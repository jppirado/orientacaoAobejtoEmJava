package pratica.ex2;

public class Onibus extends Veiculo  implements INTER_ONIBUS{

	private int assentos ;
	
	public Onibus( ) {
		
	}
		
	public Onibus( String palca , int ano , int assentos ) {
		super.setPlaca(palca);
		super.setAno(ano);
		setAssentos(assentos); 
	}
	
	public void setAssentos( int assentos ) {
		this.assentos = assentos;
	}
	
	public int getAssentos( ) {
		return this.assentos;
	}
	
	public void exibirDados( ) {
		System.out.println("Placa : " + super.getPlaca() + " Ano : " + super.getAno() + " Assentos : " + getAssentos());
	}
	
}

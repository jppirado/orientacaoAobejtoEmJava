package pratica.ex2;

public class Caminhao extends Veiculo implements INTER_CAMINHAO {

	int eixos ;
	
	public Caminhao(){
		
	}
	
	public Caminhao( String placa , int ano ,  int eixos ){
		super.setPlaca(placa);
		super.setAno(ano);
		setEixos(eixos);
	}
	
	public void setEixos(int eixos ) {
		this.eixos = eixos;
	}
	
	public int getEixos( ) {
		return this.eixos;
	}
	
	public void exibirDados( ) {
		System.out.println("Placa : " + super.getPlaca() + " Ano : " + super.getAno() + " Assentos : " + getEixos());
	}
	
	
}

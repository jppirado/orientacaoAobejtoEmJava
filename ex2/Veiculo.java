package pratica.ex2;

public abstract class Veiculo  {

	private String placa ; 
	private int ano ;
	
	public Veiculo( ) {
		
	}
		
	public Veiculo( String placa , int ano ) {
		setPlaca(placa);
		setAno(ano);
	}
	
	public void setAno( int ano ) {
		this.ano = ano;
	}
	
	public void setAno( String ano ) {
		this.ano = Integer.parseInt(ano);
	}
	
	
	public void setPlaca( String placa  ) {
		this.placa = placa;
	}
	
	public String getPlaca( ) {
		return this.placa ;
	}
	
	public int getAno( ) {
		return this.ano;
	}
	
	public void exibirDados( ) {
		toString();
	}
	
	public String toString( ) {
		return "[ "  + this.getPlaca() + " , " +  this.getAno() + " ] " ;
	}
	
	
}

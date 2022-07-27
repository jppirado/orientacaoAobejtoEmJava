package pratica.ex2;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Onibus onibus  = new Onibus( );
		Onibus onibus2  = new Onibus( "pfg343" , 2022  , 44 );
		
		onibus.setAno(2019);
		onibus.setPlaca("ldt783");
		onibus.setAssentos(42);
		onibus.exibirDados();
		onibus2.exibirDados();
		
	}
	
}

package financiamento_adriano;


public class ProgramaFinanciamentoVeiculo {
	
	public static void main(String[] args){
		
		Dados finan = new Dados();
		
		finan.setNomeCliente("Adriano J Silva");
		finan.setModeloVeiculo("Golf");
		finan.setValorVeiculo(60000.0);
		finan.setValorEntrada(4000.0);			
		finan.settaxaJuro(4);
		finan.setNumeroPrestacao(15);
		finan.setrendaMensal(6000.0);
		
		
		System.out.println("Cliente: " + finan.getNomeCliente());
		System.out.println("Modelo do veiculo pretendido: " + finan.getModeloVeiculo());
		System.out.println("Valor do veiculo: " + finan.getValorVeiculo());
		System.out.println("Valor da entrada do veiculo: " + finan.getValorEntrada());
		System.out.println("Valor para financiamento: " + finan.setValorFinanciado());
		System.out.println("Taxa de Juros: " + finan.gettaxaJuro());
		System.out.println("Numero total de prestações: " + finan.getNumeroPrestacao());
		System.out.println("Renda mensal do cliente: " + finan.getrendaMensal());
		System.out.println("Valor da prestação" + finan.getValorPrestacao());
		
		}

}



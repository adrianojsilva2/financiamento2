package financiamento_adriano;


import java.lang.Math;
public class Dados {
	
	private String nomeCliente = "";	
	private String modeloVeiculo = "";
	private double valorVeiculo = 0.0;
	private double valorEntrada = 0.0;
	private double valorFinanciado;
	private double taxaJuro = 0.0;
	private int numeroPrestacao = 0;
	public double rendaMensal = 0.0;
	private double valorPrestacao;
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente != null){
			this.nomeCliente = nomeCliente;
		}
		else{
			System.out.println("Nome de cliente invalido");
		}
	}
	
	
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(String modeloVeiculo){ 
	     if (modeloVeiculo != null){
		 this.modeloVeiculo = modeloVeiculo;
	    }
	else{
		System.out.println("Modelo de veiculo invalido");
	}
	}
	 
	
	
	
	
	public double getValorVeiculo() {
		return valorVeiculo;
	}
	public void setValorVeiculo(double valorVeiculo) {
		if (valorVeiculo > 0){
			this.valorVeiculo = valorVeiculo;
		}
		else{
			System.out.println("Valor de veiculo invalido");
		}
		
		
		
		
	}
	public double getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(double valorEntrada) {
		if (valorEntrada > 0){
			this.valorEntrada = valorEntrada;
		}
		else{
			System.out.println("Valor de veiculo invalido");
		}
		
	}
	
	
	
	public double setValorFinanciado() {
		this.valorFinanciado = valorVeiculo - valorEntrada;
		return valorFinanciado;
	}
	
	
	
	
	public double gettaxaJuro() {
		return taxaJuro;
	}
	public void settaxaJuro(double taxaJuro) {
		
		if(taxaJuro >= 0 && taxaJuro <= 100){
			
			this.taxaJuro = taxaJuro / 100;
		}else{
			System.out.println("Taxa de juros nao concedida");
		}
	}
	
	
	
	public int getNumeroPrestacao() {
		return numeroPrestacao;
	}
	public void setNumeroPrestacao(int numeroPrestacao) {
		this.numeroPrestacao = numeroPrestacao;
		
		
		
	}
	
	
	public double getrendaMensal() {
		return rendaMensal;
	}
	public void setrendaMensal(double rendaMensal) {
		if (rendaMensal > 0){
			this.rendaMensal = rendaMensal;
		}
		else{
			System.out.println("Renda mensal negativa, calculo impossivel");
		}
		
	}
	
	
	public double getValorPrestacao() {
		return valorPrestacao;
	}
	
		
	public void setvalorPrestacao(double valorPrestacao) {
		this.valorPrestacao = valorPrestacao;
		
		valorPrestacao = valorFinanciado * 
	    (taxaJuro / (1 -  ( 1 / Math.pow(1 + gettaxaJuro(), getNumeroPrestacao()))));
		
        double limitePrestacao = this.rendaMensal * 0.40;
        
		
		if( limitePrestacao > valorPrestacao){
			
			double totalFinacimento  = valorPrestacao;		
			
			totalFinacimento = totalFinacimento * numeroPrestacao;
			
			System.out.println("O financiamento pode ser aprovado");
			System.out.println("Valor do finaciamento adquirido pelo cliente: R$ " + totalFinacimento);			
			System.out.println("Valor das prestações: R$ " + valorPrestacao);
			System.out.println("Limite das prestações: R$ " + limitePrestacao);
			}
		
			else{				
			System.out.println("Valor da prestação não permitida");			
		}
	}
	public boolean totalFinanciamento() {
		// TODO Auto-generated method stub
		return false;
	}
		
		
	}

	
	
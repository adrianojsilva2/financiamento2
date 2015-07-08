package financiamento_adriano_teste;

import static org.junit.Assert.*;

import org.junit.Test;


import financiamento_adriano.Dados;


public class DadosTestes {
	
	
	@Test
	public void testAutorizacao(){
		Dados finan = new Dados();
		finan.settaxaJuro(4);
		finan.setNumeroPrestacao(15);
		finan.setrendaMensal(6000.0);
		finan.setValorVeiculo(60000.0);
		finan.setValorEntrada(4000.0);		
		boolean esperado = true;
		boolean atual = finan.totalFinanciamento();
		
		assertTrue(esperado, atual);	
		
		finan.setrendaMensal(6000.00);
		boolean esperado2 = false;
		boolean atual2 = finan.totalFinanciamento();
		
		assertTrue(esperado2, atual2);
	}
	
	
	

	private void assertTrue(boolean esperado, boolean atual) {
		// TODO Auto-generated method stub
		
	}




	@Test
	public void testGetNomeCliente() {
		
        Dados finan = new Dados();		
		finan.setNomeCliente("");
		String esperado = "";
		String atual = finan.getNomeCliente();		
		assertEquals(esperado, atual);		
		
	}
	
	@Test
	public void testGetModeloVeiculo(){
		
		Dados finan = new Dados();		
		finan.setModeloVeiculo("");
		String esperado = "";
		String atual = finan.getModeloVeiculo();		
		assertEquals(esperado, atual);
	}
	
	@Test
	public void testGetValorVeiculo(){
		
		Dados finan = new Dados();		
		finan.setValorVeiculo(-8);
		double esperado = 0.0;
		double atual = finan.getValorVeiculo();		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testGetValorEntrada(){
		
		Dados finan = new Dados();		
		finan.setValorEntrada(-8);
		double esperado = 0.0;
		double atual = finan.getValorEntrada();		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testTaxaJuro(){
		
		Dados finan = new Dados();
		finan.settaxaJuro(4);
		double esperado = 0.04;
		double atual = finan.gettaxaJuro();		
		assertEquals(esperado, atual, 0.00);
		
		
	}
	
	@Test
	public void testNumeroPrestacao(){
		
		Dados finan = new Dados();
		finan.setNumeroPrestacao(15);
		int esperado = 15;
		int atual = finan.getNumeroPrestacao();		
		assertEquals(esperado, atual, 0.00);
				
	}
	
	@Test
	public void testrendaMensa(){
		
		Dados finan = new Dados();
		finan.setrendaMensal(100);
		double esperado = 100;
		double atual = finan.getrendaMensal();		
		assertEquals(esperado, atual, 0.00);		
		
	}

}
	
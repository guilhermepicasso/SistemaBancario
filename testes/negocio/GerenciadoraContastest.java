package negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;
import java.util.ArrayList;

public class GerenciadoraContastest {
	private GerenciadoraContas gerContas;
	
	@Test
	public void testTransfereValorSufiAmbas() {
		int idConta01 = 1;
		int idConta02 = 2;
		ContaCorrente conta01 = new ContaCorrente(idConta01,200,true);
		ContaCorrente conta02 = new ContaCorrente(idConta02,0,true);
		
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);
		
		boolean sucesso = gerContas.transfereValor(idConta01,100,idConta02);
		
		assertTrue(sucesso);
		assertThat(conta02.getSaldo(),is(100.0));
		assertThat(conta01.getSaldo(),is(100.0));
		
		
	}
	
	@Test
	public void testTransfereValorInsUmaPosi() {
		int idConta01 = 1;
		int idConta02 = 2;
		ContaCorrente conta01 = new ContaCorrente(idConta01,100,true);
		ContaCorrente conta02 = new ContaCorrente(idConta02,0,true);
		
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);
		
		boolean sucesso = gerContas.transfereValor(idConta01,200,idConta02);
		
		assertTrue(sucesso);
		assertThat(conta01.getSaldo(),is(-100.0));
		assertThat(conta02.getSaldo(),is(200.0));
		
		
	}
	
	@Test
	public void testTransfereValorInsUmaNega() {
		int idConta01 = 1;
		int idConta02 = 2;
		ContaCorrente conta01 = new ContaCorrente(idConta01,-100,true);
		ContaCorrente conta02 = new ContaCorrente(idConta02,0,true);
		
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);
		
		boolean sucesso = gerContas.transfereValor(idConta01,200,idConta02);
		
		assertTrue(sucesso);
		assertThat(conta01.getSaldo(),is(-300.0));
		assertThat(conta02.getSaldo(),is(200.0));
		
	}
	
	@Test
	public void testTransfereValorInsuAmbas() {
		int idConta01 = 1;
		int idConta02 = 2;
		ContaCorrente conta01 = new ContaCorrente(idConta01,-100,true);
		ContaCorrente conta02 = new ContaCorrente(idConta02,-100,true);
		
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);
		
		boolean sucesso = gerContas.transfereValor(idConta01,200,idConta02);
		
		assertTrue(sucesso);
		assertThat(conta01.getSaldo(),is(-300.0));
		assertThat(conta02.getSaldo(),is(100.0));
		
	}
	

}

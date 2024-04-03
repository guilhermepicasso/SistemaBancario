package negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;
import java.util.ArrayList;


public class GerenciadoraClientesTest {
	private GerenciadoraClientes gerClientes;
	private int idCliente01 = 1;
	private int idCliente02 = 2;
	private int idCliente03 = 3;
	private int idCliente04 = 4;
	
	@Before
	public void setUp() {
		idCliente01 = 1;
		idCliente02 = 2;
		
		Cliente cliente01 = new Cliente(idCliente01,"João",18,"joao@gmail.com",1,true);
		Cliente cliente02 = new Cliente(idCliente02,"Ana",17,"ana@gmail.com",1,true);
		Cliente cliente03 = new Cliente(idCliente03,"clara",65,"clara@gmail.com",1,true);
		Cliente cliente04 = new Cliente(idCliente04,"Fernando",66,"nando@gmail.com",1,true);
		
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		clientesDoBanco.add(cliente03);
		clientesDoBanco.add(cliente04);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
	}
	
	@After
	public void tearDown() {
		gerClientes.limpa();
	}
	
	@Test
	public void testePesquisaCliente() {
		Cliente cliente = gerClientes.pesquisaCliente(idCliente01);
		assertThat(cliente.getId(), is(idCliente01));
	}
	
	@Test
	public void testRemoverCliente() {
		boolean clienteRemovido = gerClientes.removeCliente(idCliente02);
		
		assertThat(clienteRemovido, is(true));
		assertThat(gerClientes.getClientesDoBanco().size(), is(3));
		assertNull(gerClientes.pesquisaCliente(idCliente02));
	}
	
	@Test
	public void testIdade18() throws Exception {
		try {
			Cliente cliente = gerClientes.pesquisaCliente(idCliente01);
			boolean validaIdade = gerClientes.validaIdade(cliente.getIdade());
			assertThat(validaIdade, is(true));
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testIdade17() throws Exception {
		try {
			Cliente cliente = gerClientes.pesquisaCliente(idCliente02);
			boolean validaIdade = gerClientes.validaIdade(cliente.getIdade());
			assertThat(validaIdade, is(true));
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testIdade65() throws Exception {
		try {
			Cliente cliente = gerClientes.pesquisaCliente(idCliente03);
			boolean validaIdade = gerClientes.validaIdade(cliente.getIdade());
			assertThat(validaIdade, is(true));
		}catch (Exception e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testIdade66() throws Exception {
		try {
			Cliente cliente = gerClientes.pesquisaCliente(idCliente04);
			boolean validaIdade = gerClientes.validaIdade(cliente.getIdade());
			assertThat(validaIdade, is(true));
		}catch (Exception e) {
			assertTrue(true);
		}
	}
}

package com.fatec.scel;

import static org.junit.Assert.*;


import org.junit.Test;

import com.fatec.scel.model.Usuario;

public class UC02CadastrarUsuario {
	
	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome("Vinicius");
			usr.setRa("94191919194");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarUsuarioComRAInvalidos() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome("Vinicius");
			usr.setRa("");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarUsuarioComRAInvalidos() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome("Vinicius");
			usr.setRa(null);
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarUsuarioComNomeInvalidos() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome("");
			usr.setRa("94191919194");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT05CadastrarUsuarioComNomeInvalidos() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome(null);
			usr.setRa("94191919194");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT06CadastrarUsuarioPegaNome() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome("Vinicius");
			usr.setRa("94191919194");
			assertEquals("Vinicius", usr.getNome());
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT07CadastrarUsuarioPegaRA() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome("Vinicius");
			usr.setRa("94191919194");
			assertEquals("94191919194", usr.getRa());
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT08CadastrarUsuarioEquals() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome("Vinicius");
			usr.setRa("94191919194");
			assertEquals(true, usr.equals(usr));
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT09CadastrarUsuarioEquals() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome("Vinicius");
			usr.setRa("94191919194");
			assertEquals(false, usr.equals(null));
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}


	@Test
	public void CT10CadastrarUsuarioEquals() {
		try {
			// cenario
			Usuario usr = new Usuario();
			// acao
			usr.setNome("Vinicius");
			usr.setRa("94191919194");
			assertEquals(false, usr.equals(usr.getClass()));
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
}


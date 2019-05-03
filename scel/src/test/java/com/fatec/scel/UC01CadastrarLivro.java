package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.scel.model.Livro;

public class UC01CadastrarLivro {
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02CadastrarComISBNInvalido() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn(null);
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	@Test
	public void CT03CadastrarComISBNInvalido() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	@Test
	public void CT04CadastrarComTituloInvalido() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("111231");
			umLivro.setTitulo(null);
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("titulo invalido", e.getMessage());
		}
	}
	@Test
	public void CT05CadastrarComTituloInvalido() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("111231");
			umLivro.setTitulo("");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("titulo invalido", e.getMessage());
		}
	}
	@Test
	public void CT06CadastrarComAutorInvalido() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("111231");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor(null);
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("autor invalido", e.getMessage());
		}
	}
	@Test
	public void CT07CadastrarComAutorInvalido() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("111231");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("autor invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT08CadastrarTestaPegaISBN() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
			assertEquals("121212", umLivro.getIsbn());
			
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("isbn invalido", e.getMessage());			
		}
	}
	
	@Test
	public void CT09CadastrarTestaPegaTitulo() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
			assertEquals("Engenharia de Software", umLivro.getTitulo());
			
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("titulo invalido", e.getMessage());			
		}
	}
	
	@Test
	public void CT09CadastrarTestaPegaAutor() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
			assertEquals("Pressman", umLivro.getAutor());
			
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("autor invalido", e.getMessage());			
		}
	}
}
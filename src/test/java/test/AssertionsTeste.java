package test;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import application.Pessoa;

//fazendo importações estáticas, pode ajudar quando
//for necessário fazer varios testes, repetir menos o codigo

//PRIMEIRA FORMA...
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertEquals;

//SEGUNDA FORMA, E MAIS CLEAN
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

	@Test
	void validarLancamento() {
		
		int[] lancamento1 = {10, 20, 30, 40, 50};
		int[] lancamento2 = {10, 20, 30, 40, 50};
//		Como ficaria sem importação estática
		assertArrayEquals(lancamento1, lancamento2);
	}
	
	@Test
	void validarSeObjetoEhNulo() {
		Pessoa pessoa = null;
//		Como ficaria sem importação estática Assertions.assertNull(pessoa);

		assertNull(pessoa);
		
		pessoa = new Pessoa("Luciano", LocalDate.now());
//		Como ficaria sem importação estática (/////)
		assertNotNull(pessoa);		
	}
	
	@Test
	void validarNumverosDeTiposDiferentes() {
		
		double valor = 5.0;
		double outroValor = 5.0;		
//		Como ficaria sem importação estática (/////)
		assertEquals(valor, outroValor);
	}
}

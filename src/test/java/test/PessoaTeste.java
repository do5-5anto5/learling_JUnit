package test;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import application.Pessoa;

public class PessoaTeste {
	
	@Test
	void validarCalculoDeIdade() {
		Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020,  1, 1));
		Assertions.assertEquals(2, pessoa.getIdade());
	}
	
	@Test
	void deveCalcularIdadeCorretamente() {
		Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000,  1, 1));
		Assertions.assertEquals(22,  jessica.getIdade()
				);
	}
	
	@Test
	void deveRetornarSeEhMaiorDeIdade() {
		Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000,  1, 1));
		Pessoa joao = new Pessoa("Joao", LocalDate.of(2000,  1, 1));

		Assertions.assertTrue(jessica.ehMaiorDeidade());
		Assertions.assertTrue(joao.ehMaiorDeidade());
	}

}

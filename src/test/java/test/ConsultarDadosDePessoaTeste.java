package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import application.BancoDeDados;
import application.Pessoa;

public class ConsultarDadosDePessoaTeste {
	
	/*usar @AfterAll e @BeforeAll para simular uma abertura e fechamento de
	conexão com um banco de dados antes de comecar os testes, e depois que acabar todos;
	*
	*user @AfterEach e @BeforeEach para definir que um metodo aconteca
	antes e depois de cada teste;
	*/ 
	
	@BeforeAll
	static void configuraConexãoComBancoDeDados() {
		BancoDeDados.iniciarCnexao();
		System.out.println("Rodou configuraConexao.");
	}
	
	
	
	
	@BeforeEach
	void insereDadosParaTest() {
		BancoDeDados.insereDados(new Pessoa("Joao", LocalDate.of(2000, 1, 10)));
	}
	
	@AfterEach
	void removeDadosDoTest() {
		BancoDeDados.removeDados(new Pessoa("Joao", LocalDate.of(2000, 1, 10)));
		
	}
	
	
	@Test
	void validarDadosDeRetorno() {
		assertTrue(true);
		
	}

	@AfterAll
	static void finalizaConexãoComBancoDeDados() {
		BancoDeDados.finalizarConexao();
		System.out.println("Rodou finalizaConexao.");
	}
}

package test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import application.Conta;
import application.Pessoa;
import application.Transferencia;

public class ExceptionsTeste {

	@Test
	void validarCenarioDeExcessaoNaTransferencia() {

		Conta contaOrigem = new Conta(new Pessoa(), 123456, 0);
		Conta contaDestino = new Conta(new Pessoa(), 678912, 100);

		Transferencia transferenciaEntreContas = new Transferencia();

		//testa se será lançada exceção
		assertThrows(IllegalArgumentException.class,
				() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
		
		//testa se não será lançada exceção
		assertDoesNotThrow( () -> 
		transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
	}


}

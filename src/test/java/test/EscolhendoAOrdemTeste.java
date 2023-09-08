package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.Random.class)
public class EscolhendoAOrdemTeste {

	
	
	@Test
	void validaFluxoA() {
		assertTrue(true);
	}
	
	@Test
	void validaFluxoB() {
		assertTrue(true);
	}
	
	@Test
	void validaFluxoC() {
		assertTrue(true);
	}
	
	@Test
	void validaFluxoD() {
		assertTrue(true);
	}
}

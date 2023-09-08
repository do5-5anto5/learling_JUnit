package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

	
	@DisplayName("A")
	@Test
	void validaFluxoA() {
		assertTrue(true);
	}
	
	@DisplayName("B")
	@Test
	void validaFluxoB() {
		assertTrue(true);
	}
	
	@DisplayName("C")
	@Test
	void validaFluxoC() {
		assertTrue(true);
	}
	
	@DisplayName("D")
	@Test
	void validaFluxoD() {
		assertTrue(true);
	}
}

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
	
	@Test
	void validarAlgoSomenteNoUsuarioWillyan() {
		
		Assumptions.assumeFalse("root".equals(System.getenv("USER")));
		assertEquals(10, 5+5);
	}
	
}

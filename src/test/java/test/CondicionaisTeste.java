package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

public class CondicionaisTeste {
	
//	@EnabledIfEnvironmentVariable (named ="USER", matches = "willyan")
//	@DisabledIfEnvironmentVariable (named ="USER", matches = "root")
	
	
//	@EnabledOnOs(OS.WINDOWS)
//	@EnabledOnJre(value = JRE.JAVA_17)
	@EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_19)
	
	@Test
	void validarAlgoSomenteNoUsuarioWillyam() {
		
		assertEquals(10, 5+5);
	}

}

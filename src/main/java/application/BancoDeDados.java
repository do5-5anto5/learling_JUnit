package application;

import java.util.logging.Logger;

public class  BancoDeDados{
	
	private static final Logger LOGGER = 
			Logger.getLogger(BancoDeDados.class.getName());

	public static void iniciarCnexao() {
		LOGGER.info("iniciou conexão");		
	}
	
	public static void insereDados(Pessoa pessoa) {
		LOGGER.info("inseriu dados");
	}
	public static void removeDados(Pessoa pessoa) {
		LOGGER.info("removeu dados");
	}

	public static void finalizarConexao() {
		LOGGER.info("fechou conexão");		
	}
}

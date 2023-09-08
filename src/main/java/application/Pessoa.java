package application;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

	private String nome;
	private LocalDate dataDeNascimento;

	public Pessoa() {}
	public Pessoa(String nome, LocalDate dataDeNascimento) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate dataDeNascimento() {
		return dataDeNascimento;
	}

	public void dataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(dataDeNascimento, LocalDate.now());
	}
	
	public boolean ehMaiorDeidade() {
		return getIdade() >= 18;
	}

}

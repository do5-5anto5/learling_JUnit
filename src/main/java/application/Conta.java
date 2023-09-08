package application;

public class Conta {
	
	private Pessoa pessoa;
	private int numeroDaConta;
	private int saldo;
	
	public Conta (Pessoa pessoa, int numeroDaConta, int saldo) {
		this.pessoa = pessoa;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void lancaCredito(int valor) {
        this.saldo += valor;
    }

    public void lancaDebito(int valor) {
        this.saldo -= valor;
    }
	
}

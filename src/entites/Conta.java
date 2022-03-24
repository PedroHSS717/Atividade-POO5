package entites;

public class Conta {
	private String titular;
	private Integer numConta;
	protected double saldo;
	
	public void depositar(Double depositar) {
		this.saldo += depositar;
	}
	public void sacar(Double sacar) {
		this.saldo = this.saldo - sacar;
	}
	
	public Conta(String titular, Integer numConta, Double saldo) {
		super();
		this.titular = titular;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	}




package entites;

public class ContaCorrente extends Conta{
	
	
	public ContaCorrente(String titular, Integer numConta, Double saldo) {
		super(titular, numConta, saldo);
	}
	public void sacar(Double saque, Double taxa) {
		this.setSaldo(this.getSaldo() - saque - taxa);
	}
	public void depositar(Double depositar) {
		this.setSaldo(this.getSaldo() + depositar);
	}
	@Override
	public String toString() {
		return "Conta Corrente [titular= " + this.getTitular() + ", numConta= " + this.getNumConta() + ", saldo= R$ " + this.getSaldo() + "]";
}
	public Double getSaldo() {
		
		return null;
	}

}

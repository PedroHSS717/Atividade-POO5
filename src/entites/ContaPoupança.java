package entites;

public class ContaPoupança extends Conta{

	public ContaPoupança(String titular, Integer numConta, Double saldo) {
		super(titular, numConta, saldo);
	}
	public void depositar(Double deposito, double rend) {
		this.setSaldo(this.getSaldo() + (deposito + rend));
	}
	public void sacar(Double sacar) {
		this.setSaldo(getSaldo() - sacar);
	}
	@Override
	public String toString() {
		return "Conta Poupança [titular= " + this.getTitular() + ", numConta= " + this.getNumConta() + ", saldo= R$ " + this.getSaldo() + "]";
				

}
	
	
}	
		


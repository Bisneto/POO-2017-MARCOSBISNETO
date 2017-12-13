
package Model;

public abstract class Conta {
    protected double Saldo;
	
	public void Depositar(double Valor) {
		this.Saldo += Valor;
	}
	
	public void Sacar(Double Valor) {
		this.Saldo -= Valor;
	}
	
	public double GetSaldo() {
		return this.Saldo;
	}
	
	public void SetSaldo(double valor) {
		this.Saldo = valor;
	}
	
	public abstract void Atualiza(double taxa);
    
}

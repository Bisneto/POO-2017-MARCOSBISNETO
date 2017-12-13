
package Model;

public class ContaCorrente extends Conta {
    	public void Atualiza(double taxa) {
		 this.SetSaldo(this.GetSaldo() + this.GetSaldo() * taxa * 2);
	}
	public void Depositar(double valor) {
		this.Saldo += valor - 0.1;
	}

}


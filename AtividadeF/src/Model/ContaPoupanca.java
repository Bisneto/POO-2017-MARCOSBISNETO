//atividade f 
package Model;

public class ContaPoupanca extends Conta {
    	@Override
	public void Atualiza(double taxa) {
		this.SetSaldo(this.GetSaldo() + this.GetSaldo() * taxa * 3);
	}

}
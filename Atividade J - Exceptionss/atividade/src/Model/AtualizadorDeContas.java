
package Model;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
	private double selic;
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	public void roda(Conta c) {
		System.out.printf("O saldo era: " ,c.GetSaldo(), "\n");
		c.Atualiza(this.selic);
		System.out.printf("O seu saldo atual: " ,c.getClass() , "\n");
		this.saldoTotal += c.GetSaldo();
		
	}
	public double GetSaldoTotal() {
		return this.saldoTotal;
	}
	
}
    
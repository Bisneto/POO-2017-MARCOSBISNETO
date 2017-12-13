/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import Model.*;

public class TesteContas {
    
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
			
		c.Depositar(630);
		cc.Depositar(630);
		cp.Depositar(630);
			
		c.Atualiza(0.1);
		cc.Atualiza(0.1);
		cp.Atualiza(0.1);
			
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
			
			
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
			
		System.out.printf("Saldo Total: ", adc.GetSaldoTotal() , "\n");   
	}
		
}


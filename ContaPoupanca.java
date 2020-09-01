package teste_GFT;

public class ContaPoupanca  extends Conta  {
 
	public void rendimento() {
	double resultado=getSaldo()*0.05;
	}
	
	@Override
	public double  calcularImposto(){
		double saldo=200;
		saldo=saldo*0.10;
		return saldo;
	}
	
}

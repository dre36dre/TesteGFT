package teste_GFT;

public class ContaCorrente extends Conta {

	public void rendimento() {
		
		double resultado=getSaldo()*0.03;
	}
	
	@Override
	public double  calcularImposto(){
		double saldo=300;
		saldo=saldo*0.25;
		return saldo;
	}
}

package teste_GFT;

public abstract class  Conta {
	int numero;
	int titular;
	double saldo;
	
	public abstract void rendimento();
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getTitular() {
		return titular;
	}
	public void setTitular(int titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double calcularImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

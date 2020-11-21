package tp_poo;

public class Cuenta {
	
	private double saldo;
	
	
	Cuenta (double saldo){
		this.saldo=saldo;
	}
	
	
	public double verSaldo() {
		return saldo;
	}
	public void cambiarSaldo(double saldo) {	
			this.saldo=saldo;
	}
	
	
	
	
}

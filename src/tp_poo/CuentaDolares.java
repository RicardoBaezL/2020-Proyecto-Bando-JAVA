package tp_poo;

public class CuentaDolares {
	private double saldoDolares;
	
	
	CuentaDolares (double saldoDolares){
		this.saldoDolares=saldoDolares;
	}
	
	
	public double verSaldoDolares() {
		return saldoDolares;
	}
	public void cambiarSaldoDolares(double saldoDolares) {	
			this.saldoDolares=saldoDolares;
	}
	
	
}

package tp_poo;

public class Cliente {

	
	private Cuenta saldoCuenta;
	private CuentaDolares saldoCuentaDolares;
	
	Cliente(Cuenta saldoCuenta, CuentaDolares saldoCuentaDolares){	
		this.saldoCuenta=saldoCuenta;
		this.saldoCuentaDolares=saldoCuentaDolares;
	}	
	public Cuenta verSaldoCuenta() {
		return  this.saldoCuenta;
	}
	
	Cliente(CuentaDolares saldosCuetaDolares){	
		this.saldoCuentaDolares=saldosCuetaDolares;
		
	}
	
	public CuentaDolares verSaldoCuentaDolares() {
		return  this.saldoCuentaDolares;
	}
	
	
	public double comprarDolares( double cantidadCompra) {
		double cambiarPesos= cantidadCompra*136;
		
		saldoCuenta.cambiarSaldo(saldoCuenta.verSaldo()-cambiarPesos);
		saldoCuentaDolares.cambiarSaldoDolares(saldoCuentaDolares.verSaldoDolares()+cantidadCompra);
		return cantidadCompra;
		}
	
	public double venderDolares(double cantidadVentaDolares) {
		
		double cambiarDolaresPesos=cantidadVentaDolares*136;
		saldoCuenta.cambiarSaldo(saldoCuenta.verSaldo()+cambiarDolaresPesos);
		saldoCuentaDolares.cambiarSaldoDolares(saldoCuentaDolares.verSaldoDolares()-cantidadVentaDolares);
		return cantidadVentaDolares;
	}
	
		
	
	
	
	
	
	
}

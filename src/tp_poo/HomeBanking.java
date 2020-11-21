package tp_poo;

public class HomeBanking {
	
	

	public double ComprarDolares(Cliente cliente, double dolares) {

		return cliente.comprarDolares(dolares);

	}
	public double VernderDolares(Cliente cliente, double cantidadDolaresVende) {
		return cliente.venderDolares(cantidadDolaresVende);
	}
	
	public double TransferirPesos(Cliente cliente, double cantidadTransferenciaPesos) {
		double cambioSaldoPesos=cliente.verSaldoCuenta().verSaldo()-cantidadTransferenciaPesos;
		cliente.verSaldoCuenta().cambiarSaldo(cambioSaldoPesos);
		return cantidadTransferenciaPesos;
	}
	public double TransferirDolares(Cliente cliente, double cantidadTransferenciaDolar) {
		double cambioSaldoDolar=cliente.verSaldoCuentaDolares().verSaldoDolares()-cantidadTransferenciaDolar;
		cliente.verSaldoCuentaDolares().cambiarSaldoDolares(cambioSaldoDolar);
		return cantidadTransferenciaDolar;
	}


}

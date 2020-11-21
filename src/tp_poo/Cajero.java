package tp_poo;
import java.util.Random;

import javax.swing.JOptionPane;

public class Cajero {

	private Cliente saldoCliente;
	private boolean activo;

	public void estaActivo() {
		if (activo = true) {
			System.out.print("Cajero Activo \n");
		} else {
			System.out.print("Esta Fuera de Servicio");
		}
	}

	public double verSaldoCliente() {
		return this.saldoCliente.verSaldoCuenta().verSaldo();
	}

	public double cambioSaldoCliente(Cliente cliente, double cantidad) {
		double saldoCambio = cliente.verSaldoCuenta().verSaldo() - cantidad;
		cliente.verSaldoCuenta().cambiarSaldo(saldoCambio);
		return cantidad;
	}

	public double depositoCheque(Cliente cliente, double montoCheque) {
		double sumoSaldoCheque = cliente.verSaldoCuenta().verSaldo() + montoCheque;
		cliente.verSaldoCuenta().cambiarSaldo(sumoSaldoCheque);
		return montoCheque;
	}

	public double deposito_dinero(Cliente cliente, double montoDinero) {
		double sumoSaldoDinero = cliente.verSaldoCuenta().verSaldo() + montoDinero;
		cliente.verSaldoCuenta().cambiarSaldo(sumoSaldoDinero);
		return montoDinero;
	}

	public double transferenciaMonto(Cliente cliente, double montoTransferencia) {
		double transferencia = cliente.verSaldoCuenta().verSaldo() - montoTransferencia;
		cliente.verSaldoCuenta().cambiarSaldo(transferencia);
		return montoTransferencia;
	}

	public void armoClaveHb(Cliente cliente) {
		Random rnd = new Random();
		int generaNumerosHb[] = new int[10];
		for (int i = 0; i < 9; i++) {
			generaNumerosHb[i] = rnd.nextInt(20);
			System.out.print(generaNumerosHb[i]);
		}

	}

}

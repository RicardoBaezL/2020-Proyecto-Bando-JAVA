package tp_poo;

import java.util.Random;

public class Sucursal {

	private boolean estadoSucursal;
	private String nombreSucursal;
	private int numeroSucursal;
	private String direccion;

	Random rnd = new Random();

	Sucursal(boolean estadoSucursal, String nombreSucursal, int numeroSucursal, String direccion) {
		this.estadoSucursal = estadoSucursal;
		this.nombreSucursal = nombreSucursal;
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;

	}

	void estaAbieretaSucursal() {

		estadoSucursal = rnd.nextBoolean();

		/*
		 * if (estadoSucursal == true) { System.out.println("Sucursal  Nº " +
		 * numeroSucursal + " abierta al publico"); } else {
		 * System.out.println("La sucursal se encuentra cerrada"); }
		 */

	}

	public boolean getEstadoSucursal() {
		return estadoSucursal;
	}

	public String getnombreSucursal() {
		return nombreSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getnumero() {
		return numeroSucursal;
	}

}

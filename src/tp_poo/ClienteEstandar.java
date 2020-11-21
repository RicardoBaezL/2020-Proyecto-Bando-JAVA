package tp_poo;

import java.util.Random;
import java.util.Scanner;

public class ClienteEstandar {

	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private int dni;
	private String sexo;
	private int claveCajero;
	private CuentaBancaria cuenta;
	private double cuentaSueldo;
	private double lineaCrediticia;
	private int numeroDeTarjeta;

	Scanner in = new Scanner(System.in);
	Random rnd = new Random();

	ClienteEstandar(String nombre, String apellido, String fechaDeNacimiento, int dni, String sexo, int claveCajero,
			int claveHomeBanking, double cuentaSueldo, double lineaCrediticia, int numeroDeTarjeta) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.claveCajero = claveCajero;
		this.cuentaSueldo = cuentaSueldo;
		this.lineaCrediticia = lineaCrediticia;
		this.numeroDeTarjeta = numeroDeTarjeta;

	}

	void ingresarSucursal(Sucursal sucursal) {
		sucursal.estaAbieretaSucursal();
	}

	void consultarDatosPersonales(ClienteEstandar clienteEstandar) {
		System.out.println("");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
		System.out.println("DNI: " + dni);
		System.out.println("Sexo: " + sexo);
		System.out.println("Numero de tarjeta: " + numeroDeTarjeta);
	}

	void retirarSueldo(ClienteEstandar clienteEstandar) { // Escenario cajero
		int claveIngresada;
		double importeExtraer;
		System.out.println("Ingrese su clave");
		claveIngresada = in.nextInt();

		if (claveIngresada == claveCajero) {
			System.out.println("Su saldo es de: ARS " + cuentaSueldo);
			System.out.print("Ingrese importe a retirar: ");
			importeExtraer = in.nextDouble();

			if (cuentaSueldo > importeExtraer) {
				System.out.println("Has retirado ARS " + importeExtraer + " satisfactoriamente");
				cuentaSueldo = cuentaSueldo - importeExtraer;
				System.out.println("Su saldo actual es de ARS " + cuentaSueldo);
			} else {
				System.out.println("IMPOSIBLE RETIRAR ESA CANTIDAD");
			}

		} else {
			System.out.println("CLAVE INCORRECTA");
			return;
		}
	}

	void consultarSaldo(ClienteEstandar clienteEstandar) {
		System.out.println("El saldo es de ARS: " + cuentaSueldo);
	}

	void solicitarCredito(ClienteEstandar clienteEstandar) {

		System.out.println("Bienvenido " + nombre + " " + apellido + " su linea crediticia disponible es de " + "ARS "
				+ lineaCrediticia);
		System.out.println("Ingrese monto que desea solicitar en prestamo");
		double importeSolicitudPrestamo = in.nextDouble();

		if (importeSolicitudPrestamo > lineaCrediticia) {
			System.out.println("El monto ingresado excede su linea crediticia");
		} else {
			lineaCrediticia = lineaCrediticia - importeSolicitudPrestamo;
			System.out.println("Usted dispone ahora de ARS " + importeSolicitudPrestamo);
			System.out.println("Posee un saldo en su linea crediticia de ARS " + lineaCrediticia);
		}
	}

	void invertidDinero(ClienteEstandar clienteEstandar) {

		System.out.println("Bienvenido " + nombre + " " + apellido + " usted dispone en su cuenta " + "ARS "
				+ cuentaSueldo + " para invertir");
		System.out.println(
				"Ingrese el monto que desea invertir, la modalidad vigente es plazo a 30 dias con un 3% de interes");
		double importeInvertido = 0;
		double importeInvertir = in.nextDouble();

		if (importeInvertir < cuentaSueldo) {

			importeInvertido = importeInvertir * 1.03;
			cuentaSueldo = cuentaSueldo - importeInvertir;

			System.out.println(
					"Usted a invertido ARS " + importeInvertir + ", su saldo actual es de ARS " + cuentaSueldo);
			System.out.println(
					"Una vez transcurridos 30 dias, dispondra en su cuenta un total de ARS + " + importeInvertido);

		} else {
			System.out.println("No dispone de esa cantidad para invertir");
		}

	}

	void usarTarjeta(ClienteEstandar clienteEstandar) {

		int tipoDeUso = rnd.nextInt(3);
		System.out.println("Prueba: " + tipoDeUso);
		// Debito de un servicio //Pagar un comercio //Ingresar en cajero para..

		if (tipoDeUso == 0) {
			System.out.println("Se ha debitado el servicio satisfactoriamente");
		} else if (tipoDeUso == 1) {
			System.out.println("Has realizado el pago de tu compra con éxito");
		} else if (tipoDeUso == 2) {
			System.out.println("Problemas con el metodo retirar dinero");
		} else {
			return;
		}

	}

	void usarCajeroAutomatico(ClienteEstandar clienteEstandar) {

		// Ser o no ser
	}

	
	public int getDni() {
		return dni;
	}

}

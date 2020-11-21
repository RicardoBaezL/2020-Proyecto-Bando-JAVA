package tp_poo;

import java.util.Random;
import java.util.Scanner;

public class AtencionPersonalizada {

	private String nombre;
	private String apellido;
	private int dni;
	private int legajo;

	Random rnd = new Random();

	AtencionPersonalizada(String nombre, String apellido, int dni, int legajo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
	}

	Scanner in = new Scanner(System.in);

	void recibirClientePotencial(AtencionPersonalizada atencionPersonalizada) {
		System.out.println("Accion de alta cliente");

		System.out.println(
				"Si sus ingresos mensuales son inferiores a ARS 20.000, ingrese (1)\nSi sus ingresos son superiores a ARS 20.000, ingrese (2)\nSi sus ingresos son superiores a ARS 25.000, ingrese (3)");

		int tipoCliente = in.nextInt();

		switch (tipoCliente) {

		case 1:

			System.out.println(
					"Usted cuenta con los requicitos para abrir una cuenta de tipo Cliente Estandar, si desea avanzar con el alta ingrese (1), para cancelar el proceso ingrese cualquier tecla.");

			int opcion = in.nextInt();
			if (opcion == 1) {

				ClienteEstandar pedro = new ClienteEstandar("Pedro", "Rivas", "01/05/1987", 35233667, "Masculino", 1111,
						2222, 0, 15000, 123456789);
				System.out.println("Cuenta creada con exito:");
				System.out.println("");
				pedro.consultarDatosPersonales(pedro);

			} else {
				System.out.println("De acuerdo, puede volver cuando desee, gracias por su visita.");
			}

			break;

		case 2:

			System.out.println(
					"Usted cuenta con los requicitos para abrir una cuenta de tipo Cliente Empresas, si desea avanzar con el alta ingrese (1), para cancelar el proceso ingrese cualquier tecla.");

			opcion = in.nextInt();
			if (opcion == 1) {

				ClienteEmpresas clienteEmpresaUno = new ClienteEmpresas("Pedro", "Rivas", "01/05/1987", 35233667,
						"Masculino", 1111, 2222, 0, 15000, 10000);

				System.out.println("Cuenta creada con exito:");
				System.out.println("");
				clienteEmpresaUno.consultarDatosPersonales(clienteEmpresaUno);

			} else {
				System.out.println("De acuerdo, puede volver cuando desee, gracias por su visita.");
			}

			break;

		case 3:

			System.out.println(
					"Usted cuenta con los requicitos para abrir una cuenta de tipo Cliente Premium, si desea avanzar con el alta ingrese (1), para cancelar el proceso ingrese cualquier tecla.");

			opcion = in.nextInt();
			if (opcion == 1) {

				ClientePremium clientePremiumUno = new ClientePremium("Alex", "Rodriguez", "18/04/1997", 32111444, "Masculino", 3333, 4444, 0, 12345874, 10000);
				System.out.println("Alta cliente realizada");
				System.out.println("");
				clientePremiumUno.consultarDatosPersonales(clientePremiumUno);

			} else {
				System.out.println("De acuerdo, puede volver cuando desee, gracias por su visita.");
			}

			break;

		}
	}

	void recibirTicker() {

		int ticket = rnd.nextInt(4);
		String tipoDeServicioBrindar;

		switch (ticket) {
		case 0:
			tipoDeServicioBrindar = "Otorgar Prestamo";
			System.out.println("Bienvenido, tu asesora " + nombre + " " + apellido
					+ " te asesorará sobre la adquisición de un prestamo");

			break;

		case 1:
			tipoDeServicioBrindar = "Cerrar Cuenta";
			System.out.println(
					"Bienvenido, tu asesora " + nombre + " " + apellido + " te asesorará sobre el cierre de tu cuenta");

			break;

		case 2:
			tipoDeServicioBrindar = "Cambiar tipo de Cuenta";
			System.out.println("Bienvenido, tu asesora " + nombre + " " + apellido
					+ " te asesorará respecto los tipos de cuenta disponibles");

			break;

		case 3:
			tipoDeServicioBrindar = "Derivar atencion Ventanilla";
			System.out.println("Tu asesora " + nombre + " " + apellido
					+ " te deriva para continuar la gestion en sector de ventanillas");

			break;

		default:

		}

	}

}

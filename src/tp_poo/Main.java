package tp_poo;

import java.awt.dnd.DnDConstants;
import java.io.ObjectInputStream.GetField;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner in = new Scanner(System.in);

		Sucursal casaCentral = new Sucursal(true, "Forest", 1, "Forest 1500");
		ClienteEstandar emmanuel = new ClienteEstandar("Emmanuel", "Lopez", "18/06/90", 35233665, "Masculino", 1310,
				2020, 10.50, 50.000, 1234567890);

		RecepcionAutomatica autoGestion = new RecepcionAutomatica(true, 1, 22, 0);
		RecepcionManual gestionHumana = new RecepcionManual("Daniela", "Guzman", 14097951, 11000, 0);
		AtencionPersonalizada magdalena = new AtencionPersonalizada("Magdalena", "Carrizo", 35120759, 11);
		
		///Objeto Ricky
		Cajero cajero = new Cajero();
		Cliente cliente = new Cliente(new Cuenta(100000), new CuentaDolares(2000));
		HomeBanking HomeBanking=new HomeBanking();
		//----
		// Magdalena.recibirTicker();

		// Emmanuel.consultarDatosPersonales(Emmanuel);
		// System.out.println("");
		// Emmanuel.consultarSaldo(Emmanuel);
		// System.out.println("");
		// Emmanuel.retirarSueldo(Emmanuel);
		// Emmanuel.solicitarCredito(Emmanuel);
		// Emmanuel.invertidDinero(Emmanuel);
		// Emmanuel.usarTarjeta(Emmanuel);

		int opcionCliente=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion que quiere tomar: \n1 - Si quiere "
				+ "cajero \n2 - si quiere ir al home banking \n3 - si quiere ir al la sucursal"));
		
		if(opcionCliente==1) {
		// Arranca cajero
			int opciones = Integer.parseInt(JOptionPane.showInputDialog(
					"Bienvenido! \n1 -Si desea ver saldo\n2 -Para retirar dinero \n3 -Depositar Cheque \n4 -Depositar Efectivo \n5 -Para hacer transferencia \n6 -Generar clave HomeBanking \n0 -Para dejar de operar"));

			while (opciones != 0) {
				if (opciones == 1) {
					System.out.print("Su saldo es:" + "$" + cliente.verSaldoCuenta().verSaldo() + "\n");
				} else if (opciones == 2) {
					double retiraDinero = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea retirar?"));
					if (cliente.verSaldoCuenta().verSaldo() >= retiraDinero) {
						System.out.print("Retiro: " + "$" + cajero.cambioSaldoCliente(cliente, retiraDinero)+ " .Su saldo actual es: " + "$" + cliente.verSaldoCuenta().verSaldo() + "\n");
					} else {
						System.out.print("No tiene saldo suficiente para retirar\n");
					}
				} else if (opciones == 3) {
					double depositaCheque = Double.parseDouble(JOptionPane.showInputDialog("Indique el monto del cheque a depositar"));
					System.out.print("El cheque que deposito tiene un monto de: " + "$"+ cajero.depositoCheque(cliente, depositaCheque) + " Su saldo es: " + "$"
							+ cliente.verSaldoCuenta().verSaldo() + "\n");
				} else if (opciones == 4) {
					double depositaDinero = Double.parseDouble(JOptionPane.showInputDialog("Indique el monto del dinero a depositar") + "\n");
					System.out.print("Usted deposito: " + "$" + cajero.deposito_dinero(cliente, depositaDinero)+ " Su saldo es: " + "$" + cliente.verSaldoCuenta().verSaldo() + "\n");
				} else if (opciones == 5) {
					double transfereciaDinero = Double.parseDouble(JOptionPane.showInputDialog("Cual es el monto que desea transferir?") + "\n");
					if (cliente.verSaldoCuenta().verSaldo() >= transfereciaDinero) {
						System.out.print("Usted transfirio: " + "$" + cajero.transferenciaMonto(cliente, transfereciaDinero)
										+ " Su saldo es: " + "$" + cliente.verSaldoCuenta().verSaldo() + "\n");
					} else {
						System.out.print("No tiene saldo suficiente para transferir\n");
					}
				} else if (opciones == 6) {
					cajero.armoClaveHb(cliente);
				}
				opciones = Integer.parseInt(JOptionPane.showInputDialog(
						"Desea hacer otro operacion? \n1 -Si desea ver saldo\n2 -Para retirar dinero \n3 -Depositar Cheque \n4 -Depositar Efectivo \n5 -Para hacer transferencia \n6 -Generar clave HomeBanking \n0 -Para dejar de operar"));
				
			// termina cajero
					
			}}else if(opcionCliente==2) {
			
			// arranca home banking
					
			int opciones=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a Home Banking. \n1 -Si desea comprar dolares \n2 -Si desea vender dolares \n3 -Si desea hacer una transferencia \n0 -Si desea salir."));
			while(opciones!=0) {
				if(opciones==1) {
					
						double comprarDolares=Double.parseDouble(JOptionPane.showInputDialog("Cuantos dolares quiere comprar?"));
						if(cliente.verSaldoCuenta().verSaldo()>=comprarDolares*136) {
						HomeBanking.ComprarDolares(cliente, comprarDolares);
						System.out.print("Su saldo es: $"+cliente.verSaldoCuentaDolares().verSaldoDolares()+"\n");
						}else {
						System.out.print("No tiene suficiente saldo para comprar\n");
				}}else if(opciones==2) {
					
						double venderDolares=Double.parseDouble(JOptionPane.showInputDialog("Cuantos dolares quiere vender?"));			
						if(cliente.verSaldoCuentaDolares().verSaldoDolares()>=venderDolares) {
						HomeBanking.VernderDolares(cliente, venderDolares);
						System.out.print("Ustede vendio: $"+venderDolares+"\n");
						}else {
						System.out.print("No tiene suficiente saldo para vender\n");
						}	
				   }else if(opciones==3){   	
				    	int masOpciones=Integer.parseInt(JOptionPane.showInputDialog("Ingrese \n1 para transferir pesos \n2 para transferir dolares"));
				    	if(masOpciones==1) {
					    double cantidadTransferencia=Double.parseDouble(JOptionPane.showInputDialog("Cuantos quiere transferir?"));
					    	if(cliente.verSaldoCuenta().verSaldo()>=cantidadTransferencia) {
					    	HomeBanking.TransferirPesos(cliente, cantidadTransferencia);
						    System.out.print("Usted transfirio: $"+cantidadTransferencia+" pesos\n");
					    	}else {
					    		System.out.print("No tiene fondos suficientes para transferir.\n");
					    }}else if(masOpciones==2) {
				    		double cantidadTransferenciaDolares=Double.parseDouble(JOptionPane.showInputDialog("Cuantos quiere transferir?"));
				    		HomeBanking.TransferirDolares(cliente, cantidadTransferenciaDolares);
				    		System.out.print("Usted transfirio: $"+cantidadTransferenciaDolares+" dolares\n");
					    	}else {
				    		System.out.print("No tiene fondos suficientes para transferir.\n");
					    	}
				
			}
				opciones=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a Home Banking. \n1 -Si desea comprar dolares \n2 -Si desea vender dolares \n3 -Si desea hacer una transferencia \n0 -Si desea salir."));
			}//termina home banking		
		}else if(opcionCliente==3) {
			
			//arraca entrada a la sucursal
			casaCentral.estaAbieretaSucursal();

			if (casaCentral.getEstadoSucursal() == true) {
				System.out.println("La sucursal " + casaCentral.getnombreSucursal() + " (Nº" + casaCentral.getnumero()
						+ ") se encuentra cerrada.");
			} else {
				System.out.println("Bienvenido a sucursal " + casaCentral.getnombreSucursal() + " (Nº"
						+ casaCentral.getnumero() + ").");
				
				int accionCliente = rnd.nextInt(2);

				switch (accionCliente) {
				case 0:
					System.out.println("Usted ha decidido ingresar a zona comercial");

					int proceso = rnd.nextInt(2);

					if (proceso == 0) {
						System.out.println("Conozco proceso, me dirijo a Recepcion Automatico");

						autoGestion.pedirDni(null);

						if (autoGestion.getDniCliente() == emmanuel.getDni()) {
							emmanuel.consultarDatosPersonales(emmanuel);
							System.out.println("");
							System.out.println(
									"Por favor,ingrese una accion para conitnuar:\n Atencion Personalizada ingrese (1) \n Atencion Ventanilla ingrese (2)");

							String tipoDeAtencion = in.next();

							if (tipoDeAtencion.equalsIgnoreCase("1")) {
								System.out.println("Usted fue derivado a Atencion Personalizada, ¿Que desea realizar?");
								System.out.println(
										"Solicitar Prestamo, ingrese (1)\nCerrar Cuenta, ingrese (2)\nCambiar tipo de Cuenta. ingrese (3)\n");

							} else if (tipoDeAtencion.equalsIgnoreCase("2")) {
								System.out.println("Usted fue derivado a Atencion Ventanilla, ¿Que desea realizar?");
								System.out.println(
										"Hacer un deposito, ingrese (1)\nPagar Tarjeta, ingrese (2)\nVender moneda extranjera, ingrese (3)\nComprar moneda extranjera, ingrese (4)\n");

							} else {
								System.out.println("Accion definida inexistente");
							}

						} else {
							System.out.println(
									"DNI ingresado no pertenece a nuestra base de datos.\nSi desea abrir una cuenta ingrese (1)\nPara finalizar presione cualquier tecla");
							int accionCuenta = in.nextInt();
							if (accionCuenta == 1) {

								magdalena.recibirClientePotencial(magdalena);

							} else {
								System.out.println("Consulta finalizada");
							}
						}

					} else {
						System.out.println("No conozco proceso, solicito atencion Recepcionista");

						gestionHumana.pedirDni(null);

						if (gestionHumana.getDniCliente() == emmanuel.getDni()) {
							emmanuel.consultarDatosPersonales(emmanuel);
							System.out.println("");
							System.out.println(
									"Por favor,ingrese una accion para conitnuar:\n Atencion Personalizada ingrese (1) \n Atencion Ventanilla ingrese (2)");

							String tipoDeAtencion = in.next();

							if (tipoDeAtencion.equalsIgnoreCase("1")) {
								System.out.println("Usted fue derivado a Atencion Personalizada, ¿Que desea realizar?");
								System.out.println(
										"Solicitar Prestamo, ingrese (1)\nCerrar Cuenta, ingrese (2)\nCambiar tipo de Cuenta. ingrese (3)\n");

							} else if (tipoDeAtencion.equalsIgnoreCase("2")) {
								System.out.println("Usted fue derivado a Atencion Ventanilla, ¿Que desea realizar?");
								System.out.println(
										"Hacer un deposito, ingrese (1)\nPagar Tarjeta, ingrese (2)\nVender moneda extranjera, ingrese (3)\nComprar moneda extranjera, ingrese (4)\n");

							} else {
								System.out.println("Accion definida inexistente");
							}

						} else {
							System.out.println(
									"DNI ingresado no pertenece a nuestra base de datos.\nSi desea abrir una cuenta ingrese (1)\nPara finalizar presione cualquier tecla");
							int accionCuenta = in.nextInt();
							if (accionCuenta == 1) {

								magdalena.recibirClientePotencial(magdalena);

							} else {
								System.out.println("Consulta finalizada");
							}
						}

					}

					break;
				case 1:
					System.out.println("Usted ha decidido utilizar un Cajero Automatico");

				default:
					break;
				}

			}			
			
					
		}else {
			System.out.println("Error");
			
		}
		
}}

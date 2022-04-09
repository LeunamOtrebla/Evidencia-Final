package codigofuente;

import java.util.Scanner;
import java.util.ArrayList;

public class Main_renta {
	public static ArrayList<Acuaticos> Lista_Acuaticos = new ArrayList<Acuaticos>();
	public static ArrayList<Aereos> Lista_Aereos = new ArrayList<Aereos>();
	public static ArrayList<Terrestres> Lista_Terrestres = new ArrayList<Terrestres>();
	public static ArrayList<registrorenta> Lista_registrorenta = new ArrayList<registrorenta>();
	public static ArrayList<Empleado> Lista_Empleado = new ArrayList<Empleado>();
	public static ArrayList<Cliente> Lista_Cliente = new ArrayList<Cliente>();
	public static boolean Respuesta= false;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoAc = new Scanner(System.in);
		Scanner tecladoAe = new Scanner(System.in);
		Scanner tecladoTe = new Scanner(System.in);
		Scanner tecladoRe = new Scanner(System.in);
		Scanner tecladoEm = new Scanner(System.in);
		Scanner tecladoCl = new Scanner(System.in);

		String Nombres = "";
		String Apellidos;
		String Correo = "";
		String Domicilio = "";
		String Fecha = "";
		String Sexo = "";
		String Cargo = "";
		int Num_empleado = 0;
		String Telefono = "";
		String RFC = "";
		String Licencia = "";
		String Fecha_nac = "";
		String NombreCl = "";
		String Estatus = "";
		String Marca = "";
		String Modelo = "";
		String Color = "";
		String Combustible = "";
		int Año = 0;
		int Puertas = 0;
		int Asientos = 0;
		String Num_Serie = "";
		int Poliza_Seguro = 0;
		int num_turbinas = 0;
		int num_élices = 0;
		int Num_Ejes = 0;
		String NumSerie="";
		int NumEmpleado=0;
		
		

		// Generaremos un ciclo que nos permita manipular
		// los objetos y la informacion que daremos de alta
		int opc = 0; // variable que permitira capturar información

		do {
			System.out.println("Dame una opción a realizar");
			System.out.println("1.-para capturar clientes");
			System.out.println("2.-para capturar empleado");
			System.out.println("3.-para capturar vehiculo terrestre");
			System.out.println("4.-para capturar vehiculo aéreos");
			System.out.println("5.-para capturar vehiculo acuáticos");
			System.out.println("6.-para capturar una renta");
			System.out.println("0.-para salir");
			opc = teclado.nextInt();
			switch (opc) {
			case 1:
				Cliente ObjetoCliente = new Cliente();

				System.out.println("Nombre del cliente");
				Nombres = tecladoCl.next();
				ObjetoCliente.setNombres(Nombres);
				System.out.println("Apellidos del cliente");
				Apellidos = tecladoCl.next();
				ObjetoCliente.setApellidos(Apellidos);
				System.out.println("Correo del cliente");
				Correo = tecladoCl.next();
				ObjetoCliente.setCorreo(Correo);
				System.out.println("Domicilio del cliente");
				Domicilio = tecladoCl.next();
				ObjetoCliente.setDomicilio(Domicilio);
				System.out.println("Ingresa la fecha de nacimiento del cliente con este formato 'dd/mm/yyyy'");
				Fecha_nac = tecladoCl.next();
				ObjetoCliente.setFecha_nac(Fecha_nac);
				System.out.println("Género del cliente");
				Sexo = tecladoCl.next();
				ObjetoCliente.setSexo(Sexo);
				System.out.println("Teléfono del cliente");
				Telefono = tecladoCl.next();
				ObjetoCliente.setTelefono(Telefono);
				System.out.println("Licencia del cliente");
				Licencia = tecladoCl.next();
				ObjetoCliente.setLicencia(Licencia);
				System.out.println("Se capturaron los datos del cliente");
				Lista_Cliente.add(ObjetoCliente);
				break;

			case 2:
				Empleado ObjetoEmpleado = new Empleado();

				System.out.println("Se captura el número del empleado");
				Num_empleado = tecladoEm.nextInt();
				ObjetoEmpleado.setNum_empleado(Num_empleado);
				System.out.println("Se captura el nombre del empleado");
				Nombres = tecladoEm.next();
				ObjetoEmpleado.setNombres(Nombres);
				System.out.println("Apellidos del empleado");
				Apellidos = tecladoEm.next();
				ObjetoEmpleado.setApellidos(Apellidos);
				System.out.println("Correo del empleado");
				Correo = tecladoEm.next();
				ObjetoEmpleado.setCorreo(Correo);
				System.out.println("Domicilio del empleado");
				Domicilio = tecladoEm.next();
				ObjetoEmpleado.setDomicilio(Domicilio);
				System.out.println("Inserta la fecha de nacimiento del empleado con este formato 'dd/mm/yyyy'");
				Fecha_nac = tecladoEm.next();
				ObjetoEmpleado.setFecha_nac(Fecha_nac);
				System.out.println("Género del empleado");
				Sexo = tecladoEm.next();
				ObjetoEmpleado.setSexo(Sexo);
				System.out.println("Teléfono del empleado");
				Telefono = tecladoEm.next();
				ObjetoEmpleado.setTelefono(Telefono);
				System.out.println("Cargo del empleado");
				Cargo = tecladoEm.next();
				ObjetoEmpleado.setCargo(Cargo);
				System.out.println("RFC del empleado");
				RFC = tecladoEm.next();
				ObjetoEmpleado.setRFC(RFC);

				Lista_Empleado.add(ObjetoEmpleado);
				break;

			case 3:
				Terrestres ObjetoTerrestres = new Terrestres();

				System.out.println("Año del vehículo terrestre");
				Año = tecladoTe.nextInt();
				ObjetoTerrestres.setAño(Año);
				System.out.println("Número de asientos del vehículo terrestre");
				Asientos = tecladoTe.nextInt();
				ObjetoTerrestres.setAsientos(Asientos);
				System.out.println("Color del vehículo terrestre");
				Color = tecladoTe.next();
				ObjetoTerrestres.setColor(Color);
				System.out.println("Tipo de combustible del vehículo terrestre");
				Combustible = tecladoTe.next();
				ObjetoTerrestres.setCombustible(Combustible);
				System.out.println("Marca del vehículo terrestre");
				Marca = tecladoTe.next();
				ObjetoTerrestres.setMarca(Marca);
				System.out.println("Modelo del vehículo terrestre");
				Modelo = tecladoTe.next();
				ObjetoTerrestres.setModelo(Modelo);
				System.out.println("Número de serie del vehículo terrestre");
				Num_Serie = tecladoTe.next();
				ObjetoTerrestres.setNum_Serie(Num_Serie);
				System.out.println("Poliza del seguro del vehículo terrestre");
				Poliza_Seguro = tecladoTe.nextInt();
				ObjetoTerrestres.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Número de puertas del vehículo terrestre");
				Puertas = tecladoTe.nextInt();
				ObjetoTerrestres.setPuertas(Puertas);
				System.out.println("Se captura el número de ejes del vehículo");
				Num_Ejes = tecladoTe.nextInt();
				ObjetoTerrestres.setNum_Ejes(Num_Ejes);

				Lista_Terrestres.add(ObjetoTerrestres);
				break;

			case 4:
				Aereos ObjetoAereos = new Aereos();

				System.out.println("Año del vehículo aéreo");
				Año = tecladoAe.nextInt();
				ObjetoAereos.setAño(Año);
				System.out.println("Número de asientos del vehículo aéreo");
				Asientos = tecladoAe.nextInt();
				ObjetoAereos.setAsientos(Asientos);
				System.out.println("Color del vehículo aéreo");
				Color = tecladoAe.next();
				ObjetoAereos.setColor(Color);
				System.out.println("Tipo de combustible del vehículo aéreo");
				Combustible = tecladoAe.next();
				ObjetoAereos.setCombustible(Combustible);
				System.out.println("Marca del vehículo aéreo");
				Marca = tecladoAe.next();
				ObjetoAereos.setMarca(Marca);
				System.out.println("Modelo del vehículo aéreo");
				Modelo = tecladoAe.next();
				ObjetoAereos.setModelo(Modelo);
				System.out.println("Número de serie del vehículo aéreo");
				Num_Serie = tecladoAe.next();
				ObjetoAereos.setNum_Serie(Num_Serie);
				System.out.println("Poliza del seguro del vehículo aéreo");
				Poliza_Seguro = tecladoAe.nextInt();
				ObjetoAereos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el número de puertas del vehículo aéreo");
				Puertas = tecladoAe.nextInt();
				ObjetoAereos.setPuertas(Puertas);
				System.out.println("Número de élices del vehículo");
				num_élices = tecladoAe.nextInt();
				ObjetoAereos.setNum_élices(num_élices);

				Lista_Aereos.add(ObjetoAereos);
				break;

			case 5:
				Acuaticos ObjetoAcuaticos = new Acuaticos();

				System.out.println("Año del vehículo acuático");
				Año = tecladoAc.nextInt();
				ObjetoAcuaticos.setAño(Año);
				System.out.println("Número de asientos del vehículo acuático");
				Asientos = tecladoAc.nextInt();
				ObjetoAcuaticos.setAsientos(Asientos);
				System.out.println("Color del vehículo acuático");
				Color = tecladoAc.next();
				ObjetoAcuaticos.setColor(Color);
				System.out.println("Tipo de combustible del vehículo acuático");
				Combustible = tecladoAc.next();
				ObjetoAcuaticos.setCombustible(Combustible);
				System.out.println("Marca del vehículo acuático");
				Marca = tecladoAc.next();
				ObjetoAcuaticos.setMarca(Marca);
				System.out.println("Modelo del vehículo acuático");
				Modelo = tecladoAc.next();
				ObjetoAcuaticos.setModelo(Modelo);
				System.out.println("Número de serie del vehículo acuático");
				Num_Serie = tecladoAc.next();
				ObjetoAcuaticos.setNum_Serie(Num_Serie);
				System.out.println("Poliza del seguro del vehículo acuático");
				Poliza_Seguro = tecladoAc.nextInt();
				ObjetoAcuaticos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Número de puertas del vehículo acuático");
				Puertas = tecladoAc.nextInt();
				ObjetoAcuaticos.setPuertas(Puertas);
				System.out.println("Número de turbinas del vehículo");
				num_turbinas = tecladoAc.nextInt();
				ObjetoAcuaticos.setNum_turbinas(num_turbinas);

				Lista_Acuaticos.add(ObjetoAcuaticos);
				break;

			case 6:
				registrorenta Objetoregistrorenta = new registrorenta();

				System.out.println("Estatus de la renta");
				Estatus = tecladoRe.next();
				Objetoregistrorenta.setEstatus(Estatus);
				System.out.println("Nombre(exacto) del cliente");
				NombreCl = tecladoRe.next();
				Objetoregistrorenta.setNombreCl(NombreCl);
				System.out.println("Número del empleado");
				NumEmpleado = tecladoRe.nextInt();
				Objetoregistrorenta.setNumEmpleado(NumEmpleado);
				System.out.println("Se captura la fecha de la renta con este formato 'dd/mm/yyyy'");
				Fecha = tecladoRe.next();
				Objetoregistrorenta.setFecha(Fecha);
				System.out.println("Se captura el número de serie del vehículo");
				NumSerie = tecladoRe.next();
				
				Objetoregistrorenta.setNumSerie(NumSerie);

				int opcion = 4;
				System.out.println(
						"Para validar existencia inserta 1: Si es vehículo terrestre, 2: Si es vehículo aereo y 3: Si es vehiculo acuático");
				opcion = tecladoRe.nextInt();
				if(opcion==0){
					
						System.out.println(
								"Ese número no está dispoblible, seleccione uno de los que se muestran a continuación:");
						System.out.println(
								"Para validar existencia inserta 1: Si es vehículo terrestre, 2: Si es vehículo aereo y 3: Si es vehiculo acuático");
						opcion = tecladoRe.nextInt();
				}else if(opcion==1) {
					
						Respuesta = Validaterrestres(Objetoregistrorenta.NumSerie, Lista_Terrestres);
						if (Respuesta == true) {
							Lista_registrorenta.add(Objetoregistrorenta);
							System.out.println("Se ha registrado la renta correctamente");

						} else {
							System.out.println("El vehiculo no está en existencia");

						}
						}else if(opcion==2) {
					
						Respuesta = Validaaereos(NumSerie, Lista_Aereos);
						if (Respuesta == true) {
							Lista_registrorenta.add(Objetoregistrorenta);
							System.out.println("Se ha registrado la renta correctamente");

						} else {
							System.out.println("El vehiculo no está en existencia");

						}
						}else if(opcion==3) {
					
						Respuesta = Validaacuaticos(Num_Serie, Lista_Acuaticos);
						if (Respuesta == true) {
							Lista_registrorenta.add(Objetoregistrorenta);
							System.out.println("Se ha registrado la renta correctamente");

						} else {
							System.out.println("El vehiculo no está en existencia");

						}

					}
				

				System.out.println("El proceso ha terminado");
				
			}
		} while (opc != 0);

	}

	public static boolean Validaterrestres(String NumSerie, ArrayList<Terrestres> Lista_Terrestres) {
		boolean Resultado = false;
		for (int x = 0; x < Lista_Terrestres.size(); x++) {
			if (Lista_Terrestres.get(x).getNum_Serie() == NumSerie) {
				Resultado = true;
				
			}
		}
		return Resultado;
	}

	public static boolean Validaaereos(String NumSerie, ArrayList<Aereos> Lista_Aereos) {

		boolean Resultado = false;
		for (int x = 0; x < Lista_Aereos.size(); x++) {
			if (Lista_Aereos.get(x).getNum_Serie() == NumSerie) {
				Resultado = true;
				
			}
		}
		return Resultado;
	}

	public static boolean Validaacuaticos(String NumSerie, ArrayList<Acuaticos> Lista_Acuaticos) {
		boolean Resultado = false;
		for (int x = 0; x < Lista_Acuaticos.size(); x++) {
			if (Lista_Acuaticos.get(x).getNum_Serie() == NumSerie) {
				Resultado = true;
				
			}
		}
		return Resultado;

	}

}

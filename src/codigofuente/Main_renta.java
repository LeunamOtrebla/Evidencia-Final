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
		int Licencia = 0;
		int LicenciaCl = 0;
		String Fecha_nac = "";
		String Estatus = "";
		String Marca = "";
		String Modelo = "";
		String Color = "";
		String Combustible = "";
		int A�o = 0;
		int Puertas = 0;
		int Asientos = 0;
		int Poliza_Seguro = 0;
		int num_turbinas = 0;
		int num_�lices = 0;
		int Num_Ejes = 0;
		int NumSerieAc=0;
		int NumSerieAe=0;
		int NumSerieTe=0;
		int NumSerie=0;
		int NumEmpleado=0;
		
		

		// Generaremos un ciclo que nos permita manipular
		// los objetos y la informacion que daremos de alta
		int opc = 0; // variable que permitira capturar informaci�n

		do {
			System.out.println("Dame una opci�n a realizar");
			System.out.println("1.-para capturar clientes");
			System.out.println("2.-para capturar empleado");
			System.out.println("3.-para capturar vehiculo terrestre");
			System.out.println("4.-para capturar vehiculo a�reos");
			System.out.println("5.-para capturar vehiculo acu�ticos");
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
				System.out.println("G�nero del cliente");
				Sexo = tecladoCl.next();
				ObjetoCliente.setSexo(Sexo);
				System.out.println("Tel�fono del cliente");
				Telefono = tecladoCl.next();
				ObjetoCliente.setTelefono(Telefono);
				System.out.println("Licencia del cliente(solo n�meros)");
				Licencia = tecladoCl.nextInt();
				ObjetoCliente.setLicencia(Licencia);
				System.out.println("Se capturaron los datos del cliente");
				Lista_Cliente.add(ObjetoCliente);
				break;

			case 2:
				Empleado ObjetoEmpleado = new Empleado();

				System.out.println("Se captura el n�mero del empleado");
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
				System.out.println("G�nero del empleado");
				Sexo = tecladoEm.next();
				ObjetoEmpleado.setSexo(Sexo);
				System.out.println("Tel�fono del empleado");
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

				System.out.println("A�o del veh�culo terrestre");
				A�o = tecladoTe.nextInt();
				ObjetoTerrestres.setA�o(A�o);
				System.out.println("N�mero de asientos del veh�culo terrestre");
				Asientos = tecladoTe.nextInt();
				ObjetoTerrestres.setAsientos(Asientos);
				System.out.println("Color del veh�culo terrestre");
				Color = tecladoTe.next();
				ObjetoTerrestres.setColor(Color);
				System.out.println("Tipo de combustible del veh�culo terrestre");
				Combustible = tecladoTe.next();
				ObjetoTerrestres.setCombustible(Combustible);
				System.out.println("Marca del veh�culo terrestre");
				Marca = tecladoTe.next();
				ObjetoTerrestres.setMarca(Marca);
				System.out.println("Modelo del veh�culo terrestre");
				Modelo = tecladoTe.next();
				ObjetoTerrestres.setModelo(Modelo);
				System.out.println("N�mero de serie del veh�culo terrestre (solo n�meros)");
				NumSerieTe = tecladoTe.nextInt();
				ObjetoTerrestres.setNumSerieTe(NumSerieTe);
				System.out.println("Poliza del seguro del veh�culo terrestre");
				Poliza_Seguro = tecladoTe.nextInt();
				ObjetoTerrestres.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("N�mero de puertas del veh�culo terrestre");
				Puertas = tecladoTe.nextInt();
				ObjetoTerrestres.setPuertas(Puertas);
				System.out.println("Se captura el n�mero de ejes del veh�culo");
				Num_Ejes = tecladoTe.nextInt();
				ObjetoTerrestres.setNum_Ejes(Num_Ejes);

				Lista_Terrestres.add(ObjetoTerrestres);
				break;

			case 4:
				Aereos ObjetoAereos = new Aereos();

				System.out.println("A�o del veh�culo a�reo");
				A�o = tecladoAe.nextInt();
				ObjetoAereos.setA�o(A�o);
				System.out.println("N�mero de asientos del veh�culo a�reo");
				Asientos = tecladoAe.nextInt();
				ObjetoAereos.setAsientos(Asientos);
				System.out.println("Color del veh�culo a�reo");
				Color = tecladoAe.next();
				ObjetoAereos.setColor(Color);
				System.out.println("Tipo de combustible del veh�culo a�reo");
				Combustible = tecladoAe.next();
				ObjetoAereos.setCombustible(Combustible);
				System.out.println("Marca del veh�culo a�reo");
				Marca = tecladoAe.next();
				ObjetoAereos.setMarca(Marca);
				System.out.println("Modelo del veh�culo a�reo");
				Modelo = tecladoAe.next();
				ObjetoAereos.setModelo(Modelo);
				System.out.println("N�mero de serie del veh�culo a�reo (solo n�meros)");
				NumSerieAe = tecladoAe.nextInt();
				ObjetoAereos.setNumSerieAe(NumSerieAe);
				System.out.println("Poliza del seguro del veh�culo a�reo");
				Poliza_Seguro = tecladoAe.nextInt();
				ObjetoAereos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el n�mero de puertas del veh�culo a�reo");
				Puertas = tecladoAe.nextInt();
				ObjetoAereos.setPuertas(Puertas);
				System.out.println("N�mero de �lices del veh�culo");
				num_�lices = tecladoAe.nextInt();
				ObjetoAereos.setNum_�lices(num_�lices);

				Lista_Aereos.add(ObjetoAereos);
				break;

			case 5:
				Acuaticos ObjetoAcuaticos = new Acuaticos();

				System.out.println("A�o del veh�culo acu�tico");
				A�o = tecladoAc.nextInt();
				ObjetoAcuaticos.setA�o(A�o);
				System.out.println("N�mero de asientos del veh�culo acu�tico");
				Asientos = tecladoAc.nextInt();
				ObjetoAcuaticos.setAsientos(Asientos);
				System.out.println("Color del veh�culo acu�tico");
				Color = tecladoAc.next();
				ObjetoAcuaticos.setColor(Color);
				System.out.println("Tipo de combustible del veh�culo acu�tico");
				Combustible = tecladoAc.next();
				ObjetoAcuaticos.setCombustible(Combustible);
				System.out.println("Marca del veh�culo acu�tico");
				Marca = tecladoAc.next();
				ObjetoAcuaticos.setMarca(Marca);
				System.out.println("Modelo del veh�culo acu�tico");
				Modelo = tecladoAc.next();
				ObjetoAcuaticos.setModelo(Modelo);
				System.out.println("N�mero de serie del veh�culo acu�tico (solo n�meros)");
				NumSerieAc = tecladoAc.nextInt();
				ObjetoAcuaticos.setNumSerieAc(NumSerieAc);
				System.out.println("Poliza del seguro del veh�culo acu�tico");
				Poliza_Seguro = tecladoAc.nextInt();
				ObjetoAcuaticos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("N�mero de puertas del veh�culo acu�tico");
				Puertas = tecladoAc.nextInt();
				ObjetoAcuaticos.setPuertas(Puertas);
				System.out.println("N�mero de turbinas del veh�culo");
				num_turbinas = tecladoAc.nextInt();
				ObjetoAcuaticos.setNum_turbinas(num_turbinas);

				Lista_Acuaticos.add(ObjetoAcuaticos);
				break;

			case 6:
				

				System.out.println("Estatus de la renta");
				Estatus = tecladoRe.next();
				System.out.println("N�mero del empleado");
				NumEmpleado = tecladoRe.nextInt();
				Respuesta = ValidaEmpleado(NumEmpleado, Lista_Empleado);
				if (Respuesta == true) {
			
					
					System.out.println("El empleado existe");

				} else {
					System.out.println("El empleado no existe, reg�stralo");

				break;}
				System.out.println("Licencia del cliente");
				LicenciaCl = tecladoRe.nextInt();
				Respuesta=ValidaCliente(LicenciaCl, Lista_Cliente);
				if (Respuesta == true) {
					
			
					System.out.println("El cliente existe");

				} else {
					System.out.println("El cliente no existe, reg�stralo");

				break;}
				
				System.out.println("Se captura la fecha de la renta con este formato 'dd/mm/yyyy'");
				Fecha = tecladoRe.next();
				
				System.out.println("Se captura el n�mero de serie del veh�culo");
				NumSerie = tecladoRe.nextInt();
				

				int opcion = 0;
				System.out.println("Para validar existencia inserta;");
				System.out.println("1: Si es un veh�culo terrestre");
				System.out.println("2: Si es veh�culo a�reo");
				System.out.println("3: Si es vehiculo acu�tico");
				
				opcion = tecladoRe.nextInt();
				if(opcion==1) {
					
						Respuesta = Validaterrestres(NumSerie, Lista_Terrestres);
						if (Respuesta == true) {
							System.out.println("Se ha registrado la renta correctamente");

						} else {
							System.out.println("El vehiculo no est� en existencia");

						}
						}else if(opcion==2) {
					
						Respuesta = Validaaereos(NumSerie, Lista_Aereos);
						if (Respuesta == true) {
							System.out.println("Se ha registrado la renta correctamente");

						} else {
							System.out.println("El vehiculo no est� en existencia");

						}
						}else if(opcion==3) {
					
						Respuesta = Validaacuaticos(NumSerie, Lista_Acuaticos);
						if (Respuesta == true) {
							
							System.out.println("Se ha registrado la renta correctamente");

						} else {
							System.out.println("El vehiculo no est� en existencia");

						}

					}
				registrorenta Objetoregistrorenta = new registrorenta();
				Objetoregistrorenta.setEstatus(Estatus);
				Objetoregistrorenta.setLicenciaCl(LicenciaCl);
				Objetoregistrorenta.setNumEmpleado(NumEmpleado);
				Objetoregistrorenta.setFecha(Fecha);
				Objetoregistrorenta.setNumSerie(NumSerie);
				Lista_registrorenta.add(Objetoregistrorenta);
				
				

				System.out.println("El proceso ha terminado");
				
			}
		} while (opc != 0);

	}
	
	public static boolean ValidaEmpleado(int NumEmpleado, ArrayList<Empleado> Lista_Empleado) {
		Respuesta=false;
		for (int x = 0; x < Lista_Empleado.size(); x++) {
			if (Lista_Empleado.get(x).getNum_empleado() == NumEmpleado) {
				Respuesta = true;
				
			}
		}
		return Respuesta;

	}
	public static boolean ValidaCliente(int LicenciaCl, ArrayList<Cliente> Lista_Cliente) {
		Respuesta=false;
		for (int x = 0; x < Lista_Cliente.size(); x++) {
			if (Lista_Cliente.get(x).getLicencia() == LicenciaCl) {
				Respuesta = true;
				;
				
			}
		}
		return Respuesta;

	}

	public static boolean Validaterrestres(int NumSerie, ArrayList<Terrestres> Lista_Terrestres) {
		Respuesta=false;
		for (int x = 0; x < Lista_Terrestres.size(); x++) {
			if (Lista_Terrestres.get(x).getNumSerieTe() == NumSerie) {
				Respuesta = true;
				
			}
		}
		return Respuesta;
	}

	public static boolean Validaaereos(int NumSerie, ArrayList<Aereos> Lista_Aereos) {
		Respuesta=false;

		for (int x = 0; x < Lista_Aereos.size(); x++) {
			if (Lista_Aereos.get(x).getNumSerieAe() == NumSerie) {
				Respuesta = true;
				
			}
		}
		return Respuesta;
	}

	public static boolean Validaacuaticos(int NumSerie, ArrayList<Acuaticos> Lista_Acuaticos) {
		Respuesta=false;
		
		for (int x = 0; x < Lista_Acuaticos.size(); x++) {
			if (Lista_Acuaticos.get(x).getNumSerieAc() == NumSerie) {
				Respuesta = true;
				
			}
		}
		return Respuesta;

	}

}

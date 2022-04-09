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
		int A�o = 0;
		int Puertas = 0;
		int Asientos = 0;
		String Num_Serie = "";
		int Poliza_Seguro = 0;
		int num_turbinas = 0;
		int num_�lices = 0;
		int Num_Ejes = 0;
		String NumSerie="";
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
				System.out.println("Licencia del cliente");
				Licencia = tecladoCl.next();
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
				System.out.println("N�mero de serie del veh�culo terrestre");
				Num_Serie = tecladoTe.next();
				ObjetoTerrestres.setNum_Serie(Num_Serie);
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
				System.out.println("N�mero de serie del veh�culo a�reo");
				Num_Serie = tecladoAe.next();
				ObjetoAereos.setNum_Serie(Num_Serie);
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
				System.out.println("N�mero de serie del veh�culo acu�tico");
				Num_Serie = tecladoAc.next();
				ObjetoAcuaticos.setNum_Serie(Num_Serie);
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
				registrorenta Objetoregistrorenta = new registrorenta();

				System.out.println("Estatus de la renta");
				Estatus = tecladoRe.next();
				Objetoregistrorenta.setEstatus(Estatus);
				System.out.println("Nombre(exacto) del cliente");
				NombreCl = tecladoRe.next();
				Objetoregistrorenta.setNombreCl(NombreCl);
				System.out.println("N�mero del empleado");
				NumEmpleado = tecladoRe.nextInt();
				Objetoregistrorenta.setNumEmpleado(NumEmpleado);
				System.out.println("Se captura la fecha de la renta con este formato 'dd/mm/yyyy'");
				Fecha = tecladoRe.next();
				Objetoregistrorenta.setFecha(Fecha);
				System.out.println("Se captura el n�mero de serie del veh�culo");
				NumSerie = tecladoRe.next();
				
				Objetoregistrorenta.setNumSerie(NumSerie);

				int opcion = 4;
				System.out.println(
						"Para validar existencia inserta 1: Si es veh�culo terrestre, 2: Si es veh�culo aereo y 3: Si es vehiculo acu�tico");
				opcion = tecladoRe.nextInt();
				if(opcion==0){
					
						System.out.println(
								"Ese n�mero no est� dispoblible, seleccione uno de los que se muestran a continuaci�n:");
						System.out.println(
								"Para validar existencia inserta 1: Si es veh�culo terrestre, 2: Si es veh�culo aereo y 3: Si es vehiculo acu�tico");
						opcion = tecladoRe.nextInt();
				}else if(opcion==1) {
					
						Respuesta = Validaterrestres(Objetoregistrorenta.NumSerie, Lista_Terrestres);
						if (Respuesta == true) {
							Lista_registrorenta.add(Objetoregistrorenta);
							System.out.println("Se ha registrado la renta correctamente");

						} else {
							System.out.println("El vehiculo no est� en existencia");

						}
						}else if(opcion==2) {
					
						Respuesta = Validaaereos(NumSerie, Lista_Aereos);
						if (Respuesta == true) {
							Lista_registrorenta.add(Objetoregistrorenta);
							System.out.println("Se ha registrado la renta correctamente");

						} else {
							System.out.println("El vehiculo no est� en existencia");

						}
						}else if(opcion==3) {
					
						Respuesta = Validaacuaticos(Num_Serie, Lista_Acuaticos);
						if (Respuesta == true) {
							Lista_registrorenta.add(Objetoregistrorenta);
							System.out.println("Se ha registrado la renta correctamente");

						} else {
							System.out.println("El vehiculo no est� en existencia");

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

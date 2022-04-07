package codigofuente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Main_renta {
	public static ArrayList<Acuaticos> Lista_Acuaticos= new ArrayList<Acuaticos>();
	public static ArrayList<Aereos> Lista_Aereos= new ArrayList<Aereos>();
	public static ArrayList<Terrestres> Lista_Terrestres= new ArrayList<Terrestres>();
	public static ArrayList<registrorenta> Lista_registrorenta= new ArrayList<registrorenta>();
	public static ArrayList<Empleado> Lista_Empleado= new ArrayList<Empleado>();
	public static ArrayList<Cliente> Lista_Cliente= new ArrayList<Cliente>();
	

	
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		Scanner tecladoAc= new Scanner(System.in);
		Scanner tecladoAe= new Scanner(System.in);
		Scanner tecladoTe= new Scanner(System.in);
		Scanner tecladoRe= new Scanner(System.in);
		Scanner tecladoEm= new Scanner(System.in);
		Scanner tecladoCl= new Scanner(System.in);
		
		String Nombres="";
		String Apellido_M="";
		String Apellido_P="";
		String Correo="";
		String Domicilio="";
		String Fecha="";
		Date Fecha_nac=new Date();
		SimpleDateFormat FormatoFecha=new SimpleDateFormat("dd/mm/yyyy");
		String Sexo="";
		String Cargo="";
		int Num_empleado=0;
		String Telefono="";
		String RFC="";
		String Licencia="";
		int renta_vehiculo=0;
		String Registrorenta="";
		String Estatus="";
		String tipo_vehiculo="";
		String Marca="";
		String Modelo="";
		String Color="";
		String Combustible="";
		int A�o=0;
		int Puertas=0;
		int Asientos=0;
		int Num_Serie=0;
		int Num_Motor=0;
		int Poliza_Seguro=0;
		int num_turbinas=0;
		int num_�lices=0;
		int Num_Ejes=0;
		
		// Generaremos un ciclo que nos permita manipular
		//los objetos y la informacion que daremos de alta
		int opc=0; //variable que permitira capturar informaci�n
		
		do {
			System.out.println("Dame una opci�n a realizar");
			System.out.println("1.-para capturar clientes");
			System.out.println("2.-para capturar vendedores");
			System.out.println("3.-para capturar venta");
			System.out.println("0.-para salir");
			opc=teclado.nextInt();
			switch (opc) {
			case 1: Cliente ObjetoCliente=new Cliente();
			System.out.println("Se captura Cliente");
				System.out.println("Se captura el nombre del cliente");
				Nombres=tecladoCl.nextLine();
				ObjetoCliente.setNombres(Nombres);
				System.out.println("Se captura el apellido materno del cliente");
				Apellido_M=tecladoCl.nextLine();
				ObjetoCliente.setApellido_M(Apellido_M);
				System.out.println("Se captura el apellido paterno del cliente");
				Apellido_P=tecladoCl.nextLine();
				ObjetoCliente.setApellido_P(Apellido_P);
				System.out.println("Se captura el correo del cliente");
				Correo=tecladoCl.nextLine();
				ObjetoCliente.setCorreo(Correo);
				System.out.println("Se captura el domicilio del cliente");
				Domicilio=tecladoCl.nextLine();
				ObjetoCliente.setDomicilio(Domicilio);
				System.out.println("Se captura la fecha del nacimiento del cliente");
				try {
					Fecha=tecladoCl.next();
					Fecha_nac=FormatoFecha.parse(Fecha);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ObjetoCliente.setFecha_nac(Fecha_nac);
				System.out.println("Se captura el sexo del cliente");
				Sexo=tecladoCl.nextLine();
				ObjetoCliente.setSexo(Sexo);
				System.out.println("Se captura el tel�fono del cliente");
				Telefono=tecladoCl.nextLine();
				ObjetoCliente.setTelefono(Telefono);
				System.out.println("Se captura la licencia del cliente");
				Licencia=tecladoCl.nextLine();
				ObjetoCliente.setLicencia(Licencia);
				System.out.println("Se capturaron los datos del cliente");
				Lista_Cliente.add(ObjetoCliente);
				
				
			
			
			case 2: Empleado ObjetoEmpleado=new Empleado();//se genera una instancia de tipo empleado
				System.out.println("Se captura Empleado");

				System.out.println("Se captura el n�mero del empleado");
				Num_empleado=tecladoEm.nextInt();
				ObjetoEmpleado.setTelefono(Cargo);
				System.out.println("Se captura el nombre del empleado");
				Nombres=tecladoEm.nextLine();
				ObjetoEmpleado.setNombres(Nombres);
				System.out.println("Se captura el apellido paterno del empleado");
				Apellido_P=tecladoEm.nextLine();
				ObjetoEmpleado.setApellido_P(Apellido_P);
				System.out.println("Se captura el apellido materno del empleado");
				Apellido_M=tecladoEm.nextLine();
				ObjetoEmpleado.setApellido_M(Apellido_M);
				System.out.println("Se captura el correo del empleado");
				Correo=tecladoEm.nextLine();
				ObjetoEmpleado.setCorreo(Correo);
				System.out.println("Se captura el domicilio del empleado");
				Domicilio=tecladoEm.nextLine();
				ObjetoEmpleado.setDomicilio(Domicilio);
				System.out.println("Se captura la fecha del nacimiento del empleado");
				try {
					Fecha=tecladoEm.next();
					Fecha_nac=FormatoFecha.parse(Fecha);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ObjetoEmpleado.setFecha_nac(Fecha_nac);
				System.out.println("Se captura el sexo del empleado");
				Sexo=tecladoEm.nextLine();
				ObjetoEmpleado.setSexo(Sexo);
				System.out.println("Se captura el tel�fono del empleado");
				Telefono=tecladoEm.nextLine();
				ObjetoEmpleado.setTelefono(Telefono);
				System.out.println("Se captura el cargo del empleado");
				Cargo=tecladoEm.nextLine();
				ObjetoEmpleado.setCargo(Cargo);
				System.out.println("Se captura el RFC del empleado");
				RFC=tecladoEm.nextLine();
				ObjetoEmpleado.setRFC(RFC);
				
				Lista_Empleado.add(ObjetoEmpleado);
				
				
				
				ObjetoEmpleado= Lista_Empleado.get(0);
				System.out.println(ObjetoEmpleado.getNombres());
			
				
			case 3: Terrestres ObjetoTerrestres=new Terrestres();
				System.out.println("Se captura veh�culo terrestre");
				System.out.println("Se captura el a�o del veh�culo terrestre");
				A�o=tecladoTe.nextInt();
				ObjetoTerrestres.setA�o(A�o);
				System.out.println("Se captura el n�mero de asientos del veh�culo terrestre");
				Asientos=tecladoTe.nextInt();
				ObjetoTerrestres.setAsientos(Asientos);
				System.out.println("Se captura el color del veh�culo terrestre");
				Color=tecladoTe.nextLine();
				ObjetoTerrestres.setColor(Color);
				System.out.println("Se captura el tipo de combustible del veh�culo terrestre");
				Combustible=tecladoTe.nextLine();
				ObjetoTerrestres.setCombustible(Combustible);
				System.out.println("Se captura la marca del veh�culo terrestre");
				Marca=tecladoTe.nextLine();
				ObjetoTerrestres.setMarca(Marca);
				System.out.println("Se captura el modelo del veh�culo terrestre");
				Modelo=tecladoTe.nextLine();
				ObjetoTerrestres.setModelo(Modelo);
				System.out.println("Se captura el n�mero de motor del veh�culo terrestre");
				Num_Motor=tecladoTe.nextInt();
				ObjetoTerrestres.setNum_Motor(Num_Motor);
				System.out.println("Se captura el n�mero de serie del veh�culo terrestre");
				Num_Serie=tecladoTe.nextInt();
				ObjetoTerrestres.setNum_Serie(Num_Serie);
				System.out.println("Se captura la poliza del seguro del veh�culo terrestre");
				Poliza_Seguro=tecladoTe.nextInt();
				ObjetoTerrestres.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el n�mero de puertas del veh�culo terrestre");
				Puertas=tecladoTe.nextInt();
				ObjetoTerrestres.setPuertas(Puertas);
				System.out.println("Se captura el tipo del veh�culo");
				tipo_vehiculo=tecladoTe.nextLine();
				ObjetoTerrestres.setTipo_vehiculo(tipo_vehiculo);
				System.out.println("Se captura el n�mero de ejes del veh�culo");
				Num_Ejes=tecladoTe.nextInt();
				ObjetoTerrestres.setNum_Ejes(Num_Ejes);
				
				Lista_Terrestres.add(ObjetoTerrestres);
				
			
			case 4:Aereos ObjetoAereos=new Aereos();
				System.out.println("Se captura veh�culo a�reo");
				System.out.println("Se captura el a�o del veh�culo a�reo");
				A�o=tecladoAe.nextInt();
				ObjetoAereos.setA�o(A�o);
				System.out.println("Se captura el n�mero de asientos del veh�culo a�reo");
				Asientos=tecladoAe.nextInt();
				ObjetoAereos.setAsientos(Asientos);
				System.out.println("Se captura el color del veh�culo a�reo");
				Color=tecladoAe.nextLine();
				ObjetoAereos.setColor(Color);
				System.out.println("Se captura el tipo de combustible del veh�culo a�reo");
				Combustible=tecladoAe.nextLine();
				ObjetoAereos.setCombustible(Combustible);
				System.out.println("Se captura la marca del veh�culo a�reo");
				Marca=tecladoAe.nextLine();
				ObjetoAereos.setMarca(Marca);
				System.out.println("Se captura el modelo del veh�culo a�reo");
				Modelo=tecladoAe.nextLine();
				ObjetoAereos.setModelo(Modelo);
				System.out.println("Se captura el n�mero de motor del veh�culo a�reo");
				Num_Motor=tecladoAe.nextInt();
				ObjetoAereos.setNum_Motor(Num_Motor);
				System.out.println("Se captura el n�mero de serie del veh�culo a�reo");
				Num_Serie=tecladoAe.nextInt();
				ObjetoAereos.setNum_Serie(Num_Serie);
				System.out.println("Se captura la poliza del seguro del veh�culo a�reo");
				Poliza_Seguro=tecladoAe.nextInt();
				ObjetoAereos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el n�mero de puertas del veh�culo a�reo");
				Puertas=tecladoAe.nextInt();
				ObjetoAereos.setPuertas(Puertas);
				System.out.println("Se captura el tipo del veh�culo");
				tipo_vehiculo=tecladoAe.nextLine();
				ObjetoAereos.setTipo_vehiculo(tipo_vehiculo);
				System.out.println("Se captura el tipo del veh�culo");
				num_�lices=tecladoAe.nextInt();
				ObjetoAereos.setNum_�lices(num_�lices);
				
				Lista_Aereos.add(ObjetoAereos);
				
				
			case 5: Acuaticos ObjetoAcuaticos= new Acuaticos();
				System.out.println("Se captura veh�culo acu�tico");
				System.out.println("Se captura el a�o del veh�culo acu�tico");
				A�o=tecladoAc.nextInt();
				ObjetoAcuaticos.setA�o(A�o);
				System.out.println("Se captura el n�mero de asientos del veh�culo acu�tico");
				Asientos=tecladoAc.nextInt();
				ObjetoAcuaticos.setAsientos(Asientos);
				System.out.println("Se captura el color del veh�culo acu�tico");
				Color=tecladoAc.nextLine();
				ObjetoAcuaticos.setColor(Color);
				System.out.println("Se captura el tipo de combustible del veh�culo acu�tico");
				Combustible=tecladoAc.nextLine();
				ObjetoAcuaticos.setCombustible(Combustible);
				System.out.println("Se captura la marca del veh�culo acu�tico");
				Marca=tecladoAc.nextLine();
				ObjetoAcuaticos.setMarca(Marca);
				System.out.println("Se captura el modelo del veh�culo acu�tico");
				Modelo=tecladoAc.nextLine();
				ObjetoAcuaticos.setModelo(Modelo);
				System.out.println("Se captura el n�mero de motor del veh�culo acu�tico");
				Num_Motor=tecladoAc.nextInt();
				ObjetoAcuaticos.setNum_Motor(Num_Motor);
				System.out.println("Se captura el n�mero de serie del veh�culo acu�tico");
				Num_Serie=tecladoAc.nextInt();
				ObjetoAcuaticos.setNum_Serie(Num_Serie);
				System.out.println("Se captura la poliza del seguro del veh�culo acu�tico");
				Poliza_Seguro=tecladoAc.nextInt();
				ObjetoAcuaticos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el n�mero de puertas del veh�culo acu�tico");
				Puertas=tecladoAc.nextInt();
				ObjetoAcuaticos.setPuertas(Puertas);
				System.out.println("Se captura el tipo del veh�culo");
				tipo_vehiculo=tecladoAc.nextLine();
				ObjetoAcuaticos.setTipo_vehiculo(tipo_vehiculo);
				System.out.println("Se captura el tipo del veh�culo");
				num_turbinas=tecladoAc.nextInt();
				ObjetoAcuaticos.setNum_turbinas(num_turbinas);
				
				Lista_Acuaticos.add(ObjetoAcuaticos);
				
				
				
				
			case 6: registrorenta Objetoregistrorenta=new registrorenta();
			System.out.println("Se captura renta de un veh�culo");
			System.out.println("Se captura el estatus de la renta");
			Estatus=tecladoRe.nextLine();
			Objetoregistrorenta.setEstatus(Estatus);
			System.out.println("Se captura el registro de la renta");
			Registrorenta=tecladoRe.nextLine();
			Objetoregistrorenta.setRegistrorenta(Registrorenta);
			System.out.println("Se captura el tipo del veh�culo");
			renta_vehiculo=tecladoRe.nextInt();
			Objetoregistrorenta.setRenta_vehiculo(renta_vehiculo);
			
			Lista_registrorenta.add(Objetoregistrorenta);
			
			
			
			
			
			case 0: System.out.println("Salir");
			}
		}while (opc==0);
		

	}

}

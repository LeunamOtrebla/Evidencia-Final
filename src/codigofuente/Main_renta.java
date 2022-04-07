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
				
				
				
			
			
			case 2: Empleado ObjetoEmpleado=new Empleado();//se genera una instancia de tipo empleado
				System.out.println("Se captura Empleado");

				System.out.println("Se captura el n�mero del empleado");
				Num_empleado=tecladoCl.nextInt();
				ObjetoEmpleado.setTelefono(Cargo);
				System.out.println("Se captura el nombre del empleado");
				Nombres=tecladoCl.nextLine();
				ObjetoEmpleado.setNombres(Nombres);
				System.out.println("Se captura el apellido paterno del empleado");
				Apellido_P=tecladoCl.nextLine();
				ObjetoEmpleado.setApellido_P(Apellido_P);
				System.out.println("Se captura el apellido materno del empleado");
				Apellido_M=tecladoCl.nextLine();
				ObjetoEmpleado.setApellido_M(Apellido_M);
				System.out.println("Se captura el correo del empleado");
				Correo=tecladoCl.nextLine();
				ObjetoEmpleado.setCorreo(Correo);
				System.out.println("Se captura el domicilio del empleado");
				Domicilio=tecladoCl.nextLine();
				ObjetoEmpleado.setDomicilio(Domicilio);
				System.out.println("Se captura la fecha del nacimiento del empleado");
				try {
					Fecha=tecladoCl.next();
					Fecha_nac=FormatoFecha.parse(Fecha);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ObjetoEmpleado.setFecha_nac(Fecha_nac);
				System.out.println("Se captura el sexo del empleado");
				Sexo=tecladoCl.nextLine();
				ObjetoEmpleado.setSexo(Sexo);
				System.out.println("Se captura el tel�fono del empleado");
				Telefono=tecladoCl.nextLine();
				ObjetoEmpleado.setTelefono(Telefono);
				System.out.println("Se captura el cargo del empleado");
				Cargo=tecladoCl.nextLine();
				ObjetoEmpleado.setCargo(Cargo);
				System.out.println("Se captura el RFC del empleado");
				RFC=tecladoCl.nextLine();
				ObjetoEmpleado.setRFC(RFC);
				
				Lista_Empleado.add(ObjetoEmpleado);
				
				
				
				ObjetoEmpleado= Lista_Empleado.get(0);
				System.out.println(ObjetoEmpleado.getNombres());
			
				
			case 3: Terrestres ObjetoTerrestres=new Terrestres();
				System.out.println("Se captura veh�culo terrestre");
				System.out.println("Se captura el a�o del veh�culo terrestre");
				A�o=tecladoCl.nextInt();
				ObjetoTerrestres.setA�o(A�o);
				System.out.println("Se captura el n�mero de asientos del veh�culo terrestre");
				Asientos=tecladoCl.nextInt();
				ObjetoTerrestres.setAsientos(Asientos);
				System.out.println("Se captura el color del veh�culo terrestre");
				Color=tecladoCl.nextLine();
				ObjetoTerrestres.setColor(Color);
				System.out.println("Se captura el tipo de combustible del veh�culo terrestre");
				Combustible=tecladoCl.nextLine();
				ObjetoTerrestres.setCombustible(Combustible);
				System.out.println("Se captura la marca del veh�culo terrestre");
				Marca=tecladoCl.nextLine();
				ObjetoTerrestres.setMarca(Marca);
				System.out.println("Se captura el modelo del veh�culo terrestre");
				Modelo=tecladoCl.nextLine();
				ObjetoTerrestres.setModelo(Modelo);
				System.out.println("Se captura el n�mero de motor del veh�culo terrestre");
				Num_Motor=tecladoCl.nextInt();
				ObjetoTerrestres.setNum_Motor(Num_Motor);
				System.out.println("Se captura el n�mero de serie del veh�culo terrestre");
				Num_Serie=tecladoCl.nextInt();
				ObjetoTerrestres.setNum_Serie(Num_Serie);
				System.out.println("Se captura la poliza del seguro del veh�culo terrestre");
				Poliza_Seguro=tecladoCl.nextInt();
				ObjetoTerrestres.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el n�mero de puertas del veh�culo terrestre");
				Puertas=tecladoCl.nextInt();
				ObjetoTerrestres.setPuertas(Puertas);
				System.out.println("Se captura el tipo del veh�culo");
				tipo_vehiculo=tecladoCl.nextLine();
				ObjetoTerrestres.setTipo_vehiculo(tipo_vehiculo);
				System.out.println("Se captura el n�mero de ejes del veh�culo");
				Num_Ejes=tecladoCl.nextInt();
				ObjetoTerrestres.setNum_Ejes(Num_Ejes);
				
				
			
			case 4:Aereos ObjetoAereos=new Aereos();
				System.out.println("Se captura veh�culo a�reo");
				System.out.println("Se captura el a�o del veh�culo a�reo");
				A�o=tecladoCl.nextInt();
				ObjetoAereos.setA�o(A�o);
				System.out.println("Se captura el n�mero de asientos del veh�culo a�reo");
				Asientos=tecladoCl.nextInt();
				ObjetoAereos.setAsientos(Asientos);
				System.out.println("Se captura el color del veh�culo a�reo");
				Color=tecladoCl.nextLine();
				ObjetoAereos.setColor(Color);
				System.out.println("Se captura el tipo de combustible del veh�culo a�reo");
				Combustible=tecladoCl.nextLine();
				ObjetoAereos.setCombustible(Combustible);
				System.out.println("Se captura la marca del veh�culo a�reo");
				Marca=tecladoCl.nextLine();
				ObjetoAereos.setMarca(Marca);
				System.out.println("Se captura el modelo del veh�culo a�reo");
				Modelo=tecladoCl.nextLine();
				ObjetoAereos.setModelo(Modelo);
				System.out.println("Se captura el n�mero de motor del veh�culo a�reo");
				Num_Motor=tecladoCl.nextInt();
				ObjetoAereos.setNum_Motor(Num_Motor);
				System.out.println("Se captura el n�mero de serie del veh�culo a�reo");
				Num_Serie=tecladoCl.nextInt();
				ObjetoAereos.setNum_Serie(Num_Serie);
				System.out.println("Se captura la poliza del seguro del veh�culo a�reo");
				Poliza_Seguro=tecladoCl.nextInt();
				ObjetoAereos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el n�mero de puertas del veh�culo a�reo");
				Puertas=tecladoCl.nextInt();
				ObjetoAereos.setPuertas(Puertas);
				System.out.println("Se captura el tipo del veh�culo");
				tipo_vehiculo=tecladoCl.nextLine();
				ObjetoAereos.setTipo_vehiculo(tipo_vehiculo);
				System.out.println("Se captura el tipo del veh�culo");
				num_�lices=tecladoCl.nextInt();
				ObjetoAereos.setNum_�lices(num_�lices);
				
				
				
			case 5: Acuaticos ObjetoAcuaticos= new Acuaticos();
				System.out.println("Se captura veh�culo acu�tico");
				System.out.println("Se captura el a�o del veh�culo acu�tico");
				A�o=tecladoCl.nextInt();
				ObjetoAcuaticos.setA�o(A�o);
				System.out.println("Se captura el n�mero de asientos del veh�culo acu�tico");
				Asientos=tecladoCl.nextInt();
				ObjetoAcuaticos.setAsientos(Asientos);
				System.out.println("Se captura el color del veh�culo acu�tico");
				Color=tecladoCl.nextLine();
				ObjetoAcuaticos.setColor(Color);
				System.out.println("Se captura el tipo de combustible del veh�culo acu�tico");
				Combustible=tecladoCl.nextLine();
				ObjetoAcuaticos.setCombustible(Combustible);
				System.out.println("Se captura la marca del veh�culo acu�tico");
				Marca=tecladoCl.nextLine();
				ObjetoAcuaticos.setMarca(Marca);
				System.out.println("Se captura el modelo del veh�culo acu�tico");
				Modelo=tecladoCl.nextLine();
				ObjetoAcuaticos.setModelo(Modelo);
				System.out.println("Se captura el n�mero de motor del veh�culo acu�tico");
				Num_Motor=tecladoCl.nextInt();
				ObjetoAcuaticos.setNum_Motor(Num_Motor);
				System.out.println("Se captura el n�mero de serie del veh�culo acu�tico");
				Num_Serie=tecladoCl.nextInt();
				ObjetoAcuaticos.setNum_Serie(Num_Serie);
				System.out.println("Se captura la poliza del seguro del veh�culo acu�tico");
				Poliza_Seguro=tecladoCl.nextInt();
				ObjetoAcuaticos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el n�mero de puertas del veh�culo acu�tico");
				Puertas=tecladoCl.nextInt();
				ObjetoAcuaticos.setPuertas(Puertas);
				System.out.println("Se captura el tipo del veh�culo");
				tipo_vehiculo=tecladoCl.nextLine();
				ObjetoAcuaticos.setTipo_vehiculo(tipo_vehiculo);
				System.out.println("Se captura el tipo del veh�culo");
				num_turbinas=tecladoCl.nextInt();
				ObjetoAcuaticos.setNum_turbinas(num_turbinas);
				
				
				
				
			case 6: registrorenta Objetoregistrorenta=new registrorenta();
			System.out.println("Se captura renta de un veh�culo");
			System.out.println("Se captura el estatus de la renta");
			Estatus=tecladoCl.nextLine();
			Objetoregistrorenta.setEstatus(Estatus);
			System.out.println("Se captura el registro de la renta");
			Registrorenta=tecladoCl.nextLine();
			Objetoregistrorenta.setRegistrorenta(Registrorenta);
			System.out.println("Se captura el tipo del veh�culo");
			Registrorenta=tecladoCl.nextLine();
			Objetoregistrorenta.setRegistrorenta(Registrorenta);
			
			
			
			
			
			case 0: System.out.println("Salir");
			}
		}while (opc==0);
		

	}

}

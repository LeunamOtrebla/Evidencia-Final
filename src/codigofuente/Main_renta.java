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
		int Año=0;
		int Puertas=0;
		int Asientos=0;
		int Num_Serie=0;
		int Num_Motor=0;
		int Poliza_Seguro=0;
		int num_turbinas=0;
		int num_élices=0;
		int Num_Ejes=0;
		
		// Generaremos un ciclo que nos permita manipular
		//los objetos y la informacion que daremos de alta
		int opc=0; //variable que permitira capturar información
		
		do {
			System.out.println("Dame una opción a realizar");
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
				System.out.println("Se captura el teléfono del cliente");
				Telefono=tecladoCl.nextLine();
				ObjetoCliente.setTelefono(Telefono);
				System.out.println("Se captura la licencia del cliente");
				Licencia=tecladoCl.nextLine();
				ObjetoCliente.setLicencia(Licencia);
				System.out.println("Se capturaron los datos del cliente");
				Lista_Cliente.add(ObjetoCliente);
				
				
			
			
			case 2: Empleado ObjetoEmpleado=new Empleado();//se genera una instancia de tipo empleado
				System.out.println("Se captura Empleado");

				System.out.println("Se captura el número del empleado");
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
				System.out.println("Se captura el teléfono del empleado");
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
				System.out.println("Se captura vehículo terrestre");
				System.out.println("Se captura el año del vehículo terrestre");
				Año=tecladoTe.nextInt();
				ObjetoTerrestres.setAño(Año);
				System.out.println("Se captura el número de asientos del vehículo terrestre");
				Asientos=tecladoTe.nextInt();
				ObjetoTerrestres.setAsientos(Asientos);
				System.out.println("Se captura el color del vehículo terrestre");
				Color=tecladoTe.nextLine();
				ObjetoTerrestres.setColor(Color);
				System.out.println("Se captura el tipo de combustible del vehículo terrestre");
				Combustible=tecladoTe.nextLine();
				ObjetoTerrestres.setCombustible(Combustible);
				System.out.println("Se captura la marca del vehículo terrestre");
				Marca=tecladoTe.nextLine();
				ObjetoTerrestres.setMarca(Marca);
				System.out.println("Se captura el modelo del vehículo terrestre");
				Modelo=tecladoTe.nextLine();
				ObjetoTerrestres.setModelo(Modelo);
				System.out.println("Se captura el número de motor del vehículo terrestre");
				Num_Motor=tecladoTe.nextInt();
				ObjetoTerrestres.setNum_Motor(Num_Motor);
				System.out.println("Se captura el número de serie del vehículo terrestre");
				Num_Serie=tecladoTe.nextInt();
				ObjetoTerrestres.setNum_Serie(Num_Serie);
				System.out.println("Se captura la poliza del seguro del vehículo terrestre");
				Poliza_Seguro=tecladoTe.nextInt();
				ObjetoTerrestres.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el número de puertas del vehículo terrestre");
				Puertas=tecladoTe.nextInt();
				ObjetoTerrestres.setPuertas(Puertas);
				System.out.println("Se captura el tipo del vehículo");
				tipo_vehiculo=tecladoTe.nextLine();
				ObjetoTerrestres.setTipo_vehiculo(tipo_vehiculo);
				System.out.println("Se captura el número de ejes del vehículo");
				Num_Ejes=tecladoTe.nextInt();
				ObjetoTerrestres.setNum_Ejes(Num_Ejes);
				
				Lista_Terrestres.add(ObjetoTerrestres);
				
			
			case 4:Aereos ObjetoAereos=new Aereos();
				System.out.println("Se captura vehículo aéreo");
				System.out.println("Se captura el año del vehículo aéreo");
				Año=tecladoAe.nextInt();
				ObjetoAereos.setAño(Año);
				System.out.println("Se captura el número de asientos del vehículo aéreo");
				Asientos=tecladoAe.nextInt();
				ObjetoAereos.setAsientos(Asientos);
				System.out.println("Se captura el color del vehículo aéreo");
				Color=tecladoAe.nextLine();
				ObjetoAereos.setColor(Color);
				System.out.println("Se captura el tipo de combustible del vehículo aéreo");
				Combustible=tecladoAe.nextLine();
				ObjetoAereos.setCombustible(Combustible);
				System.out.println("Se captura la marca del vehículo aéreo");
				Marca=tecladoAe.nextLine();
				ObjetoAereos.setMarca(Marca);
				System.out.println("Se captura el modelo del vehículo aéreo");
				Modelo=tecladoAe.nextLine();
				ObjetoAereos.setModelo(Modelo);
				System.out.println("Se captura el número de motor del vehículo aéreo");
				Num_Motor=tecladoAe.nextInt();
				ObjetoAereos.setNum_Motor(Num_Motor);
				System.out.println("Se captura el número de serie del vehículo aéreo");
				Num_Serie=tecladoAe.nextInt();
				ObjetoAereos.setNum_Serie(Num_Serie);
				System.out.println("Se captura la poliza del seguro del vehículo aéreo");
				Poliza_Seguro=tecladoAe.nextInt();
				ObjetoAereos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el número de puertas del vehículo aéreo");
				Puertas=tecladoAe.nextInt();
				ObjetoAereos.setPuertas(Puertas);
				System.out.println("Se captura el tipo del vehículo");
				tipo_vehiculo=tecladoAe.nextLine();
				ObjetoAereos.setTipo_vehiculo(tipo_vehiculo);
				System.out.println("Se captura el tipo del vehículo");
				num_élices=tecladoAe.nextInt();
				ObjetoAereos.setNum_élices(num_élices);
				
				Lista_Aereos.add(ObjetoAereos);
				
				
			case 5: Acuaticos ObjetoAcuaticos= new Acuaticos();
				System.out.println("Se captura vehículo acuático");
				System.out.println("Se captura el año del vehículo acuático");
				Año=tecladoAc.nextInt();
				ObjetoAcuaticos.setAño(Año);
				System.out.println("Se captura el número de asientos del vehículo acuático");
				Asientos=tecladoAc.nextInt();
				ObjetoAcuaticos.setAsientos(Asientos);
				System.out.println("Se captura el color del vehículo acuático");
				Color=tecladoAc.nextLine();
				ObjetoAcuaticos.setColor(Color);
				System.out.println("Se captura el tipo de combustible del vehículo acuático");
				Combustible=tecladoAc.nextLine();
				ObjetoAcuaticos.setCombustible(Combustible);
				System.out.println("Se captura la marca del vehículo acuático");
				Marca=tecladoAc.nextLine();
				ObjetoAcuaticos.setMarca(Marca);
				System.out.println("Se captura el modelo del vehículo acuático");
				Modelo=tecladoAc.nextLine();
				ObjetoAcuaticos.setModelo(Modelo);
				System.out.println("Se captura el número de motor del vehículo acuático");
				Num_Motor=tecladoAc.nextInt();
				ObjetoAcuaticos.setNum_Motor(Num_Motor);
				System.out.println("Se captura el número de serie del vehículo acuático");
				Num_Serie=tecladoAc.nextInt();
				ObjetoAcuaticos.setNum_Serie(Num_Serie);
				System.out.println("Se captura la poliza del seguro del vehículo acuático");
				Poliza_Seguro=tecladoAc.nextInt();
				ObjetoAcuaticos.setPoliza_Seguro(Poliza_Seguro);
				System.out.println("Se captura el número de puertas del vehículo acuático");
				Puertas=tecladoAc.nextInt();
				ObjetoAcuaticos.setPuertas(Puertas);
				System.out.println("Se captura el tipo del vehículo");
				tipo_vehiculo=tecladoAc.nextLine();
				ObjetoAcuaticos.setTipo_vehiculo(tipo_vehiculo);
				System.out.println("Se captura el tipo del vehículo");
				num_turbinas=tecladoAc.nextInt();
				ObjetoAcuaticos.setNum_turbinas(num_turbinas);
				
				Lista_Acuaticos.add(ObjetoAcuaticos);
				
				
				
				
			case 6: registrorenta Objetoregistrorenta=new registrorenta();
			System.out.println("Se captura renta de un vehículo");
			System.out.println("Se captura el estatus de la renta");
			Estatus=tecladoRe.nextLine();
			Objetoregistrorenta.setEstatus(Estatus);
			System.out.println("Se captura el registro de la renta");
			Registrorenta=tecladoRe.nextLine();
			Objetoregistrorenta.setRegistrorenta(Registrorenta);
			System.out.println("Se captura el tipo del vehículo");
			renta_vehiculo=tecladoRe.nextInt();
			Objetoregistrorenta.setRenta_vehiculo(renta_vehiculo);
			
			Lista_registrorenta.add(Objetoregistrorenta);
			
			
			
			
			
			case 0: System.out.println("Salir");
			}
		}while (opc==0);
		

	}

}

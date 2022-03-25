package codigofuente;

public class Empleado extends Personas {

	public static String RFC;
	public static String Cargo;
	public static int Num_empleado;
	
	
		public static String getRFC() {
		return RFC;
	}
		public static void setRFC(String rFC) {
		RFC = rFC;
	}
		public static String getCargo() {
		return Cargo;
	}
		public static void setCargo(String cargo) {
		Cargo = cargo;
	}
		public static int getNum_empleado() {
		return Num_empleado;
	}
		public static void setNum_empleado(int num_empleado) {
		Num_empleado = num_empleado;
	}
	
}

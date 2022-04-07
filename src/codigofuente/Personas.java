package codigofuente;

import java.util.Date;

public class Personas {

	public static String Nombres;
	public static String Apellido_P;
	public static String Apellido_M;
	public static Date Fecha_nac;
	public static String Telefono;
	public static String Domicilio;
	public static String Correo;
	public static String Sexo;
	
	
		public String getNombres() {
		return Nombres;
	}
		public void setNombres(String nombres) {
		Nombres = nombres;
	}
		public static String getApellido_P() {
		return Apellido_P;
	}
		public static void setApellido_P(String apellido_P) {
		Apellido_P = apellido_P;
	}
		public static String getApellido_M() {
		return Apellido_M;
	}
		public void setApellido_M(String apellido_M) {
		Apellido_M = apellido_M;
	}
		public  Date getFecha_nac() {
		return Fecha_nac;
	}
		public void setFecha_nac(Date fecha_nac) {
		Fecha_nac = fecha_nac;
	}
		public static String getTelefono() {
		return Telefono;
	}
		public  void setTelefono(String telefono) {
		Telefono = telefono;
	}
		public  String getDomicilio() {
		return Domicilio;
	}
		public  void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
		public  String getCorreo() {
		return Correo;
	}
		public  void setCorreo(String correo) {
		Correo = correo;
	}
		public  String getSexo() {
		return Sexo;
	}
		public  void setSexo(String sexo) {
		Sexo = sexo;
	}
	
	
	
}


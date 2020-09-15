package GIT;

public class Alumno {
	private String nombre;
	private String apellido;
	private int lu;
	
	public Alumno(String nombre, String apellido, int lu) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.lu=lu;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public int getLU() {
		return lu;
	}
}



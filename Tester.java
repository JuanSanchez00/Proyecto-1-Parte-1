package GIT;

public class Tester {
	public static void main(String[] args) {
		Alumno a=new Alumno("Juan","Sanchez",125755);
		System.out.println("Alumno: "+a.getNombre()+" "+a.getApellido()+". LU: "+a.getLU());
	}
}
public class Alumno extends Persona{
	private String codigoAlumno;
	
	public Alumno(){
		super()
	}
	
	private void setCodigoAlumno(String codigoAlumno){
		this.codigoAlumno = codigoAlumno;
	}
	
	private String getCodigoAlumno(){
		return this.codigoAlumno;
	}
}
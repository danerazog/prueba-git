public class Persona {
    protected long codigoP;
	protected String nombreP;
	
	public Persona(){
		
	}
	
	public void setCodigo(long codigo){
		this.codigoP = codigo;
	}
	
	public void setNombre(String nombre){
		this.nombreP = nombre;
	}
	
	public long getCodigo(){
		return this.codigoP;
	}
	
	public String getNombre(){
		return this.nombreP;
	}
}
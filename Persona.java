public class Persona {
    protected long codigoPersona;
	protected String nombrePersona;
	
	public Persona(){
		
	}
	
	public void setCodigo(long codigo){
		this.codigoPersona = codigo;
	}
	
	public void setNombre(String nombre){
		this.nombrePersona = nombre;
	}
	
	public long getCodigo(){
		return this.codigoPersona;
	}
	
	public String getNombre(){
		return this.nombrePersona;
	}
}
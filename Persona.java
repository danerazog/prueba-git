public class Persona {
    protected long codigo;
	protected String nombre;
	
	public Persona(){
		
	}
	
	public void setCodigo(long codigo){
		this.codigo = codigo;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public long getCodigo(){
		return this.codigo;
	}
	
	public String getNombre(){
		return this.nombre;
	}
}
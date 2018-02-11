public class Persona {
    private long codigo;
	private String nombre;
	
	public Persona(){
		
	}
	
	private void setCodigo(long codigo){
		this.codigo = codigo;
	}
	
	private void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	private long getCodigo(){
		return this.codigo;
	}
	
	private String getNombre(){
		return this.nombre;
	}
}
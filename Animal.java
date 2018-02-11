public class Animal {
    private String raza;
	private String nombre;
	
	public Animal(){
		
	}
	
	private void setNombre(String raza){
		this.raza = raza;
	}

	private void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	private String getRaza(){
		return this.raza;
	}
	
	private String getNombre(){
		return this.nombre;
	}
}
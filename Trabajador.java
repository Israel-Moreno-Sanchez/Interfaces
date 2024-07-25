package mx.com.cuh;

public abstract class Trabajador {
	

	// Se inicializan los atributos de la clase
	
	private String nombre = "";
	private short checarEntrada= 0; 
	private short horaDeComida = 0;
	private double cobrar = 0;
	private boolean checarSalida = false;
	// Se define el constructor Persona con sus atributos principales al momento de instanciar
	
	public Trabajador(String nombre, short altura, short edad, double sueldo) {
				
				this.nombre = nombre;
				this.checarEntrada = checarEntrada;
				this.cobrar = cobrar;
				this.checarSalida = checarSalida;
			}
	 /* Se define los get y set para la clase "Persona" */
	

	public String getNombre() {
		nombre = "Sr." + nombre;
		return nombre;
	}
	public void mostrarNombre() {
		System.out.println(this.nombre);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public short getChecarEntrada() {
		return checarEntrada;
	}

	public void setChecarEntrada(short checarEntrada) {
		this.checarEntrada = checarEntrada;
	}

	public short getHoraDeComida() {
		return horaDeComida;
	}

	public void setHoraDeComida(short horaDeComida) {
		this.horaDeComida = horaDeComida;
	}

	public double getCobrar() {
		return cobrar;
	}

	public void setCobrar(double cobrar) {
		this.cobrar = cobrar;
	}

	public boolean isChecarSalida() {
		return checarSalida;
	}

	public void setChecarSalida(boolean checarSalida) {
		this.checarSalida = checarSalida;
	

			
			
	 
		if(!checarSalida)
			System.out.println("Ingreso registrado");
		else
			System.out.println("Salida registrada");

	  
	}
		
		
		
}

package mx.com.cuh;

public class Comerciante {
	 public Comerciante(String nombre, short checarEntrada , short horaDeComida, double cobrar, boolean checarSalida) {
	      
	        nombre="Gerardo Acosta";
	    }
	    boolean trabajando = false;


	    
	    public void cobrar(){
	        System.out.println("Cobrar sueldo de Comerciante");
	    }
	        
	        public String trabajar(){
	        trabajando = !trabajando;
	        String trabajo = "Jardineria";
         return trabajo;
	    }
	    public void horaDeComida(){
	        System.out.println("Hora de comer para Comerciante");

	    }
	    public void checarEntrada(){
	        if(!trabajando)
	            System.out.println("Ingreso registrado");
	        else
	            System.out.println("Salida registrada");
	}

		public void checarSalida() {
			// TODO Auto-generated method stub
			
		}


}

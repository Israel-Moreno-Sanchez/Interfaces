public Soldado(String nombre, short checarEntrada , short horaDeComida, double cobrar, boolean checarSalida) {
	      
	        nombre="Erick Perez";
	    }
	    boolean trabajando = false;


	    
	    public void cobrar(){
	        System.out.println("Cobrar sueldo de Soldado");
	    }
	        
	        public String trabajar(){
	        trabajando = !trabajando;
	        String trabajo = "Jardineria";
         return trabajo;
	    }
	    public void horaDeComida(){
	        System.out.println("Hora de comer para Soldado");

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

package mx.com.cuh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 String nombre = "";
	        //Se instancia un objeto de la clase persona con nomre persona1 y sus atributos iniciales
	       Panadero panadero = new Panadero("Julio", (short)182,(short) 23, 0, false);
	       Soldado soldado = new Soldado("Luis Fernandez", (short) 170, (short) 20, 190, false);
	       Constructor constructor = new Constructor("Pedro Hernandez",(short)11,(short) 15, 66, false);
	       Jardinero jardinero = new Jardinero("Marco Perez", (short) 184, (short) 25, 250, false);
	       Comerciante comerciante = new Comerciante("Marco Perez", (short) 184, (short) 25, 250, false);

	        //Llamar el metodo checar para cada trabajador
	        panadero.checarEntrada();
	        soldado.checarEntrada();
	        constructor.checarEntrada();
	        jardinero.checarEntrada();
	        comerciante.checarEntrada();

	        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
	        panadero.trabajar();
	        soldado.trabajar();
	        constructor.trabajar();
	        jardinero.trabajar();
            comerciante.trabajar();
            
	        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
            panadero.horaDeComida();
	        soldado.horaDeComida();
	        constructor.horaDeComida();
	        jardinero.horaDeComida();
            comerciante.horaDeComida();

	        //Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
            panadero.cobrar();
	        soldado.cobrar();
	        constructor.cobrar();
	        jardinero.cobrar();
            comerciante.cobrar();
            

	        //Llamar el metodo checar para cada trabajador
            panadero.checarSalida();
	        soldado.checarSalida();
	        constructor.checarSalida();
	        jardinero.checarSalida();
            comerciante.checarSalida();
            
	}

}

package as;

public class Lenguaje {
	
	private static final String[] REG_SLD = {"Hola", "Buen dia", "Buenas tardes", //Saludos
			 								 "Buenas noches", "Buenas", "Holanda"};
	private static final String[] REG_DSP = {"Chau", "Hasta luego", "Nos vemos", //Despedidas
			 								 "Hasta la proxima", "Adios"};
	private static final String[] REG_NE  = {"No comprendo", "No entendi", "Puedes repetirlo?"}; //Respuestas ante un mensaje no comprendido
	private static final String[] REG_AGR = {"Gracias", "Te lo agradezco", "Muchas gracias", //Agradecimientos
											 "Te agradezco"};
	private static final String[] REG_DN  = {"De nada", "Por nada", "Fue un placer"}; //Respuestas a agradecimientos
	private static final String[] REG_PE =  {"Como estas", "Como te va", "Como andas", //Preguntas sobre su estado
											 "Como te encuentras"};
	private static final String[] REG_RSE = {"Bien", "Muy bien", "Mal", "Pesimo", "Masomenos", "Perfecto",  //Respuestas a las preguntas de estado
											 "Excelente", "No podria estar mejor"};
	private static final String[] REG_RSB = {"Si", "No", "Por supuesto", "Claro que no"}; //Respuestas booleanas
	
	
	public static int conocido(String msj) {
		for(int i = 0; i < REG_SLD.length; i++) {
			if(REG_SLD[i].toUpperCase().equals(msj.toUpperCase())) {
				return 1; //Saludar
			}
		}
		for(int i = 0; i < REG_DSP.length; i++) {
			if(REG_DSP[i].toUpperCase().equals(msj.toUpperCase())) {
				return 0; //Despedir
			}
		}
		for(int i = 0; i < REG_AGR.length; i++) {
			if(REG_AGR[i].toUpperCase().equals(msj.toUpperCase())) {
				return 3; //De nada
			}
		}
		for(int i = 0; i < REG_DN.length; i++) {
			if(REG_DN[i].toUpperCase().equals(msj.toUpperCase())) {
				return -2; //Si le digo de nada, no dice nada
			}
		}
		for(int i = 0; i < REG_PE.length; i++) {
			if(REG_PE[i].toUpperCase().equals(msj.toUpperCase())) {
				return 4; //Si le digo de nada, no dice nada
			}
		}
		return -1; //No entender
	}
	
	public static String saludos() {
		return REG_SLD[(int)(Math.random()*(REG_SLD.length))];
	}
	
	public static String despedidas() {
		return REG_DSP[(int)(Math.random()*(REG_DSP.length))];
	}
	
	public static String agradecimientos() {
		return REG_AGR[(int)(Math.random()*(REG_AGR.length))];
	}
	
	public static String de_nada() {
		return REG_DN[(int)(Math.random()*(REG_DN.length))];
	}
	
	public static String no_entendidos() {
		return REG_NE[(int)(Math.random()*(REG_NE.length))];
	}
	
	public static String respuestas_estado() {
		return REG_RSE[(int)(Math.random()*(REG_RSE.length))];
	}
	

}

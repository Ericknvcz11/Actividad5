import java.util.Scanner;

public class MenuScan5 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);

	        System.out.println("Bienvenido al Menu");
	    	
	    	Scanner sc = new Scanner(System.in); 
	    	while(true) {
	    		System.out.println("Escoge dentro del menu la figura y operacion que deseas calcular");	    		
	    		System.out.println("1. Circulo"); 
	    		System.out.println("2. Cuadrado"); 
	    		System.out.println("3. Salir"); 
	    		System.out.println("Digita tu eleccion"); 
	    		int eleccion = Integer.parseInt(sc.nextLine()); 
	    		switch (eleccion) {
	    		
	    		case 1: 
	    			System.out.println("Que quieres calcular?");
	    			System.out.println("1. Area"); 
	    			System.out.println("2. Circunferencia");
	    			int operacion = Integer.parseInt(sc.nextLine()); 
	    			switch ( operacion) {
	    			case 1: 
	    				System.out.println("Ingrese el radio del círculo:");
	    		           double radio = scanner.nextDouble();
	    				Circulo A = new Circulo(); 
		    			
		    			A.cambialongitud(radio);
		    			System.out.println("El area es " + A.calcularAreac());
		    			break; 	    			
	    			case 2: 
	    				System.out.println("Ingrese el radio del círculo:");
	    		           double radio2 = scanner.nextDouble();
	    				Circulo B = new Circulo(); 
		    			
		    			B.cambialongitud(radio2);
		    			System.out.println("La circunferencia es " + B.calcularCircunferencia());
		    			break; 
	    			default:
	    				System.out.println("Opcion incorrecta"); 
	    			break;  
	    			}
	    		break; 
	    			
	    		case 2: 
		    		System.out.println("Que quieres calcular?");
		    		System.out.println("1. Area"); 
		    		System.out.println("2. Perimetro");
		    		System.out.println("3. Diagonal");
		    		int operacion2 = Integer.parseInt(sc.nextLine()); 
		    		switch ( operacion2) {
		    		case 1: 
		    			System.out.println("Ingrese el lado del cuadrado:");
		    		    	double lado = scanner.nextDouble();
		    			Cuadrado C = new Cuadrado(); 
			    			
			    		C.cambiarlongitud(lado);
			    		System.out.println("El area es " + C.calcularArea());
			    		break; 	    			
		    		case 2: 
		    				System.out.println("Ingrese el lado del cuadrado:");
		    		           double lado2 = scanner.nextDouble();
		    				Cuadrado D = new Cuadrado(); 
			    			
			    			D.cambiarlongitud(lado2);
			    			System.out.println("El perimetro es " + D.calcularPerimetro());
			    			break; 
		    		case 3: 
	    				System.out.println("Ingrese el lado del cuadrado:");
	    		           double lado3 = scanner.nextDouble();
	    				Cuadrado E = new Cuadrado(); 
		    			
		    			E.cambiarlongitud(lado3);
		    			System.out.println("La Diagonal es " + E.calcularDiagonal());
		    			break; 
		    			
		    		default:
		    			System.out.println("Opcion incorrecta"); 
		    		break;  
	    			} 
		    	break; 
		    		
	    		case 3: 
	    			System.out.println("Saliendo...");
	    			System.exit(0);
		    		break; 
		    		
	    		default:
    				System.out.println("Selecciona una opcion disponible "); 
    			break;  
    			
	    		}
	    	}
		}				
}

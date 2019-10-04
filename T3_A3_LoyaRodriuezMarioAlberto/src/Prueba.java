import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		ListaEnlazada lista = new ListaEnlazada();
		lista.agregarElementoAlInicio(30);
		lista.agregarElementoAlInicio(40);
		lista.agregarElementoAlInicio(50);
		lista.agregarElementoAlInicio(60);
		
		System.out.println(lista.mostrarCantidadElementos());
		
		Scanner entrada = new Scanner(System.in);

		int op = 0;
		int cont = 0;
		int elemento = 0;
		
		do{
			System.out.println("1)Mostrar lista \n2)Agregar elemento al inicio \n3)Agregar elemento al final \n4)Eliminar elemento al inicio \n5)Eliminar elemento al final \n6)Mostrar total de elementos \n7)Salir \n-----------------------------");
			op = entrada.nextInt();
			switch(op) {
				case 1 :
					lista.mostrarElementos();
					break;
				case 2 :
					System.out.println("Ingresa el numero que quieres agregar: ");
					elemento = entrada.nextInt();
					lista.agregarElementoAlInicio(elemento);
					break;
				case 3 :
					System.out.println("Ingresa el numero que quieres agregar: ");
					elemento = entrada.nextInt();
					lista.agregarElementoAlFinal(elemento);
					break;
				case 4 :
					lista.eliminarElementoAlInicio();
					break;
				case 5 :
					lista.eliminarElementoAlFinal();
					break;
				case 6 :
					System.out.println("El total de elementos en la lista es de: " + lista.mostrarCantidadElementos());
					break;
				case 7 :
					cont ++;
					break;
			}
		}while(cont<1);
		System.out.println("Nos vemos");
	}
}

/*
 * 1)Crear lista
 * 
 * 2)Agregar elemento
 * 
 * 3)Eliminar elemento
 * 
 * 4)Recorer lista
 * 
 * 5)Buscar elemento
 * 
 * 6)Verificar si esta vacia
 * 7) Cantidad de elementos
 * 8)Vaciar lista
 * 
 * */

public class ListaEnlazada {

	Nodo nodoInicio;
	Nodo nodoFin;
	
	public ListaEnlazada() {
		nodoInicio = nodoFin = null;
	}
	
	public void agregarElementoAlInicio(int dato) {
		Nodo nodoNuevo = new Nodo(dato);
		
		if(verificarListaVacia()) {
			nodoInicio = nodoFin = nodoNuevo;
		}else {
			nodoNuevo.setEnlace(nodoInicio);
			nodoInicio = nodoNuevo;
		}
	}
	
	public void agregarElementoAlFinal(int dato) {
		Nodo nodoNuevo = new Nodo(dato);
		
		if(verificarListaVacia()) {
			nodoInicio = nodoFin = nodoNuevo;
		}else {
			nodoFin.setEnlace(nodoNuevo);
			nodoFin = nodoNuevo;
		}
	}
	
	public void eliminarElementoAlInicio() {
		
		
		if(verificarListaVacia()) {
			System.out.println("No hay elementos para eliminar");
		}else if(nodoInicio == nodoFin) {
			nodoInicio = nodoFin = null;
		}else{
			nodoInicio = nodoInicio.getEnlace();
		}
	}
	
	public void eliminarElementoAlFinal() {
		Nodo nodoActual = nodoInicio;
		int cont = 0;
		if(verificarListaVacia()) {
			System.out.println("No hay elementos para eliminar");
		}else if(nodoInicio == nodoFin) {
			nodoInicio = nodoFin = null;
		}else{
			while(cont < mostrarCantidadElementos()-2) {
				nodoActual = nodoActual.getEnlace();
				cont++;
			}
			nodoActual.setEnlace(null);
			nodoFin = nodoActual;
		}
	}
	
	public void mostrarElementos() {
		
		Nodo nodoActual = nodoInicio;
		
		while(nodoActual!=null) {
			
			System.out.print("["+nodoActual.getDato()+"]"+"-->");
			
			nodoActual = nodoActual.getEnlace();
		}
		System.out.println();
		System.out.println("---------------");
	}
	
	public int mostrarCantidadElementos() {
		Nodo nodoActual = nodoInicio;
		int cont = 0;
		while(nodoActual!=null) {
			
			cont++;
			
			nodoActual = nodoActual.getEnlace();
		}
		return cont;
	}
	
	public boolean verificarListaVacia() {

		return (nodoInicio == null) ? true : false;
	}
}

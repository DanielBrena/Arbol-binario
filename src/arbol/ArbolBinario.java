package arbol;

import nodo.Nodo;

public class ArbolBinario <T> {
	private Nodo<T> raiz;
	
	public ArbolBinario(){
		this.raiz = null;
	}

	public Nodo<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}
	
	/**
	 * Metodo publico preorden
	 * 
	 */
	public void preorden(){
		preorden(this.raiz);
		
	}
	/**
	 * Metodo privado para recursion
	 * @param n Es un nodo
	 * 
	 */
	private void preorden(Nodo<T> n){
		
		if(n != null){
			System.out.print(n.getDato() + " ");
			preorden(n.getHijoIzq());
			preorden(n.getHijoDer());
		}
		
		
	}
	
	/**
	 * Metodo publico postorden
	 */
	public void postorden(){
		postorden(this.raiz);
	}
	
	/**
	 * Metodo privado postorden para recursion
	 * @param n Nodo
	 */
	private void postorden(Nodo<T> n){
		if(n != null){
			postorden(n.getHijoIzq());
			postorden(n.getHijoDer());
			System.out.print(n.getDato() + " ");
		}
	}
	
	/**
	 * Metodo publico inorden
	 */
	public void inorden(){
		inorden(this.raiz);;
	}
	
	/**
	 * Metodo privado inorden para recursion
	 * @param n Nodo
	 */
	private void inorden(Nodo<T> n){
		if(n != null){
			inorden(n.getHijoIzq());
			System.out.print(n.getDato() + " ");
			inorden(n.getHijoDer());
		}
	}
	
	/**
	 * Metodo publico para buscar
	 * @param dato Dato a buscar
	 */
	public void buscar(T dato){
		if(buscar(this.raiz, dato)){
			System.out.println("Se encontro");
		}else{
			System.out.println("No se encontro");
		}
	}
	
	/**
	 * Metodo privado para buscar con recursion
	 * @param n Nodo rais
	 * @param dato Dato a buscar
	 * @return Si se encuentra
	 */
	private boolean buscar(Nodo<T> n, T dato){
		
		if(n != null){
			
			if(n.getDato() == dato){
				return true;
			}
			boolean esta1 = buscar(n.getHijoIzq(),dato);
			boolean esta2 = buscar(n.getHijoDer(), dato);
			if(esta1 || esta2){
				return true;
			}
			
		}
		return false;
	}
	
	/**
	 * Metodo public para contar los nodos
	 * @return String con el total de nodos
	 */
	public String contar(){
		Integer total = contar(this.raiz);
		return "El arbol contiene " + total + " nodos.";
	}
	
	/**
	 * Metodo privado para contar los nodos con recursion
	 * @param n Nodo
	 * @return Total de nodos
	 */
	private Integer contar(Nodo<T> n){
		if(n != null){
			Integer c1 = contar(n.getHijoIzq());
			Integer c2 = contar(n.getHijoDer());
			Integer c3 = c2 + c1 +1;
			return c3;
		}
		return 0;
	}
	
	/*
	public String suma(){
		Integer total =  suma(this.raiz);
		return "La suma de los nodos da " + total ;
	}
	
	private Integer suma(Nodo<T> n){
		if(n != null){
			Integer c1 = suma(n.getHijoIzq());
			Integer c2 = suma(n.getHijoDer());
			Integer c3 = c1 + c2 +  n.getDato();
			return c3;
		}
		return 0;
	}
	*/
	/**
	 * Metodo public para la altura maxima de un arbol
	 * @return String
	 */
	public String altura(){
		return "La altura maxima del arbol es " + altura(this.raiz);
	}
	/**
	 * Metodo privado para la altura maxima de un arbol con recursion
	 * @param n Nodo
	 * @return altura
	 */
	private Integer altura(Nodo<T> n){
		if(n != null){
			Integer c1 = altura(n.getHijoIzq());
			Integer c2 = altura(n.getHijoDer());
			
			if(c1 > c2){
				return c1 +1;
			}else{
				return c2 +1;
			}
		}
		return 0;
	}
	
	public String maximo(){
		return "El mayor dato es " + maximo(this.raiz);
	}
	
	private Integer maximo(Nodo<T> n){
		if(n != null){
			Integer c1 = maximo(n.getHijoIzq());
			Integer c2 = maximo(n.getHijoDer());
			Integer c3 = (Integer) n.getDato();
			
			if(c1 >= c2 && c1 >= c3){
				return c1;
			}else if(c2 >= c1 && c2 >= c3){
				return c2;
			}else{
				return c3;
			}
		}
		return 0;
	}
}

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
	
}

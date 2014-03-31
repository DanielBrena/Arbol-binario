package main;

import nodo.Nodo;
import arbol.ArbolBinario;

public class main {
	public static void main(String[] args){
		
		ArbolBinario<Integer> ab = new ArbolBinario<>();
		
		Nodo<Integer> n1 = new Nodo<Integer>(1);
		Nodo<Integer> n2 = new Nodo<Integer>(2);
		Nodo<Integer> n3 = new Nodo<Integer>(3);
		Nodo<Integer> n4 = new Nodo<Integer>(4);
		Nodo<Integer> n5 = new Nodo<Integer>(5);
		
		n2.setHijoIzq(n4);
		n2.setHijoDer(n5);
		n1.setHijoIzq(n2);
		n1.setHijoDer(n3);
		ab.setRaiz(n1);
		
		System.out.println("PREORDEN");
		ab.preorden();
		
		System.out.println();
		System.out.println("POSTORDEN");
		
		ab.postorden();
		
		System.out.println();
		System.out.println("INORDEN");
		ab.inorden();
		
		System.out.println();
		System.out.println("Buscar");
		ab.buscar(5);
		ab.buscar(10);
		
		System.out.println();
		System.out.println("Contar");
		System.out.println(ab.contar());
		
		/*System.out.println();
		System.out.println("Suma");
		System.out.println(ab.suma());*/
		
		System.out.println();
		System.out.println("Altura");
		System.out.println(ab.altura());
		
		System.out.println();
		System.out.println("Maximo");
		System.out.println(ab.maximo());
	}
}

package Algoritmos;

import java.util.Scanner;

public class Vista {
	
	public static int[] arregloA;
	public static int[] arregloB;
	public static int tam;
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		boolean fin=false;
		while(!fin){
			printMenu();
			
			int option = sc.nextInt();
			
			switch(option){
				case 1:
					System.out.println("Ingrese el valor p");
					int p=Integer.parseInt(sc.next());
					System.out.println("Ingrese el valor q");
					int q=Integer.parseInt(sc.next());
					System.out.println("Ingrese el valor k");
					int k=Integer.parseInt(sc.next());
					System.out.println("Ingrese los datos del arreglo separados por comas");
					String cadena=(sc.next());
					String[] arreglo = cadena.split(",");
					int[] arregloInt=new int[arreglo.length];
					for(int i =0;i<arreglo.length;i++){
						arregloInt[i]=Integer.parseInt(arreglo[i]);
					}
					Problema1 problema = new Problema1();
					arregloA=problema.ro(arregloInt, p, q, k);
					for (int i = 0; i<arregloA.length;i++) {
						System.out.println(String.valueOf(arregloA[i]));
					}
					break;
							
				case 2:
					System.out.println("Ingrese el valor p");
					int p1=Integer.parseInt(sc.next());
					System.out.println("Ingrese el valor q");
					int q1=Integer.parseInt(sc.next());
					System.out.println("Ingrese los datos del arreglo separados por comas");
					String cadena1=(sc.next());
					String[] arreglo1 = cadena1.split(",");
					int[] arregloInt1=new int[arreglo1.length];
					for(int i =0;i<arreglo1.length;i++){
						arregloInt1[i]=Integer.parseInt(arreglo1[i]);
					}
					Problema1 problema1 = new Problema1();
					arregloB=problema1.re(arregloInt1, p1, q1);
					for (int i = 0; i<arregloB.length;i++) {
						System.out.println(String.valueOf(arregloB[i]));
					}
					break;
					
				case 6:	
					fin=true;
					break;
			}
			
			
		}
		sc.close();
	}

	private static void printMenu() {
		System.out.println("---------Diseño de Algoritmos - ISIS 1104----------");
		System.out.println("---------------------Taller R----------------------");
		System.out.println("1. Rotación");
		System.out.println("2. Reflexión");
		System.out.println("3. MergeSort");
		System.out.println("4. Bubble");
		System.out.println("5. HeapSort");
		System.out.println("6. Salir");
		System.out.println("Type the option number for the task, then press enter: (e.g., 1):");
		
	}
}

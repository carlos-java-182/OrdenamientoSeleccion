package ordenamiento;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Seleccion {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[], nElementos, min, aux; 
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de elementos del arreglo"));
		
		arreglo = new int[nElementos];
		
		System.out.println("Rellenando el arreglo");
		
		for(int i=0; i<nElementos; i++) {
			System.out.print(i+".- Digita el arreglo de la posición: ");
			arreglo[i] = entrada.nextInt()
;		}
		
		//Ordenamiento por selección
		
		for(int i=0; i<nElementos; i++) {
			min = i;
			for(int j=i+1; j<nElementos; j++) {
				if(arreglo[j]<arreglo[min]) {
					min=j;
				}
			}
			
			aux = arreglo[i];
			arreglo[i]= arreglo[min];
			arreglo[min]= aux;
		}
		
		System.out.println("\nOrden Creciente");
		
		for(int i=0; i<nElementos; i++) {
			System.out.println(arreglo[i]+"-");
		}
		
		System.out.println("");

	}

}

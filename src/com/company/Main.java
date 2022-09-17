package com.company;



public class Main {

    public static void main(String[] args){
	// write your code here

        System.out.println("Ordenamiento QuickSort Pivote Inicial");
        int lista[] = {10,9,3,7,1,4,8,0};
        System.out.println("Lista inicial");
        imprimirLista(lista);
        int primer = 0;
        int ultimo = lista.length-1;
        ordenarQuickSort(lista,primer,ultimo);
        System.out.println("Lista ordenada");
        imprimirLista(lista);
    }

    public static void ordenarQuickSort(int a[], int primero, int ultimo){
        int i = primero, j = ultimo;
        int pivot = a[primero];
        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        }
        if (primero < j)
            ordenarQuickSort(a, primero, j);
        if (i < ultimo)
            ordenarQuickSort(a, i, ultimo);
    }

    public static void intercambiar ( int arreglo[], int i, int k){
        int temp = arreglo[i];
        arreglo[i] = arreglo[k];
        arreglo[k] = temp;
    }

    public static void imprimirLista (int arreglo[]){
        for (int k = 0; k < arreglo.length; k++) {
            System.out.print(" " + arreglo[k]);
        }
        System.out.println("");
    }
}


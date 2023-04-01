/*
Practica 1 de Paragdimas de programacion


x 1- Tenga una función que genere un arreglo de números enteros aleatorios. 
     a. El tamaño del arreglo será del al menos 1000 elementos.
x 2- Tenga una función para imprimir el contenido de los arreglos. 
x 3- Proporciona al menos una función de búsqueda secuencial. Ejemplifica la búsqueda para el arreglo del paso 1.
x 4- Tenga una función que ordene el arreglo generado en el paso 1.  
x 5- Ejemplifica la búsqueda con el arreglo resultante del paso 4.
6-  Calcula el tiempo de ejecución de elementos 1 a 5.
*/

/*
DELGADO ACOSTA LUIS BERNARDO
GRUPO: 3BV2

*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "quicksort.h"  
#include <windows.h>
#include <unistd.h>     // para sleep()





// Declaracion de las funciones 
void GenArreglo(int*, int);
void Imprimir(int*, int);
void BusquedaSecuencial(int*, int, int);

int main()
{   
	// Tiempo total de la ejecucion
    double time_spent = 0.0;
 	// Es una variable que se inicializa con el reloj del sistema
    clock_t begin = clock();

    //Declaramos un apuntador tipo entero para  posteriormente asignarle memoria dinámica
    //el tamanio nos permitirá complementar la asignacion de memoria dinámica
    int tamanio, *arreglo, valorBuscar;

    puts("\n Ingrese el tamaño para el arreglo :");
    scanf("%d",&tamanio);
    //Asignacion de memoria
    arreglo = (int*) malloc (sizeof(int) * tamanio);
    // Se comprueba si se pudo asignar memoria, sino el programa arroja un error y se sale del mismo
    if (arreglo ==  NULL){
        perror("\n Error al asignar memoria");
        exit(1);
    }
	//llamamos a las sig funciones
    GenArreglo(arreglo, tamanio);
    Imprimir(arreglo, tamanio);

    puts("\n Ingrese un numero entero a buscar: ");
    fflush(stdin);
    scanf("%d",&valorBuscar);
	
	// Se llama a la funcion de BusquedaSecuencial y le mandamos 
    BusquedaSecuencial(arreglo, tamanio, valorBuscar);
    puts("\n\n");
    system("pause");
    

    quicksort(arreglo, tamanio);

    puts("\n Arreglo ya ordenado"); 

    Imprimir(arreglo, tamanio);
    
    puts("\n Ingrese un numero entero a buscar: ");
    fflush(stdin);
    scanf("%d",&valorBuscar);

    BusquedaSecuencial(arreglo, tamanio, valorBuscar);
    // parte de la funcion que nos indica el tiempo de ejecución del programa 
    sleep(3);
 
    clock_t end = clock();

    time_spent += (double)(end - begin) / CLOCKS_PER_SEC;
 
    printf("El tiempo transcurrido es  %f segundos", time_spent);





    free(arreglo);
}
//Funcion para generar el arreglo de numeros aleatorios
void GenArreglo(int *arreglo, int tamanio)
{
    //Srand(time(NULL)) y rand() necesarios para generar numeros aleatorios para almacenarlos en el arreglo
    srand(time(NULL));
     
    for (int i=0; i<tamanio; i++){
        // con un apuntador al arreglo vamos ingresando los valores aleatorios
        *(arreglo +i) = rand() % 1000;

    }

}


//Funcion para imprimir el arreglo con la ayuda de un ciclo for
void Imprimir(int *arreglo, int tamanio)
{
    // solo se imprime el arreglo de numeros aleatorios
    for (int j=0; j<tamanio; j++){
        printf("\n [%d] = %d ",j,*(arreglo+j));
    }

}

void  BusquedaSecuencial(int *arreglo, int tamanio, int valorBuscar)
{
    //Busqueda secuencial con la ayuda de un ciclo for

    int indice=NULL; 

    //recorremos el arreglo secuencialmente y comparamos cada valor con nuestro valor a buscar
    for (int k=0; k<tamanio; k++){
        if (valorBuscar == *(arreglo+k))
            indice = k;
            // si existe el valor Buscado se guardará en el indice
    }
    
    if (indice == NULL){
        puts("\n El valor no fue encontrado");
    } else{
        printf("\n El valor fue encontrado en indice: %d",indice);
    }

}


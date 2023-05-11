/*   
Proyecto Semestral
Paradigmas de programacion
Autor: Delgado Acosta Luis Bernardo
Grupo: 3BV2

    Implementa un programa en C que lea el archivo de texto bezdeklris.dat
    los datos leídos del archivo deberán almacenarce en una matriz. Puedes
    realizar los ajustes que consideres adecuados en el archivo

*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define MAX_FILAS 200
#define MAX_COLUMNAS 5

int main() {

    float bezdekIris[MAX_FILAS][MAX_COLUMNAS];
    int i=0;
    int j=0;
    int k=0;
    FILE *fptr;
    // se abre el archivo en modo lectura
    fptr = fopen("C:\\Users\\delga\\Downloads\\bezdekIris.txt", "r");
    //fopen() regresará NULL cuando no haya podido abrir el archivo
    if(fptr == NULL){
        perror("No se pudo abrir el arhivo");
        exit (-1);
    }

    rewind(fptr); //pone el apuntador al inicio del archivo

    //obtiene los datos hasta que sea EOF, fscanf() considera separador ','
    while(fscanf(fptr, "%f, %f, %f, %f, %f", &bezdekIris[i][j],&bezdekIris[i][j+1],&bezdekIris[i][j+2],&bezdekIris[i][j+3],&bezdekIris[i][j+4]) != EOF)
    {
        i++;
    }
    
    printf("\n En la ultima columna, se sustituyo el string por float:");
    printf("\nIris-setosa = 1");
    printf("\nIris-versicolor = 2");
    printf("\nIris-virginica = 3\n");
    //mostramos cada dato de la matriz 
    for(k=0; k<i; k++){
        for(j=0; j<MAX_COLUMNAS; j++){
            printf("[%f] ",bezdekIris[k][j]);
        }
        printf("\n");
    }

    //cerramos el archivo de texto
    fclose(fptr);


}
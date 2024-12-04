#include <stdio.h>
#include <string.h>

void derivarNumero(char *numero);

int main(){
    char numero[100];

    printf("Ingrese un numero: ");
    scanf("%s", numero);

    printf("Derivacion para %s:\n", numero);
    derivarNumero(numero);

    return 0;
}

void derivarNumero(char *numero) {
    int longitud = strlen(numero);
    printf("En -> DR\n");

    char actual[100] = "";
    
    for(int i=0; i<longitud; i++) {
        strncat(actual, &numero[i], 1);  
        if(i==0) {
            printf("   -> %cR\n", numero[i]);
            printf("   -> %cDR\n", numero[i]);
        }else if(i < longitud-1){
            printf("   -> %sR\n", actual);
            printf("   -> %sDR\n", actual);
        }else{
            printf("   -> %sR\n", actual);
            printf("   -> %s\n", actual);
        }
    }
}



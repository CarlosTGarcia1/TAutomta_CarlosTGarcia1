#include <stdio.h>
#include <string.h>
#include <ctype.h>

void analizarDigito (char numero[]);

int main(){
	char numero[50]; 
	printf("Por favor ingrese un numero: "); 
	scanf("%s", numero); 
	
	analizarDigito(numero); 
	
	return 0;
}
	

void derivar (char entero[], char decimale[], char signo){
	printf("F -> Es . En\n");

	if (signo){ 
		printf("-> S En . En\n"); 
		printf("-> %c En . En\n", signo); 
		printf("-> %cDR . En\n", signo);
	}else{ 
		printf("-> S En . En\n"); 
		printf("-> En . En\n"); 
		printf("-> DR . En\n");
	}
	
	for (int i=0; entero[i]!='\0'; i++){
		printf("-> ");
		if (signo){
			printf("%c", signo);
		}
		for (int j=0; j<=i; j++){
			printf("%c", entero[j]);
		}
		printf("R . En\n");
		
		if (entero[i+1]!='\0'){
			printf("-> ");
			if (signo){ 
				printf("%c", signo); 
			}
			for(int j = 0; j <= i; j++){ 
				printf("%c", entero[j]); 
			} 
			printf("DR . En\n");
		}
	}
	
	printf("-> ");
	if (signo){ 
		printf("%c", signo); 
	} 
	printf("%s . En\n", entero); 
	printf("-> "); 
	if (signo){ 
		printf("%c", signo); 
	} 
	printf("%s . DR\n", entero);
	

	
	char aux[50]="";
	int indice=0;
	
	for (int i=0; decimale[i]!='\0'; i++){
		aux[indice++]=decimale[i];
		aux[indice]='\0'; 
		
		printf("-> ");
		if (signo){ 
			printf("%c", signo);
		}
		printf("%s . %sR\n", entero, aux); 
		
		if (decimale[i + 1] != '\0'){ 
			printf("-> ");
			if (signo){ 
				printf("%c", signo); 
			} 
			printf("%s . %sDR\n", entero, aux); 
		}
	} 
	printf("-> "); 
	if (signo){ 
		printf("%c", signo); 
	} 
	printf("%s . %s\n", entero, decimale);
}
		

void analizarDigito (char numero[]){
	char entero[50]= ""; 
	char decimal[50]= ""; 
	char signo= '\0';
	int i=0, j=0, k=0; 
	
	if (numero[i]=='+' || numero[i]=='-'){
		signo=numero[i]; 
		i++;
	}
	
	while (numero[i]!='.' && numero[i]!='\0'){
		entero[j++]=numero[i++]; 
	}
	entero[j]='\0'; 
	
	if (numero[i]=='.'){
		i++;
		while (numero[i]!='\0'){
			decimal[k++]=numero[i++];
		}
	}
	decimal[k]='\0';
	
	derivar(entero, decimal, signo); 
}
	
			 
	

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <math.h>
//prototipi funzioni
void main2();


char  *conversioneFloat(float number){
  
 char *buf = malloc(10*sizeof(char));
 sprintf (buf, "%f", number);
  return buf;
}
char * conversioneInt(int number){
 char *buf = malloc(10*sizeof(char));
 sprintf (buf, "%d", number);
  return buf;
}char supporto[100];

void main2(){
	int ultimo,penultimo,f;
	penultimo = 0;
		printf("%d \n", penultimo);
	ultimo = 1;
		printf("%d \n", ultimo);
	for (int i = 2;i <= 10;i++){
	f = ultimo + penultimo;
		printf("%d \n", f);
	penultimo = ultimo;
	ultimo = f;
}
}
int main(){
int intero=0;
char carattere=' ';
float float1=0;
char *stringa="";
bool booleano=false;
main2();
return 0;
}

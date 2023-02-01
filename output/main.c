#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <math.h>
//prototipi funzioni
void stampa(char * messaggio);
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

void stampa(char * messaggio){
		printf("%s \n", messaggio);
}
void main2(){
	int a = 3;
	int b;
	{
	int a = 2;
	stampa("primoLet");
	{
	int a = 1;
	float b = 2.3;
	char *size = (char*) malloc(sizeof(char) * 100) ;
	float result;
	result = a + b;
	if(result > 100){
	char * valore = (char*) malloc(sizeof(char) * 100);
strcpy(valore , "grande");
	size = valore;
}
else{
	{
	char * valore = (char*) malloc(sizeof(char) * 100);
strcpy(valore , "piccola");
	size = valore;
}

}
		printf("%s ", size);
}

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

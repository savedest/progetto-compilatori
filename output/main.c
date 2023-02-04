#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <math.h>
//prototipi funzioni
void test();


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

void test(){
	int i=3;
   while (i < 3){
	char *messaggio = (char*) malloc(sizeof(char) * 100) strcpy(messaggio , "ciao");
		printf("%s \n", messaggio);
}
   while (!(i < 3)){
	char *messaggio = (char*) malloc(sizeof(char) * 100) strcpy(messaggio , "no");
		printf("%s \n", messaggio);
	i = i - 1;
}
}
int main(){
int intero=0;
char carattere=' ';
float float1=0;
char *stringa="";
bool booleano=false;
test();
return 0;
}

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

	int F = 5;
char * j =  (char*) malloc(sizeof(char) * 100);
strcpy(j , "huu");
void test(){
		printf("%s %s \n", "fuori rr ", j);
}
int main(){
;
j;
int intero=0;
char carattere=' ';
float float1=0;
char *stringa="";
bool booleano=false;
test();
return 0;
}

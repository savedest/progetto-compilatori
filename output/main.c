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
	int k;
	{	int k=1,j=1,i=1;

do {
		printf("%s ", "ciao, ");
		printf("%d ", i);
		printf("%s ", ", ");
		printf("%d \n", j);
		printf("%d ", k);
i = i + 1;
;
j = j - 1;
;
k = i + 1;
;
}
while (i < 20 && j >  -20);
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

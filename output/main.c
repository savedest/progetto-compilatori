#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <math.h>
//prototipi funzioni
int test2(int a,int b,int c);
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

int test2(int a,int b,int c){
	return a + b + c;
}
void test(){
	int a;
	a = test2(2 * 2,2 * 2,4 * 3) + test2(2 * 1,4 * 2,2) + test2(3 * 2,2 * 2,2 * 2);
		printf("%d \n", a);
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

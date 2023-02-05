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

	int d = 3;
	float f = 4.8;
void test(){
	int s=4;
	int ss=7;
	switch( s){ 
	case 4:	ss = 8;
break;
 	case 3:	ss = 7;
break;
 	case 2:	ss = 7;
break;
 	case 1:	ss = 7;
break;
 }
		printf("%s %d \n", "ss value-> ", ss);
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

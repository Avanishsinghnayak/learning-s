#include <stdio.h>
int main (){
float p;
int r;
int t;
printf("enter the value of p :\n");
scanf("%f" , &p);
printf("enter value of r:\n");
scanf("%d" , &r);
printf("enter the value of t:\n");
scanf("%d" , &t);
 printf("the value of simple interest is %f" , (p*r*t)/100);
 
    return 0;
}
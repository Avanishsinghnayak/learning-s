#include <stdio.h>
int main(){
    int a,b,c,d;
    printf("enter the value of a b c and d:");
    scanf("%d %d %d %d", &a, &b, &c, &d);
    if(a>b && a>c && a>d){
        printf("the greatest value among all integers is %d" , a);
    }
     else if(b>a && b>c && b>d){
        printf("the greatest value among all integers is %d" , b);
     }
    else if(c>b && c>a && c>d){
        printf("the greatest value among all integers is %d" , c);
     }
     else{
        printf("the greatest value among all integrs is %d" , d);
     }

    return 0;
}
#include <stdio.h>
int main(){
    int num;
    printf("enter the number:");
    scanf("%d" ,num );

    if (num % 97==0)
    printf("the number is divisible by 97\n" , num);
    else 
    printf("the number is not divisible by 97" , num);
    return 0;
}
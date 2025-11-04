#include<stdio.h>
int main(){
    int age = 45;
    printf("enter you age:", age);
    scanf("%d",&age);
    if(age < 2){
        printf("you can become pilot\n");
    }
    if(age >=18){
        printf("you can drive");
    }
    else{
        printf("you can't drive");
    }
    
    return 0;
}
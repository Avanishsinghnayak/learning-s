#include <stdio.h>
int main(){
    float c , f ;
    printf("enter the value of celcius:");
    scanf("%f", &c);
    f = ((9.0/5.0)*c + 32); //inpute le raha hai but output nhi aa rha hai kam arna hai isme 

    printf("the value in fahrenhiet if %f" , f);
    return 0;
}
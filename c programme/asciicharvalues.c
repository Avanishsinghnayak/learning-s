#include <stdio.h>
int main(){
    char ch;
    printf("enter the character value:");
scanf("%c", &ch);
if(ch>=97 && ch<=122){
    printf("the character value is lowercase");
}
else{
    printf("the character value is non-lowercase");
}
    return 0;
}
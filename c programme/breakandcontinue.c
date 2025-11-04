#include <stdio.h>
int main(){
    for(int i = 0; i<15; i++){
        if(i==5){
            break;//aise hi agar continue laga denge to vo direct 5 ko skip kar dega 
        }
        printf("i is %d\n" , i);
    }
    printf("the break conditon is applied");
    return 0;
}
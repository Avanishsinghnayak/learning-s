#include <stdio.h>
#include <stdlib.h>
#include <time.h>
 
int main (){
    srand (time (0));
    int randomnumber = (rand() %100);
    int no_of_guesses= 0;
    int guessed_number;
do 
{
    printf("guess the number:");
    scanf
    ("%d", &guessed_number);
    if(guessed_number > randomnumber)
    {
        printf("lower the please!\n");

    }
    else if (guessed_number < randomnumber){
        printf("higher number please!\n");
    }
    else{
        printf("congrates!\n");
    }
    no_of_guesses++;
}
while (guessed_number!=randomnumber);
    printf("you guessed the number in %d guesses" , no_of_guesses);

return 0;
}
    




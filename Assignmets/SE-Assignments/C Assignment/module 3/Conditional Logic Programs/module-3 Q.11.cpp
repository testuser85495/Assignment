//WAP to find number is even or odd using ternary operator

#include <stdio.h>

int main() 
{
	int num,temp;
    printf("Enter any number:");
    scanf("%d",&num);
    
    //condition: even or odd with temp 
    if(num % 2 == 0)
    {
    	temp = num;
    	printf("Even number: %d\n", temp);
	}
	else
	{
		temp = num;
		printf("Odd number: %d\n", temp);
	}
	

    return 0;
}

//WAP to find minimum number among 3 numbers using ternary operator

#include <stdio.h>

int main() 
{
    int num1, num2, num3, min;

    printf("Enter three numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);

    //condition: Find the largest among the three numbers using if-else statements
    if (num1 <= num2 && num1 <= num3) 
	{
        min = num1;
    } 
	else if (num2 <= num1 && num2 <= num3) 
	{
        min = num2;
    } 
	else 
	{
        min = num3;
    }

    // Display the minimum number
    printf("minimum number: %d\n", min);

    return 0;
}


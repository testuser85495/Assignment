//WAP to find maximum number among 3 numbers using ternary operator


#include <stdio.h>

int main() 
{
    int num1, num2, num3, max;

    printf("Enter three numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);

    // Find the largest among the three numbers using if-else statements
    if (num1 >= num2 && num1 >= num3) 
	{
        max = num1;
    } 
	else if (num2 >= num1 && num2 >= num3) 
	{
        max = num2;
    } 
	else 
	{
        max = num3;
    }

    // Display the largest number
    printf("Largest number: %d\n", max);

    return 0;
}




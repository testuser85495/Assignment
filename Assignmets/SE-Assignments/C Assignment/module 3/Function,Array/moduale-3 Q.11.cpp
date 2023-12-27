//WAP to accept 5 numbers from user and display in reverse order using for loop and array

#include<stdio.h>

int main()
{
	int i,num[5],reverse = 0, remainder;;
	
	//loop to store elements in array
	for(int i=0;i<5;i++)
	{
		printf("Enter element : ");
		scanf("%d",&num[i]);
	}
	
	//loop to reverse a numbers store in array elements
	for(num != 0;i<5;i++)
	{
		remainder = num[i] % 10;
    	reverse = reverse * 10 + remainder;
    	num[i] /= 10;
	}
	printf("Reversed number = %d", reverse);
	
	return 0;
}


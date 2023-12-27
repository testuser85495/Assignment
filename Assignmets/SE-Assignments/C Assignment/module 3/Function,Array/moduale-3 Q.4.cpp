//WAP to find factorial using recursion 

#include<stdio.h>
//function create
int fact(int nx)
{
	int fact=1;
	
	//for loop : to find factriol of give numbers
	for(int i=1;i<=nx;i++)
	{
		fact*=i;
	}
	
	//return the factriol ans
	return fact;
}

int main()
{
	
	int num;
	
	printf("Enter num : ");
	scanf("%d",&num);
	
	//recursion call
	printf("\nFactorial of %d is : %d",num,fact(num));
	
	return 0;
}

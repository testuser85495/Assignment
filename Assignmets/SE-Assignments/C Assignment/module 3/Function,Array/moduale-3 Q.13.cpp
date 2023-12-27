//WAP to accept 5 numbers from user and check entered number is even or odd using of array

#include<stdio.h>

int main()
{
	
	int num[5];
	
	//loop to accept 5 numbers 
	for(int i=0;i<5;i++)
	{
		printf("Enter number to check number is even or odd:",i);
		scanf("%d",&num);
 	
		//condtion to check number is even or odd
		if(num[i] %2==0)
		{
			printf("number is even\n",num[i]);
		}
		else
		{
			printf("number is odd\n",num[i]);
		}
	}
	return 0;
}

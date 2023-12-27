//Accept 3 numbers from user using while loop and check each numbers palindrome
#include<stdio.h>

int main()
{
	int num,rem,reverse,x;
	
	printf("Enter any 3 digits number to check its palindrome or not:");
	scanf("%d",&num);
	
	x=num;
	
	
	while(num != 0)
	{
		rem = num % 10;
		reverse = reverse*10+rem;
		num /= 10;
	};
	
	// condition to check Palindrome or not Palindrome
	if(x == reverse)
	{
		printf("%d is Palindrome\n",x);
	}
	else
	{
		printf("%d is not Palindrome",x);
	}
	return 0;
}

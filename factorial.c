#include<stdio.h>
int facto( int n)
{  int p=1,i;
	for(i=1; i<=n ; i++)
	{
		p=p*i;
	}
	return p;
}
int main()
{
	int n,x,p=1,i;
	printf("enter number to get --");
	scanf("%d",&n);
    p=facto(n);
	
	printf("%d",p);
	
	return 0;
}

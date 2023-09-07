#include <stdio.h>

int main() 
{
	
    char s[100];
    scanf("%99[^\n]s", &s);
  
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    printf("Hello, World!");
    printf("\n%s\n", s);
    return 0;
}

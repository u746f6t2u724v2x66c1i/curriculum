#include <stdio.h>

int main()
{
	  int a, b;
    double c, d;
    scanf("%d %d", &a, &b);
    scanf("%lf %lf", &c, &d);
    printf("%d %d\n", a + b, a - b);
    printf("%.1lf %.1lf\n", c + d, c - d);
  
    return 0;
}

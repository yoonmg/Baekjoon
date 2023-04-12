#include <stdio.h>

long long int Euclidean(long long int x, long long int y)
{
    if (x > y)
    {
        long long int res = x % y;
        if (res == 0)
        {
            return y;
        }
        else
        {
            return Euclidean(y, res);
        }
    }
    else if (x < y)
    {
        long long int res = y % x;
        if (res == 0)
        {
            return x;
        }
        else
        {
            return Euclidean(x, res);
        }
    }
}

int main()
{
    long long int a, b;
    scanf_s("%lld %lld", &a, &b);
    printf("%lld", Euclidean(a, b) * (a / Euclidean(a, b)) * (b / Euclidean(a, b)));
    return 0;
}
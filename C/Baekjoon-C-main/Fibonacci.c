#include <stdio.h>

int repetition(int a);

int main()
{
    int num, ans;
    scanf_s("%d", &num);
    ans = repetition(num);
    printf("%d", ans);
    return 0;
}
int repetition(int a)
{
    int sum = 0;
    if (a <= 1)
    {
        return a;
    }
    else
        return sum = repetition(a - 1) + repetition(a - 2);
}
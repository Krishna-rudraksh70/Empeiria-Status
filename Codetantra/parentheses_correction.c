#include <stdio.h>
#include <string.h>
#define size 20

int top = -1, i;
char stack[size];

void push(char ch)
{
    if (top == (size - 1))
        printf("Stack is Overflow\n");
    else
        stack[++top] = ch;
}
char pop()
{
    if (top == -1)
        printf("Stack is Underflow\n");
    else
        return stack[top--];
}
int isMatchingPair(char c1, char c2)
{
    if (c1 == '(' && c2 == ')')
        return 1;
    else if (c1 == '{' && c2 == '}')
        return 1;
    else if (c1 == '[' && c2 == ']')
        return 1;
    else
        return 0;
}

int areBracketsBalanced(char exp[])
{
    while (exp[i] != '\0')
    {
        if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
            push(exp[i]);
        if (exp[i] == '}' || exp[i] == ')' || exp[i] == '1')
        {
            if (top == -1)
                return 0;
            else if (!isMatchingPair(pop(), exp[i]))
                return 0;
        }
        i++;
    }
    if (top == -1)
        return 1;
    else
        return 0;
}
void main()
{
    char exp[100];

    printf("Enter expression. \n");
    gets(exp);
    if (areBracketsBalanced(exp))
        printf("Expression is valid\n");
    else
        printf("Expression is Invalid\n");
}
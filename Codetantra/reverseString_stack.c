#include<string.h>
#include<stdio.h>
#include<conio.h>
#define STACK_MAX_SIZE 30
char arr[STACK_MAX_SIZE];
int top = -1;
void push(char element) {
	if(top == STACK_MAX_SIZE - 1) {
		printf("Stack is overflow.\n");
	} else {
		top = top + 1;
		arr[top] = element;
	}
}
char pop() {
	long int x;
	if(top < 0) {
		printf("Stack is underflow.\n");
	} else {
		x = arr[top];
		top = top - 1;
		return x;
	}
}
void reverse(char str[]) { 
	int i, n;
	n=strlen(str);
	for(i=0; i<n; i++)
		push(str[i]);
	
	for(i=0; i<n; i++)
		str[i] = pop();
}
void main() {
	char ch[80], temp;
	printf("Enter a string : ");
	scanf("%s", ch);
	reverse(ch);
	printf("The reverse of a given string : %s\n", ch);
}
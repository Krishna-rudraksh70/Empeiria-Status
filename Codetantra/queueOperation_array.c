#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int qu[MAX];
int rear = -1, front = -1;

void Enqueue()
{
    int add;
    if (rear == MAX - 1)
        printf("Queue Overflow \n");
    else
    {
        if (front == -1)
            front = 0;
        printf("Insert the element in queue : ");
        scanf("%d", &add);
        qu[++rear] = add;
        printf("Successfully insered\n");
    }
}

void Dequeue()
{
    if (front == -1 || front > rear)
        printf("Queue Underflow \n");
    else
        printf("Deleted Element : %d\n", qu[front++]);
}

void size()
{
    if (front == rear)
        printf("Queue Underflow \n");
    else
        printf("%d\n", rear - front);
}

void isEmpty()
{
    if (front == rear)
        printf("Queue is Empty\n");
    else
        printf("Queue is not Empty\n");
}

void display()
{
    int i;
    if (front == -1)
        printf("Queue is empty \n");
    else
    {
        printf("Elements in Queue : \n");
        for (i = front; i <= rear; i++)
            printf("%d ", qu[i]);
        printf("\n");
    }
}
void main()
{
    int c;
    while (1)
    {
        printf(" 1.Enqueue\n 2.Dequeue\n 3.Display\n 4.Is Empty\n 5.Size\n 6.Exit\n");
        printf("Enter your choice : ");
        scanf("%d", &c);
        switch (c)
        {
        case 1:
            Enqueue();
            break;
        case 2:
            Dequeue();
            break;
        case 3:
            display();
            break;
        case 4:
            isEmpty();
            break;
        case 5:
            size();
            break;
        case 6:
            exit(0);
        default:
            printf("Wrong choice \n");
        }
    }
}
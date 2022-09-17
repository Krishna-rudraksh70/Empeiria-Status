#include <stdio.h>

#include <stdlib.h>

#define max 20
int queue[max], front = -1, rear = -1;
void Enqueue(int ele)
{
    if ((front == rear + 1) || (front == 0 && rear == max - 1))
        printf("Queue is full!! \n");
    else
    {
        if (front == -1)
            front = 0;
        rear = (rear + 1) % max;
        queue[rear] = ele;
        printf("Successfully inserted.\n");
    }
}
void Dequeue()
{
    if (front == -1)
        printf("Circular queue is underflow\n");
    else
        printf("Deleted element = %d\n", queue[front--]);
}
int Display()
{
    int i;
    if (front == -1)
        printf("Circular queue is empty\n");
    else
    {
        printf("Elements in the queue : ");
        for (i = front; i != rear; i = (i + 1) % max)
            printf("%d ", queue[i]);
    }
}

void IsEmpty()

{

    if (front == -1)
        printf("Circular queue is empty\n");
    else
        printf("Circular queue is not empty\n");
}

void size()
{
    if (front == rear)
        printf("Circular queue is underflow \n");
    else
        printf("Circular queue size : %d\n", rear - front);
}
void main()
{
    int op, x;
    while (1)
    {
        printf("1.Enqueue 2.Dequeue 3.Display 4.Is Empty 5.Size 6.Exit\n");
        printf("Enter your option : ");
        scanf("%d", &op);
        switch (op)
        {
        case 1:
            printf("Enter element : ");
            scanf("%d", &x);
            Enqueue(x);
            break;
        case 2:
            Dequeue();
            break;
        case 3:
            Display();
            break;
        case 4:
            IsEmpty();
            break;
        case 5:
            size();
            break;
        case 6:
            exit(0);
        }
    }
}
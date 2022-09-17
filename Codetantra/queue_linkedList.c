#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};
struct Node *front = NULL;
struct Node *rear = NULL;
struct Node *rudraksh = NULL;
void enqueue(int ele)
{
    rudraksh = (struct Node *)malloc(sizeof(struct Node));
    rudraksh->data = ele;
    if (front == NULL)
    {
        front = rudraksh;
        front->next = NULL;
    }
    else
        rear->next = rudraksh;
    rear = rudraksh;
    rear->next = NULL;
    printf("Successfully inserted.\n");
}
void dequeue()
{
    if (front == NULL)
        printf("Queue is underflow.\n");
    else
    {
        printf("Deleted value = %d\n", front->data);
        front = front->next;
    }
}
void display()
{
    rudraksh = front;
    if (rudraksh == NULL)
        printf("Queue is empty.");
    else
    {
        printf("Elements in the queue : ");
        while (rudraksh != NULL)
        {
            printf("%d ", rudraksh->data);
            rudraksh = rudraksh->next;
        }
    }
    printf("\n");
}

void isEmpty()
{

    if (front == NULL)

        printf("Queue is empty.\n");
    else
        printf("Queue is not empty.\n");
}
void size()
{
    int n = 0;
    rudraksh = front;
    while (rudraksh != NULL)
    {
        n++;
        rudraksh = rudraksh->next;
    }
    printf("Queue size : %d\n", n);
}
int main()
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
            enqueue(x);
            break;
        case 2:
            dequeue();
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
        }
    }
}
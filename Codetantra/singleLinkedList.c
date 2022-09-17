#include <stdio.h>

#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};
struct Node *head = NULL;
int ele, i;
void add_node()
{
    struct Node *n_node = (struct Node *)malloc(sizeof(struct Node));
    head = n_node;
    printf("Enter elements up to -1 : ");
    do
    {
        scanf("%d", &ele);
        n_node->data = ele;
        n_node->next = (struct Node *)malloc(sizeof(struct Node));
    } while (n_node->data != -1);
}
void ins_beg()
{
    printf("Enter any element : ");
    struct Node *n_node = (struct Node *)malloc(sizeof(struct Node));
    scanf("%d", &ele);
    n_node->data = ele;
    n_node->next = head;
    head = n_node;
}
void ins_end()
{
    struct Node *last = head;
    printf("Enter any element : ");
    struct Node *n_node = (struct Node *)malloc(sizeof(struct Node));
    scanf("%d", &ele);
    n_node->data = ele;
    n_node->next = NULL;
    if (head == NULL)
        head = n_node;
    else
    {
        while (last->next != NULL)

            last = last->next;

        last->next = n_node;
    }
}
void ins_pos()
{
    int pos;
    printf("Enter a position : ");
    scanf("%d", &pos);
    printf("Enter any element : ");
    struct Node *n_node = (struct Node *)malloc(sizeof(struct Node));
    scanf("%d", &ele);
    n_node->data = ele;
    struct Node *temp = head;
    for (int i = 2; i < pos; i++)
        if (temp->next != NULL)
            temp = temp->next;
    n_node->next = temp->next;
    temp->next = n_node;
}
void del_beg()
{
    printf("The deleted element from SLL : %d\n", head->data);
    head = head->next;
}
void del_end()
{
    struct Node *temp = head;
    while (temp->next->next != NULL)
        temp = temp->next;
    printf("The deleted element from SLL : %d\n", temp->next->data);
    temp->next = NULL;
}
void del_pos()
{
    struct Node *temp = head;
    int pos;
    printf("Enter a position : ");
    scanf("%d", &pos);
    for (int i = 2; i < pos; i++)

        if (temp->next != NULL)

            temp = temp->next;
    printf("The deleted element from SLL : %d\n", temp->data);
    temp->next = temp->next->next;
}
void c()
{
    int count = 0;
    struct Node *temp = head;
    while (temp != NULL)
    {
        temp = temp->next;
        count++;
    }
    printf("%d elements in Link List\n", count);
}
void dis()
{
    struct Node *temp = head;
    printf("The elements in SLL are :");
    while (temp != NULL)
    {
        printf(" %d -->", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}
void ser()
{
    struct Node *temp = head;
    int key;
    printf("Enter element to search in SLL : ");
    scanf("%d", &key);
    while (temp != NULL)
    {
        if (temp->data == key)
        {
            printf("The element found\n");
            return;
        }
        temp = temp->next;
    }

    printf("The element not found\n");
}
void main()
{
    int op;
    while (1)
    {
        printf("1.Add Nodes 2.Insert At Begin 3.Insert At End 4.Insert At Position\n");
        printf("5.Delete At Begin 6.Delete At End 7.Delete At Position\n");
        printf("8.Count 9.Traverse List 10.Search 11.Exit\nEnter your option : ");
        scanf("%d", &op);
        switch (op)
        {
        case 1:
            add_node();
            break;
        case 2:
            ins_beg();
            break;
        case 3:
            ins_end();
            break;
        case 4:
            ins_pos();
            break;
        case 5:
            del_beg();
            break;
        case 6:
            del_end();
            break;
        case 7:
            del_pos();
            break;
        case 8:
            c();
            break;
        case 9:
            dis();
            break;
        case 10:
            ser();
            break;
        case 11:
            exit(0);
            break;
        }
    }
}
#include <stdio.h>

#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};
struct Node *root = NULL;
int ele, v = 0;
int ser()
{
    struct Node *crnt = root;
    while (crnt->data != ele)
    {
        if (crnt != NULL)
            printf("%d ", crnt->data);
        if (crnt->data > ele)
            crnt = crnt->left;
        else
            crnt = crnt->right;
        if (crnt == NULL)
        {
            printf("Element not found in threaded binary tree.\n");
            return -1;
        }
    }
    v = 1;
    printf("Element found in threaded binary tree.\n");
    return 1;
}
struct Node *ins(struct Node *rt)
{
    if (v == 1)
        printf("Duplicates are not allowed.\n");
    else if (rt == NULL)
    {
        rt = (struct Node *)malloc(sizeof(struct Node));
        rt->data = ele;
        rt->left = rt->right = NULL;
    }
    else if (ele < root->data)

        rt->left = ins(rt->left);

    else if (ele > rt->data)
        rt->right = ins(rt->right);
    return rt;
}
struct Node *fnd_m(struct Node *rt)
{
    if (rt == NULL)
        return NULL;
    else if (rt->left != NULL)
        return fnd_m(rt->left);
    else if (rt->left == NULL)
        return rt;
}
struct Node *del(struct Node *rt)
{
    struct Node *t;
    if (rt == NULL)
        printf("threaded binary tree is empty.\n");
    else if (ele < rt->data)
        rt->left = del(rt->left);
    else if (ele > rt->data)
        rt->right = del(rt->right);
    else if ((rt->left != NULL) && (rt->right != NULL))
    {
        t = fnd_m(rt->right);
        rt->data = t->data;
        ele = rt->data;
        rt->right = del(rt->right);
    }
    else
    {
        t = rt;
        if (rt->left == NULL)
            rt = rt->right;
        else if (rt->right == NULL)
            rt = rt->left;
    }
    free(t);
    return rt;
}
void in(struct Node *node)
{
    if (node != NULL)
    {
        in(node->left);

        printf("%d ", node->data);

        in(node->right);
    }
}
void main()
{
    int op;
    while (1)
    {
        printf("1.Insert 2.Delete 3.Search 4.Traversal 5.Exit\nEnter your choice : ");
        scanf("%d", &op);
        switch (op)
        {
        case 1:
            printf("Enter an element to be inserted : ");
            scanf("%d", &ele);
            root = ins(root);
            break;
        case 2:
            printf("Enter the element to be deleted : ");
            scanf("%d", &ele);
            root = del(root);
            break;
        case 3:
            printf("Enter the element to be searched : ");
            scanf("%d", &ele);
            ser();
            break;
        case 4:
            if (root == NULL)
                printf("threaded binary tree is empty.\n");
            else
            {
                printf("Elements of the threaded binary tree : ");
                in(root);
                printf("\n");
            }
            break;
        case 5:
            return;
        default:
            break;
        }
    }
}
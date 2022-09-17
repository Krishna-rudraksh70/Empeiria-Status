#include <stdio.h>

#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};
struct node *n_node(int x)
{
    struct node *node = (struct node *)malloc(sizeof(struct node));
    node->data = x;
    node->left = NULL;
    node->right = NULL;
    return (node);
}
void post(struct node *node)
{
    if (node != NULL)
    {
        post(node->left);
        post(node->right);
        printf("%d ", node->data);
    }
}
void in(struct node *node)
{
    if (node != NULL)
    {
        in(node->left);
        printf("%d ", node->data);
        in(node->right);
    }
}

void pre(struct node *node)
{

    if (node != NULL)
    {

        printf("%d ", node->data);
        pre(node->left);
        pre(node->right);
    }
}
void main()
{
    struct node *root = n_node(1);
    root->left = n_node(2);
    root->right = n_node(3);
    root->left->left = n_node(4);
    root->left->right = n_node(5);
    printf("Preorder traversal of binary tree is : ");
    pre(root);
    printf("\n");
    printf("Inorder traversal of binary tree is : ");
    in(root);
    printf("\n");
    printf("Postorder traversal of binary tree is : ");
    post(root);
    printf("\n");
}
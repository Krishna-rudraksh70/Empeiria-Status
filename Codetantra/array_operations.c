#include <stdio.h>

int i, size, arr[5], pos, ele, n = 0;

void crt()
{
	printf("Enter the size of the array elements: \n");
	scanf("%d", &size);

	printf("Enter the elements for the array: \n");

	for (i = 0; i < size; i++)
	{
		scanf("%d", &arr[i]);
	}
}

void dsply()
{
	printf("The array elements are: \n");
	for (i = 0; i < size; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void insrt()
{
	printf("Enter the position for the new element: \n");
	scanf("%d", &pos);
	printf("Enter the element to be inserted : \n");
	scanf("%d", &ele);
	size++;
}

void del()
{
	printf("Enter the position for deletion: \n");
	scanf("%d", &pos);
}

void ser()
{
	printf("Enter the element to be searched:\n");
	scanf("%d", &ele);

	for (i = 0; i < size; i++)
	{
		if (ele == arr[i])
		{
			printf("The element is present at position %d\n", i);
			break;
		}
	}
}

void main()
{

	while (n != 6)
	{
		printf("Menu\n1.Create\n2.Display\n3.Insert\n4.Delete\n5.Search\n6.Exit\nEnter your choice: \n");
		scanf("%d", &n);

		switch (n)
		{
		case 1:
			crt();
			break;
		case 2:
			dsply();
			break;
		case 3:
			insrt();
			break;
		case 4:
			del();
			break;
		case 5:
			ser();
			break;
		default:
			break;
		}
	}
}
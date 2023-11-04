# Update the '_' below to solve the problem

t = int(input())
for i in range(t):
    n = int(input())
    
    # Condition 1
    if n%3 == 0:
        print('Divisible by 3')
    else:
        print('Not divisible by 3')
    
    #Condition 2
    if n%2 != 0:
        print('Odd')
    else:
        print('Even')
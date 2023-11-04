# Update the program below to solve the problem

t = int(input())            
for i in range(t):          
    A, C = map(int, input().split())
    B = A+C
    if (B/2) == float(B//2):
        print(B//2)
    else:
        print(-1)
    
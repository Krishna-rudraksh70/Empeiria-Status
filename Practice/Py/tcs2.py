# n1 = int(input())
# n2 = int(input())
# arr = []
# for i in range(0, n2):
#     ele = int(input())
#     arr.append(ele)
# def getPairs(arr, n2, n1):
#     count = 0
#     for i in range(0, n2):
#         for j in range(i+1, n2):
#             if  arr[i] + arr[j] == n1:
#                 count += 1
#     return count

# n, m = map(int, input().split())
# lst = []
# c0 = 0
# c1 = 0
# for i in range(n):
#     lst.append(list(map(int, input().split())))
# for i in lst:
#     c0 += i.count(0)
#     c1 += i.count(1)
# if(c0 == 0):
#     print(0)
# else:
#     print((c1+2)-0)
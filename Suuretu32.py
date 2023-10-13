N = int(input())
A = [int(x) for x in input().split()]
Q = int(input())
B = [int(x) for x in input().split()]

for i in range(Q):
    print(A[B[i]-1])

import math

T = int(input())

for i in range(0, T):
	A, B = map(int, input().split())
	print(math.lcm(A, B))
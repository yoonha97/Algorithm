N = int(input())
prize = []

for i in range(0, N):
	A, B, C = sorted(list(map(int, input().split())))
        
	if(A == B or B == C):
		if(A == C):
			prize.append(10000 + 1000 * A)
		else:
			prize.append(1000 + 100 * B)
	else:
		prize.append(C * 100)

print(max(prize))
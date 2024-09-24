X = []
Y = []
ans_X = 0
ans_Y = 0

for i in range(0, 3):
	x, y = map(int, input().split())
	X.append(x)
	Y.append(y)

for i in range(0, 3):
	if(X.count(X[i]) == 1):
		ans_X = X[i]

	if(Y.count(Y[i]) == 1):
		ans_Y = Y[i]

print(ans_X, ans_Y)
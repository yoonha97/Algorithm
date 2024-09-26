N = int(input())

for _ in range(N):
	S = int(input())
	is_prime = True

	for i in range (2, 1000001):
		if i * i > S:
			break
		if S % i == 0:
			is_prime = False
			print("NO")
			break

	if is_prime:
		print("YES")
n, m = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()

for i in range(m):
	temp = arr[0] + arr[1]
	arr[0] = temp
	arr[1] = temp
	arr.sort()

print(sum(arr))
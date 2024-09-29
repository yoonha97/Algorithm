list = []
sum = 0

for _ in range(9):
	num = int(input())
	sum += num
	list.append(num)

list.sort()

for i in range(8):
	for j in range(i + 1, 9):
		if list[i] + list[j] == sum - 100:
			for k in range(9):
				if k == i or k == j:
					continue
				else:
					print(list[k])
			exit()
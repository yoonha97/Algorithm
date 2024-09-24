sum = 0

for i in range(1, 6):
	temp = int(input())

	if(temp < 40):
		temp = 40
	
	sum += temp

print(sum // 5)
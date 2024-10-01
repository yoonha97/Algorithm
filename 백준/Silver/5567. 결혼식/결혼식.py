from collections import deque

n = int(input())
m = int(input())
rel = [[] for _ in range(n + 1)]

for _ in range(m):
	a, b = map(int, input().split())
	rel[a].append(b)
	rel[b].append(a)

visited = [False] * (n + 1)

def BFS(start):
	q = deque([(start, 0)])
	visited[start] = True
	cnt = 0

	while q:
		cur, depth = q.popleft()

		if depth >= 2:
			continue
		
		for next in rel[cur]:
			if not visited[next]:
				visited[next] = True
				cnt += 1
				q.append([next, depth + 1])
	
	return cnt

print(BFS(1))
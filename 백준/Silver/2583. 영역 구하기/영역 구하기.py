from collections import deque

dr = [1, 0, -1, 0]
dc = [0, 1, 0, -1]

def BFS (startR, startC, graph, visited, N, M):
	q = deque([(startR, startC)])
	visited[startR][startC] = True
	size = 1

	while q:
		curR, curC = q.popleft()

		for dir in range(4):
			newR = curR + dr[dir]
			newC = curC + dc[dir]

			if newR >= 0 and newR < N and newC >= 0 and newC < M and not visited[newR][newC] and graph[newR][newC] == 0:
				q.append((newR, newC))
				visited[newR][newC] = True
				size += 1

	return size

def divide(N, M, graph):
	visited = [[False] * M for _ in range(N)]
	sizes = []

	for i in range(N):
		for j in range(M):
			if graph[i][j] == 0 and not visited[i][j]:
				size = BFS(i, j, graph, visited, N, M)
				sizes.append(size)
	
	return sizes

M, N, K = map(int, input().split())

graph = [[0] * M for _ in range(N)]

for _ in range(K):
	x1, y1, x2, y2 = map(int, input().split())

	for i in range(x1, x2):
		for j in range(y1, y2):
			graph[i][j] = 1

result = divide(N, M, graph)
result.sort()

print(len(result))
print(*result)
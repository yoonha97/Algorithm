from collections import deque

dr = [1, 1, 0, -1, -1, -1, 0, 1]
dc = [0, 1, 1, 1, 0, -1, -1, -1]

def BFS(startR, startC, graph, visited, w, h):
	q = deque([(startR, startC)])
	visited[startR][startC] = True

	while q:
		curR, curC = q.popleft()

		for dir in range(8):
			newR = curR + dr[dir]
			newC = curC + dc[dir]

			if newR >= 0 and newR < h and newC >= 0 and newC < w and not visited[newR][newC] and graph[newR][newC] == 1:
				q.append((newR, newC))
				visited[newR][newC] = True

def count_islands(w, h, graph):
	visited = [[False] * w for _ in range(h)]
	count = 0

	for i in range(h):
		for j in range(w):
			if graph[i][j] == 1 and not visited[i][j]:
				BFS(i, j, graph, visited, w, h)
				count += 1

	return count

while(True):
	w, h = map(int, input().split())
	if w == 0 and h == 0:
		break

	graph = [list(map(int, input().split())) for _ in range(h)]

	result = count_islands(w, h, graph)
	print(result)
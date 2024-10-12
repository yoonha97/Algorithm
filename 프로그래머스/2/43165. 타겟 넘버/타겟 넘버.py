def solution(numbers, target):
    answer = DFS(numbers, target, 0, 0)
    return answer

def DFS(numbers, target, depth, cur):
    if (depth == len(numbers)):
        if cur == target:
            return 1
        else:
            return 0
    else:
        plus_case = DFS(numbers, target, depth + 1, cur + numbers[depth])
        minus_case = DFS(numbers, target, depth + 1, cur - numbers[depth])
        return plus_case + minus_case
        
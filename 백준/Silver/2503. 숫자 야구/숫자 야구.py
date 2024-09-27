N = int(input())
hint = [list(map(int, input().split())) for _ in range(N)]
answer = 0

for a in range(1, 10):
    for b in range(1, 10):
        for c in range(1, 10):

            if a == b or b == c or c == a:
                continue

            cnt = 0

            for arr in hint:
                num = arr[0]
                S = arr[1]
                B = arr[2]

                num_str = str(num)
                a_str, b_str, c_str = str(a), str(b), str(c)

                S_cnt = 0
                B_cnt = 0

                if num_str[0] == a_str:
                    S_cnt += 1
                if num_str[1] == b_str:
                    S_cnt += 1
                if num_str[2] == c_str:
                    S_cnt += 1

                if a_str in num_str and num_str[0] != a_str:
                    B_cnt += 1
                if b_str in num_str and num_str[1] != b_str:
                    B_cnt += 1
                if c_str in num_str and num_str[2] != c_str:
                    B_cnt += 1

                if S == S_cnt and B == B_cnt:
                    cnt += 1

            if cnt == N:
                answer += 1

print(answer)
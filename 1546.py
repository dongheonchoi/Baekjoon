a = int(input())


b = list(map(int, input().split()))
sum_b = sum(b)

c = max(b)

d = (sum_b/c)*100/a

print(d)


a = input().split()

a = list(map(int, a))

a = [i*i for i in a]

b = sum(a)

print(b%10)




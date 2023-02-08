
t = int(input())
for i in range(t):
    a, b = map(str , input().split())

    a = int(a)

    c = len(b)

    e = ""

    for i in range(c):
        d = b[i:i+1]
        e+=d*a
        
    print(e)

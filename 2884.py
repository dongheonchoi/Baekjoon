a , b = map(int, input().split())


c = b-45

if c<0:
    a-=1
    c+=60
    if a == -1:
        a += 24


print("%d %d" %(a, c))

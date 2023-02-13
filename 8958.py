
num = int(input())

score = []


for i in range(num):
    
    a = input().split("X")

    b = len(a)

    c = 0

    for i in range(b):
        d = a[i]
        for i in range(len(d)):
            c += i+1
        
            

    score.append(c)

for i in range(len(score)):
	print(score[i])

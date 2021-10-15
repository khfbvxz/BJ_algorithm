# #두수 비교 
# a , b = input().split()
# a = int(a)
# b = int(b)
# if (a>b):
#     print(">")
# elif(a<b):
#     print("<")
# else:
#     print("==")

## 시험성적

# a = int(input())
# if(a>=90 and a<=100):
#     print("A")
# elif(a>=80):
#     print("B")
# elif(a>=70):
#     print("C")
# elif(a>=60):
#     print("D")
# else:
#     print("F")

## 윤년

# year = int(input())
# if ((year%4==0)and(year%100!=0)or(year%400==0)):
#     print(1)
# else:
#     print(0)

## 사분면
# a = int(input())
# b = int(input())

# if (a>0 and b>0 ):
#     print(1)
# elif(a<0 and b>0 ):
#     print(2)
# elif(a<0 and b<0):
#     print(3)
# else:
#     print(4)

## 알람시계

# H , M  = input().split()
# H = int(H)
# M = int(M)
# if M<45:
#     print(H-1,)
# print(H,M)

a = "Hello Python"
b = a[-4:-1]
c = a [-1:-4:-1]
print(c)

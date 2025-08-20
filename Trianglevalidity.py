A = int(input("Enter first angle: "))
B = int(input("Enter second angle: "))
C = int(input("Enter third angle: "))

if A + B + C == 180 and A > 0 and B > 0 and C > 0:
    print("The triangle is valid.")
else:
    print("The triangle is not valid.")
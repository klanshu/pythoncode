N = int(input("Enter a positive integer: "))
if N > 0:
    for i in range(N, 0,-1):
        print(i, end=' ')
else:
    print("Please enter a positive integer.")


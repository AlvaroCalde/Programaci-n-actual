n1=float(input("Introduzca un número: "))
n2=float(input("Introduzca un número: "))
if n1>n2:
    n1 , n2= n2, n1
    print(n1)
    print(n2)
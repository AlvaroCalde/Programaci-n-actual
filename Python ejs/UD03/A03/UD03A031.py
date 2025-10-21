n1=int(input("Introduzca un número: "))
n2=int(input("Introduzca un número: "))
n3=int(input("Introduzca un número: "))

if n1==n2 and n2==n3:
    print("Los tres son iguales")
elif n1!=n2 and n1!=n3 and n2!=n3:
    print("Los tres son distintos")
else:
    print("Dos números son iguales")
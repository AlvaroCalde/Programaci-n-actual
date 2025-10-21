n1=int(input("Introduzca un número: "))
n2=int(input("Introduzca otro número: "))
if n1%n2==0:
    print(f"División exacta. Cociente = {n1/n2}")
else:
    print(f"División no exacta. Cociente = {int(n1/n2)} Resto = {n1%n2}")
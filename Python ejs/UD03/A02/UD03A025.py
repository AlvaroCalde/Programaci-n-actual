import Math # type: ignore
n1=int(input("Introduzca un número: "))
n2=int(input("Introduzca otro número: "))
n3=int(input("Introduzca otro número: "))
if Math.abs(n3-n1)<Math.abs(n2-n3):
    print(f"{n3} está más cerca de  {n1}")
else:
    print(f"{n3} está más cerca de  {n2}")
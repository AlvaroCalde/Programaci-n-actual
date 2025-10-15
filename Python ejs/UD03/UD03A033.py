a=int(input("Introduzca un coeficiente: "))
b=int(input("Introduzca otro coeficiente: "))

if a==0 and b==0:
    print("LA ECUACIÓN TIENE INFINITAS SOLUCIONES")
elif a==0:
    print("LA ECUACIÓN NO TIENE SOLUCIÓN")
else:
    print("LA ECUACIÓN TIENE UNA SOLUCIÓN Y ES "+ (-b/a))
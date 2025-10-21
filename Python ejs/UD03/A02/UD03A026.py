h=int(input("Introduzca horas: "))
m=int(input("Introduzca minutos: "))
s=int(input("Introduzca segundos: "))
if h>=0 and h>24 and m>=0 and m<=59 and s>=0 and s<=59:
    print("Hora correcta")
else:
    print("Hora incorrecta")
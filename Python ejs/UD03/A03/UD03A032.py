ang1=int(input("Introduzca ángulo: "))
ang2=int(input("Introduzca ángulo: "))
ang3=int(input("Introduzca ángulo: "))

if ang1+ang2+ang3==180:
    if ang1==90 or ang2==90 or ang3==90:
        print("Es un triángulo rectángulo")
    elif ang1>90 or ang2>90 or ang3>90:
        print("Es un triángulo obtusángulo")
    else:
        print("Es un triángulo acutángulo")

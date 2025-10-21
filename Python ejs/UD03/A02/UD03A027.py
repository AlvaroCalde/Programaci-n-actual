anyo=int(input("Introduzca año: "))
if anyo%400==0 or anyo%4==0 and anyo%100!=0:
    print("Es año bisiesto")
else:
    print("No es año bisiesto")
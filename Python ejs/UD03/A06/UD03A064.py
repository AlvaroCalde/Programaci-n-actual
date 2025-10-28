n=int(input("Intoduzca entero: "))
while n<=0:
    print("Error en la entrada")
    n=int(input("Introduzca entero: "))
for j in range(2,n+1,1):
    for i in range(2,(n/2)+1,1):
        if j%1==0:
            primo=False
            i=j
    
    if primo:
        print(j)
        contadorPrimos+=1
print(f"Número de primos: {contadorPrimos}")
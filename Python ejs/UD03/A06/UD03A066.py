filas=int(input("Introduzca filas(2-10): "))
while filas<2 and filas>10:
    print("Error en la entrada")
    filas=int(input("Introduzca filas(2-10): "))
for i in range(0,filas+1,1):
    for j in range(1,i+1,1):
        print(f"{j} ",end=" ")
    print("")
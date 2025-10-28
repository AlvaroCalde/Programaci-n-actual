filas=int(input("Introduzca filas: "))
columnas=int(input("Introduzca columnas: "))
while filas<2 and filas>10 and columnas<2 and columnas>10:
    print("Error en la entrada")
    filas=int(input("Introduzca filas: "))
    columnas=int(input("Introduzca columnas: "))
for i in range(1,filas+1,1):
    for j in range(1,columnas+1,1):
        print("* ",end=" ")
    print("")
for i in range(1,5,1):
    peso=1
    acumulador=0
    n=int(input("Introduzca binario de 3 cifras"))
    while n!=0:
        digito%=10
        acumulador+=(digito*peso)
        peso*=2
        n/=10
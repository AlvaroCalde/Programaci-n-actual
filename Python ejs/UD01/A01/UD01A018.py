iva=21
precioBruto=1000
precioNeto=float(precioBruto/(1+iva/100))
print("Precio neto (sin IVA): " + str(precioNeto))
print("IVA (21%): "+ str(float(precioBruto-precioNeto)))
print("Precio total (con IVA): "+ str(precioBruto))
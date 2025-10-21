Proceso UD01A018
	Definir IVA,precioBruto Como Entero;
	definir precioNeto Como Real;
	IVA<-21;
	precioBruto<-1000;
	precioNeto<- precioBruto/(1+IVA/100);
	Escribir "Precio neto (sin IVA): ",precioNeto;
	Escribir "IVA (21%): ",precioBruto-precioNeto;
	Escribir "Precio total (con IVA): ",precioBruto;
	
FinProceso

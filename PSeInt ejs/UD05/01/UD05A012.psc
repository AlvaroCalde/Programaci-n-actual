Proceso UD05A012
	Definir vector,i,acumulador Como Entero;
	Dimension vector[5];
	acumulador<-0;
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Introduzca entero: " Sin Saltar;
		Leer vector[i];
		acumulador<-acumulador+vector[i];
	FinPara
	
	Escribir "Media: ", acumulador/i;
	
FinProceso

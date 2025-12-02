Proceso UD05A026
	Definir matriz,i,j,vector,acumulador Como Entero;
	Definir media Como Real;
	Dimension matriz[2,3];
	Dimension vector[3];
	
	Para i<-0 Hasta 1 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir "Introduzca entero: ";
			Leer matriz(i,j);
		FinPara
	FinPara
	
	Para i<-0 Hasta 1 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matriz(i,j)," ";
		FinPara
		Escribir "";
	FinPara
	
	Para i<-0 Hasta 1 Con Paso 1 Hacer
		acumulador<-0;
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			acumulador<-acumulador+matriz[i,j];
		FinPara
		media<-acumulador/j;
		vector[i]<-media;
	FinPara
	
	Para i<-0 Hasta 1 Con Paso 1 Hacer
		Escribir vector[i];
	FinPara
	
FinProceso

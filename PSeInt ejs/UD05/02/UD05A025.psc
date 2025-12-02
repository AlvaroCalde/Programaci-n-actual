Proceso UD05A025
	Definir matriz,i,j,vector Como Entero;
	Definir media Como Real;
	Definir acumulador,contador Como Entero;
	Dimension matriz[3,2];
	Dimension vector[2];
	
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
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		acumulador<-0;
		Para j<-0 Hasta 1 Con Paso 1 Hacer
			acumulador<-acumulador+matriz[i,j];
		FinPara
		media<-acumulador/2;
		vector[i]<-media;
	FinPara
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Escribir vector[i];
	FinPara
FinProceso
	


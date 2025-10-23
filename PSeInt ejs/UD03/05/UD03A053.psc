Proceso UD03A053
	definir n,i,j Como Entero;
	Definir acumulador Como Real;
	
	Escribir "Introduzca un entero(1-10): ";
	Leer n;
	
	Mientras n<1 o n>10 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca un entero(1-10): ";
		Leer n;
	FinMientras
			
	
	acumulador<-1;
	
	Escribir n,"!= " Sin Saltar;
	Para i<-n Hasta 2 Con Paso -1 Hacer
		acumulador<-acumulador*i;
		Escribir i,"*" Sin Saltar;
	FinPara
	Escribir "1* = ",acumulador;
	
FinProceso

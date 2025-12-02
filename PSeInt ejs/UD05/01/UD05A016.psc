Proceso UD05A016
	Definir nota,frecuencia,i Como Entero;
	Dimension frecuencia[11];
	
	Para i<-0 Hasta 10 Con Paso 1 Hacer
		frecuencia[i]<-0;
	FinPara
	
	Escribir "Introduzca nota (0-10): " Sin Saltar;
	Leer nota;
	
	Mientras nota>=0 y nota<=10 Hacer
		frecuencia[nota]<-frecuencia[nota]+1;
		Escribir "Introduzca nota: " Sin Saltar;
		Leer nota;
	FinMientras
	
	Para i<-0 Hasta 10 Con Paso 1 Hacer
		Escribir "La nota ",i," aparece ",frecuencia[i]," veces";
	FinPara
FinProceso

Proceso UD05A011
	Definir vector,i,contNeg Como Entero;
	Dimension vector[5];
	contNeg<-0;
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Introduzca entero: " Sin Saltar;
		Leer vector[i];
	FinPara
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir vector[i] ;
		Si vector[i]<0 Entonces
			contNeg<-contNeg+1;
		FinSi
	FinPara
	
	Escribir "Negativos: ",contNeg;
	
FinProceso

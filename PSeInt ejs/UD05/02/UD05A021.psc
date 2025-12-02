Proceso UD05A021
	Definir matriz,i,j Como Entero;
	Definir positivo Como Logico;
	Dimension matriz[3,2];
	positivo<-Verdadero;
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 1 Con Paso 1 Hacer
			Escribir "Introduzca entero: " Sin Saltar;
			Leer matriz[i,j];
		FinPara
	FinPara
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 1 Con Paso 1 Hacer
			Si matriz[i,j]<0 Entonces
				positivo<-falso;
				j<-2;
				i<-3;
			FinSi
		FinPara
	FinPara
	
	Si positivo Entonces
		Escribir "MATRIZ POSITIVA";
	SiNo
		Escribir "MATRIZ NO POSITIVA";
	FinSi
	
FinProceso

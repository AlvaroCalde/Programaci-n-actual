Proceso UD03A054
	Definir i Como Entero;
	Definir n,mayor Como Real;

	
	
	Escribir "Introduzca un entero: ";
	Leer n;
	Para i<-1 Hasta 9 Con Paso 1 Hacer
		Escribir "Introduzca otro entero: ";
		Leer mayor;
		Si n>mayor Entonces
			mayor<-n;
		sino
			n<-mayor;
		FinSi
	FinPara
	Escribir mayor;
	
FinProceso

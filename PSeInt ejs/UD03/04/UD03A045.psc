Proceso UD03A045
	Definir n,contadorTotal,contadorPositivos,contadorNegativos,contadorNulos Como Entero;
	Definir acumulador Como Real;
	contadorPositivos<-0;
	contadorNegativos<-0;
	contadorNulos<-0;
	contadorTotal<-0;
	acumulador<-0;
	
	
	
	Repetir
		Escribir "Introduzca entero: ";
		Leer n;
		contadorTotal<-contadorTotal+1;
		acumulador<-acumulador+n;
		Si n>0 Entonces
			contadorPositivos<-contadorPositivos+1;
		SiNo
			Si n<0 Entonces
				contadorNegativos<-contadorNegativos+1;
			SiNo
				contadorNulos<-contadorNulos+1;
			FinSi
		FinSi
	Hasta Que acumulador>100
	
	Escribir "Números positivos: ",contadorPositivos;
	Escribir "Números negativos: ",contadorNegativos;
	Escribir "Números nulos: ",contadorNulos;
	Escribir "Suma: ",acumulador;
	Escribir "Media: ",acumulador/contador;
	
	
FinProceso

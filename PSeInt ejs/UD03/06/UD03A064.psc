Proceso UD03A064
	Definir num,i,j,div,contadorPrimos Como Entero;
	Definir  primo Como Logico;
	primo<-Verdadero;
	contadorPrimos<-0;
	Escribir "Introduzca un n?mero entero positivo: " Sin Saltar;
	Leer num;
	
	Mientras num<=0 Hacer
		Escribir "Entrada incorrecta";
		Escribir "Introduzca un n?mero entero positivo: " Sin Saltar;
		Leer num;
	FinMientras
	
	Para j<-2 Hasta num Con Paso 1 Hacer
		Para i<-2 Hasta num/2 Con Paso 1 Hacer
			Si j%i==0 Entonces
				primo<-Falso;
				i<-j;
			FinSi
		FinPara
		
		Si primo Entonces
			Escribir j;
			contadorPrimos<-contadorPrimos+1;
		FinSi
	FinPara
	Escribir "Número de primos: ",contadorPrimos;
	
FinProceso

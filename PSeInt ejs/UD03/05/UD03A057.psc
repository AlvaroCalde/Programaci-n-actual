Proceso UD03A057
	Definir num,i,acumulador Como Entero;
	Escribir "Introduce un número entero positivo: " Sin Saltar;
	Leer num;
	acumulador<-0;

	mientras n<=0 hacer
		Escribir "Error en la entrada";
		Escribir "Introduce un número entero positivo: " Sin Saltar;
		Leer num;
	finMientras

	Para i<-1 Hasta num/2 Con Paso 1 Hacer
		Si num%i==0 Entonces
			acumulador<-acumulador+i;
		FinSi
	FinPara
	
	Si acumulador==num Entonces
		Escribir n," es un número perfecto";
	SiNo
		Escribir n," no es un número perfecto";
	FinSi
	
FinProceso

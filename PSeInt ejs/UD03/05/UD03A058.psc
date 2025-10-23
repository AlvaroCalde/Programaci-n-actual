Proceso UD03A058
	Definir num,i,div Como Entero;
	Definir  primo Como Logico;
	primo<-Verdadero;
	Escribir "Introduzca un número entero positivo: " Sin Saltar;
	Leer num;
	
	Mientras num<=1 Hacer
		Escribir "Entrada incorrecta";
		Escribir "Introduzca un número entero positivo: " Sin Saltar;
		Leer num;
	FinMientras
	
	Para i<-2 Hasta num/2 Con Paso 1 Hacer
		Si num%i==0 Entonces
			primo<-Falso;
		FinSi
	FinPara
	
	Si primo Entonces
		Escribir "Es primo";
	SiNo
		Escribir "No es primo";
	FinSi
	
FinProceso

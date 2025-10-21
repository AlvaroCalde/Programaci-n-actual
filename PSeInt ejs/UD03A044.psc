Proceso UD03A044
	Definir n,contador,acumulador Como Entero;
	contador<-0;
	acumulador<-0;
	
	Escribir "Introduzca entero: ";
	Leer n;
	
	Mientras n>=1 y n<=10 Hacer
		contador<-contador+1;
		acumulador<-acumulador+n;
		Escribir "Introduzca entero: ";
		Leer n;
	FinMientras
	
	Si contador>0 Entonces
		Escribir "Media: ", acumulador/contador;
	FinSi
	
	
FinProceso

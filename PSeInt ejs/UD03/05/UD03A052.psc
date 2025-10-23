Proceso UD03A052
	definir n,i Como Entero;
	Escribir "Introduzca un entero(1-10): ";
	Leer n;
	
	si n<1 o n>10 Entonces
		Repetir
			Escribir "Error en la entrada";
			Escribir "Introduzca un entero(1-10): ";
			Leer n;
		Hasta Que n>=1 y n<=10
	FinSi
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir n," * ",i," = ",i*n;
	FinPara
	
FinProceso

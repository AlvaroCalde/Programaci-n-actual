Proceso UD03A051
	definir n,i Como Entero;
	Escribir "Introduzca un entero(1-5): ";
	Leer n;
	
	si n<1 o n>5 Entonces
		Repetir
			Escribir "Error en la entrada";
			Escribir "Introduzca un entero(1-5): ";
			Leer n;
		Hasta Que n>=1 y n<=5
	FinSi
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir "HOLA MUNDO";
	FinPara
	
FinProceso

Proceso UD03A056
	definir n,i Como Entero;
	
	Escribir "Introduzca entero: ";
	Leer n;
	
	Mientras n<=0 Hacer
		Escribir "Error en la entrada";
		Escribir "Introduzca entero: ";
		Leer n;
	FinMientras
	
	Escribir "Números impares entre 1 y ",n;
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si i%2<>0 Entonces
			Escribir i," ";
		FinSi
	FinPara
	
FinProceso

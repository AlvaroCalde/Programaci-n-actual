Proceso UD03A033
	Definir a,b Como Entero;
	Escribir "Introduzca un coeficiente: ";
	Leer a;
	Escribir "Introduzca otro coeficiente: ";
	Leer b;
	
	Si a=0 Y b=0 Entonces
		Escribir "LA ECUACIÓN TIENE INFINITAS SOLUCIONES";
	SiNo
		Si a=0 Entonces
			Escribir "LA ECUACIÓN NO TIENE SOLUCIÓN";
		SiNo
			Escribir "LA ECUACIÓN TIENE UNA SOLUCIÓN Y ES ",-b/a;
		FinSi
	FinSi
	
FinProceso

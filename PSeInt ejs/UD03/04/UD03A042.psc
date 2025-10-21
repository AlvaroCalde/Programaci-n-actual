SubProceso horaCorrecta <- esHoraCorrecta(h,min,seg)
	definir horaCorrecta Como Logico;
	horaCorrecta<-h>=0 y h<=23 y min>=0 y min<=59 y seg>=0 y seg<=59;
FinSubProceso

Proceso UD03A042
	Definir h,min,seg Como Entero;
	
	Repetir
		Escribir "Introduzca horas: ";
		Leer h;
		Escribir "Introduzca minutos: ";
		Leer min;
		Escribir "Introduzca segundos: ";
		Leer seg;
	Hasta Que esHoraCorrecta(h,min,seg)
	
FinProceso

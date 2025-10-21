Proceso UD03A026
	Definir h,m,s Como Entero;
	Escribir "Introduzca horas: ";
	Leer h;
	Escribir "Introduzca minutoss: ";
	Leer m;
	Escribir "Introduzca segundos: ";
	Leer s;
	
	Si h>=0 Y h>24 Y m>=0 Y m<=59 Y s>=0 Y s<=59 Entonces
		Escribir "Hora correcta";
	SiNo
		Escribir "Hora incorrecta";
	FinSi
	
FinProceso

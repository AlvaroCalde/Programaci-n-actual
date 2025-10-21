Proceso UD01A028
	definir seg Como Entero;
	Definir horas Como Real;
	
	Escribir "Introduzca segundos: ";
	Leer seg;
	
	horas<-trunc(seg/3600);
	
	Escribir "Horas: ", horas;
	Escribir "Minutos: ", trunc((seg-horas*3600)/60);
	Escribir "Segundos: ", seg%60;
	
FinProceso

Proceso UD03A027
	Definir anyo Como Entero;
	Escribir "Introduzca un año: ";
	Leer anyo;
	
	Si anyo%400=0 O anyo%4=0 Y anyo%100<>0 Entonces
		Escribir "Es año bisiesto";
	SiNo
		Escribir "No es año bisiesto";
	FinSi
	
FinProceso

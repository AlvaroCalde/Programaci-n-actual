Proceso UD03A025
	Definir n1,n2,n3 Como Entero;
	Escribir "Introduzca un número: ";
	Leer n1;
	Escribir "Introduzca otro número: ";
	Leer n2;
	Escribir "Introduzca otro número: ";
	Leer n3;
	
	Si abs(n3-n1)<abs(n2-n3) Entonces
		Escribir n3," está más cerca de ", n1;
	SiNo
		Escribir n3," está más cerca de ", n2;
	FinSi
	
FinProceso

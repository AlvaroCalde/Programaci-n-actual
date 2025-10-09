Proceso UD03A023
	definir n1,n2 Como Entero;
	Escribir "Introduzca un número: ";
	Leer n1;
	Escribir "Introduzca otro número: ";
	Leer n2;
	
	Si n1%n2=0 Entonces
		Escribir "Cociente: ", trunc(n1/n2);
	SiNo
		Escribir "Cociente: ", trunc(n1/n2);
		Escribir "Resto: ", n1%n2;
	FinSi
	
FinProceso

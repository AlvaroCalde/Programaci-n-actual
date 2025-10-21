Proceso UD03A031
	Definir n1,n2,n3 Como Entero;
	Escribir "Introduzca un número: ";
	Leer n1;
	Escribir "Introduzca otro número: ";
	Leer n2;
	Escribir "Introduzca otro número: ";
	Leer n3;
	
	Si n1=n2 Y n2=n3 Entonces
		Escribir "Los tres números son iguales";
	SiNo
		Si n1<>n2 Y n1<>n3 Y n2<>n3 Entonces
			Escribir "Los tres números son distintos";
		SiNo
			Si n1=n2 O n2=n3 O n1=n3 Entonces
				Escribir "Dos números son iguales";
			FinSi
		FinSi
	FinSi
	
FinProceso

Proceso UD03A015
	Definir n1,n2,aux Como Entero;
	Escribir "Introduzca un número: ";
	Leer n1;
	Escribir "Introduzca otro número: ";
	Leer n2;
	
	si n1>n2 Entonces
		aux<-n1;
		n1<-n2;
		n2<-aux;
		Escribir n1,"     ",n2;
	FinSi
	
	
FinProceso

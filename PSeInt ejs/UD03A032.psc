Proceso UD03A032
	Definir ang1,ang2,ang3 Como Entero;
	Escribir "Introduzca un ángulo: ";
	Leer ang1;
	Escribir "Introduzca un ángulo: ";
	Leer ang2;
	Escribir "Introduzca un ángulo: ";
	Leer ang3;
	
	Si ang1+ang2+ang3=180 Entonces
		Si ang1=90 O ang2=90 O ang3=90 Entonces
			Escribir "Es un triángulo rectángulo";
		SiNo
			Si ang1>90 O ang2>90 O ang3>90 Entonces
				Escribir "Es un triángulo obtusángulo";
			SiNo
				Si ang1<90 O ang2<90 O ang3<90 Entonces
					Escribir "Es un triángulo acutángulo";
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso

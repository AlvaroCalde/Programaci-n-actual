Proceso UD03A055
	definir n,i Como Entero;
	Definir hay5 Como Logico;
	hay5<-falso;
	
	Para i<-1 Hasta 9 Con Paso 1 Hacer
		Escribir "Introduzca entero: ";
		Leer n;
		Si n=5 Entonces
			hay5<-Verdadero;
		FinSi
		
	FinPara
	
	Si hay5 Entonces
		Escribir "Has introducido el 5";
	SiNo
		Escribir "No has introducido el 5";
	FinSi
FinProceso

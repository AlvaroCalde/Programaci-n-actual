Proceso UD03A034
	Definir mes Como Entero;
	Escribir "Introduzca un mes(1-12): ";
	Leer mes;
	
	Si mes>=1 Y mes<=12 Entonces
		Segun mes Hacer
			1,3,5,7,9,11:
				Escribir "Tiene 31 días";
			2:
				Escribir "Tiene 28 días";
			4,6,8,10,12:
				Escribir "Tiene 30 días";			
		FinSegun
		
	FinSi
	
	
FinProceso

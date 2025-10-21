Proceso UD03A037
	Definir nota Como Real;
	Escribir "Introduzca nota: ";
	
	Si nota>=0 Y nota<=4 Entonces
		Escribir "Suspenso";
	SiNo
		Si nota>=5 Y nota <=6 Entonces
			Escribir "Aprobado";
		SiNo
			Si nota>=7 Y nota <=8 Entonces
				Escribir "Notable";
			SiNo
				Escribir "Sobresaliente";
			FinSi
		FinSi
	FinSi
	
FinProceso

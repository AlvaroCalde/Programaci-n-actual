Proceso UD05A015
	Definir i,vector Como Entero;
	Definir ordenado Como Logico;
	Dimension vector[5];
	
	ordenado<-verdadero;
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Introduzca entero: " Sin Saltar;
		Leer vector[i];
	FinPara
	
	
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		si vector[i]<vector[i+1] Entonces
			ordenado<-falso;			
			i<-5;
		FinSi
	FinPara
	
	Si ordenado Entonces
		Escribir "Vector ordenado";
	SiNo
		Escribir "Vector no ordenado";
	FinSi
	
FinProceso

Proceso UD05A013
	Definir vector,i,posicion Como Entero;
	Dimension vector[5];
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Introduzca entero: " Sin Saltar;
		Leer vector[i];		
	FinPara
	
	posicion<-0;
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		si vector[i]<vector[posicion] Entonces
			posicion<-i+1;
		FinSi
	FinPara
	
	Escribir "Número menor: ",vector[posicion]," Posición: ",posicion;
	
FinProceso

Proceso UD05A014
	Definir i,posicion Como Entero;
	Definir encont Como Logico;
	Definir  vector,nombre Como Caracter;
	Dimension vector[5];
	
	encont<-falso;
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Introduzca nombre de usuario: " Sin Saltar;
		Leer vector[i];		
	FinPara
	
	posicion<-0;
	Escribir "Introduzca nombre a buscar: ";
	Leer nombre;
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		si nombre=vector[i] Entonces
			posicion<-i+1;
			encont<-verdadero;
		FinSi
	FinPara
	
	si encont Entonces
		Escribir "Nombre encontrado en la posicion: ",posicion;
	SiNo
		Escribir "Nombre no encontrado";
	FinSi
	
FinProceso

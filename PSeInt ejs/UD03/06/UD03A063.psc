Proceso UD03A063
	Definir  j,acumulador,n,digito,peso Como Entero;
	
	
	
	Para j<-1 Hasta 4 Con Paso 1 Hacer
		peso<-1;
		acumulador<-0;
		Escribir "Introduzca binario de 3 cifras: ";
		Leer n;
			Mientras n<>0 Hacer
				digito<-n%10;
				acumulador<-acumulador+(digito*peso);
				peso<-peso*2;
				n<-trunc(n/10);
			FinMientras
		Escribir acumulador;
	FinPara
	
FinProceso

Proceso UD03A047
	Definir a, b, aux,r Como Entero;
	Definir mcdab, mcdbr Como Real;
	Escribir "Introduzca el primer número. " Sin Saltar;
	Leer a;
	Escribir "Introduzca el segundo número. " Sin Saltar;
	Leer b;
	
	Mientras a>0 y b>0 Hacer
		mcdab<-(a*100)/b;
		Si a<b Entonces
			aux<-a;
			a<-b;
			b<-aux;
			mcdab<-a*100/b;
		SiNo
			r<-a%b;
			Si r==0 Entonces
				mcdab<-b;
			SiNo
				mcdbr<-(b*100)/r;
				mcdab<-mcdbr;
			FinSi
		FinSi
		Escribir mcdab;
	FinMientras
	
FinProceso

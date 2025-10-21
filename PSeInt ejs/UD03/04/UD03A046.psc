SubProceso hyperpar <- esHyperpar(n)
	Definir hyperpar Como Logico;
	Definir digito Como Entero;
	hyperpar<-Verdadero;
	si n%2<>0 Entonces
		hyperpar<-falso;
	FinSi
	Mientras n>0 Hacer
		digito<-n%10;
		Si digito%2<>0 Entonces
			hyperpar<-falso;
		FinSi
		n<-n/10;
	FinMientras
FinSubProceso
Proceso UD03A046
	Definir n Como Entero;
	Si esHyperpar(n) Entonces
		Escribir "Es hyperpar";
	SiNo
		Escribir "No es hyperpar";
	FinSi
FinProceso

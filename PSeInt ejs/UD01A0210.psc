Proceso UD01A0210
	Definir n,digito1,digito2 Como Entero;
	Escribir "Introduzca número de 2 dígitos" Sin Saltar;
	Leer n;
	digito1<-trunc(n/10);
	digito2<-n%10;
	n<-digito2*10+digito1;
	Escribir n;
FinProceso

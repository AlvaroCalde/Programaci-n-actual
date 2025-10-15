SubProceso diasMes <- getDiasMes(mes,anyo)
	Definir diasMes Como Entero;
	Segun mes Hacer
		1,3,5,7,8,10,12:
			diasMes<-31;
		2:
			Si esBisiesto(anyo) Entonces
				diasMes<-29;
			SiNo
				diasMes<-28;
			FinSi
		4,6,9,11:
			diasMes<-30;	
		De Otro Modo:
			diasMes<-0;
	FinSegun
FinSubProceso

SubProceso bisiesto <- esBisiesto(anyo)
	Definir bisiesto Como Logico;
	bisiesto<-anyo%400=0 o (anyo%4=0 y anyo%100<>0);
FinSubProceso

SubProceso fecha <- esFechaCorrecta(dia,mes,anyo)
	Definir fecha Como Logico;
	fecha<-anyo>0 y mes >=1 y mes <=12 y dia>=1 y dia<=getDiasMes(mes,anyo);
FinSubProceso


Proceso UD03A035
	Definir dia,mes,anyo Como Entero;
	definir fechaCorrecta Como Logico;
	Definir salida Como Caracter;
	
	Escribir "Introduzca dia: ";
	Leer dia;
	Escribir "Introduzca mes: ";
	Leer mes;
	Escribir "Introduzca año: ";
	Leer anyo;
	
	si esFechaCorrecta(dia,mes,anyo) Entonces
		Escribir "Fecha correcta";
	SiNo
		Escribir "Fecha incorrecta";
	FinSi
	

	
FinProceso

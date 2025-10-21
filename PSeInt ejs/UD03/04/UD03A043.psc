SubProceso usuarioCorrecto <- esUsuarioCorrecto(usuario,contrasena)
	Definir usuarioCorrecto Como Logico;
	usuarioCorrecto<-usuario="admin" y contrasena="paso";
FinSubProceso

Proceso UD03A043
	Definir usuario,contrasena Como Caracter;
	Escribir "Introduzca usuario: ";
	Leer usuario;
	Escribir "Introduzca contraseña: ";
	Leer contrasena;
	
	Mientras no esUsuarioCorrecto(usuario,contrasena) Hacer
		Escribir "Usuario o contraseña incorrecto";
		Escribir "Introduzca usuario: ";
		Leer usuario;
		Escribir "Introduzca contraseña: ";
		Leer contrasena;
	FinMientras
	
	Escribir "Bienvenido ",usuario;	
	
FinProceso

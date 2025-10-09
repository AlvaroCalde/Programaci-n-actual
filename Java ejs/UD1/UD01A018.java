public class UD01A018{
	public static void main(String[] args){
		
		float IVA=21f;
		int precioBruto=1000;
		float precioNeto;
		precioNeto=precioBruto/(1+IVA/100);
		System.out.printf("Precio neto (sin IVA): "+ precioNeto);
		System.out.printf("IVA (21%): "+(float) (precioBruto-precioNeto));
		System.out.printf("Precio total (con IVA): "+precioBruto);
	}
}
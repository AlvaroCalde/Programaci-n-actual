
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo
{
    private float ancho;
    private float alto;

    public Rectangulo(float ancho,float alto)
    {
        this.ancho=ancho;
        this.alto=alto;
    }
    
    public float getAncho(){
        return ancho;
    }
    
    public float getAlto(){
        return alto;
    }
    
    public void setAncho(float ancho){
        this.ancho=ancho;
    }
    
    public void selAlto(float alto){
        this.alto=alto;
    }
    
    public float calcularArea(){
        return ancho*alto;
    }
    
    public float calcularPerimetro(){
        return 2*ancho+2*alto;
    }


}

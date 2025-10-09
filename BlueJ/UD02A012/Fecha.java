
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    private int anyo;
    private int mes;
    private int dia;

    public Fecha(int anyo,int mes,int dia)
    {
        this.anyo=anyo;
        this.mes=mes;
        this.dia=dia;
    }
    
    public int getAnyo(){
        return anyo;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setAnyo(int anyo){
        this.anyo=anyo;
    }
    
    public void setMes(int mes){
        this.mes=mes;
    }
    
    public void setDia(int dia){
        this.dia=dia;
    }
    
    public String toString(){
        return anyo + "-" + mes + "-" + dia;
    }

}

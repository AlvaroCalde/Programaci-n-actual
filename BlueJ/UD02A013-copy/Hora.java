
/**
 * Write a description of class Hora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hora
{
    private int horas;
    private int minutos;
    private int segundos;

    public Hora()
    {

    }
    
    public Hora(int horas)
    {
        this.horas=horas;
    }
    
    public Hora(int horas,int minutos,int segundos)
    {
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }
    
    public int getHoras(){
        return horas;
    }
    
    public int getMinutos(){
        return minutos;
    }
    
    public int getSegundos(){
        return segundos;
    }
    
    public void setHoras(int horas){
        this.horas=horas;
    }
    
    public void setMinutos(int minutos){
        this.minutos=minutos;
    }
    
    public void setSegundos(int segundos){
        this.segundos=segundos;
    }
    
    public int convertirASegundos(){
        return horas*3600 + minutos*60 + segundos;
    }
    
    public Hora sumarSegundos(int segundos){     
        Hora horaNueva;
        int totalSegundos;
        totalSegundos=convertirASegundos()+segundos;
        int horasNu,minutosNu,segundosNu;
           
        horasNu=totalSegundos/3600;
        totalSegundos%=3600;
        minutosNu=totalSegundos/60;
        segundosNu=totalSegundos%60;
           
        horaNueva=new Hora(horasNu,minutosNu,segundosNu);
        return horaNueva;
    }
    
    public int compareTo(Hora otraHora){ 
        return otraHora.convertirASegundos()-this.convertirASegundos();
    }
    
    public String toString(){
        return horas + ":" + minutos + ":" + segundos;
    }
}

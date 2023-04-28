
package Lista_Enlazada_Simpple;


public class Nodo 
{
    public int dato;
    public Nodo siguiente; //PUNTERO AL ENLACE
    
    //CONSTRUCTOR PARA INCERTAR AL FINAL
    public Nodo(int d)
    {
        this.dato = d;
    }
    //CONSTRUCTOR PARA INCERTAR AL INICIO
    public Nodo(int d, Nodo n)
    {
        dato = d;
        siguiente= n;
    }
    
    
}

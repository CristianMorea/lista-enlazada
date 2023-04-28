
package Lista_Enlazada_Simpple;


public class Lista
{
    protected Nodo inicio, fin; //PUNTEROS PARA SABER DONDE ESTA EL INICIO Y EL FINAL
    public Lista()
    {
        inicio = null;
        fin = null;
    }
    
    //METODO PARA AGREGAR UN NODO AL INICIO DE LA LISTA
    public void agregarAlInicio (int elemento)
    {
        //CREANDO AL NODO
        inicio = new Nodo(elemento, inicio);
        if(fin == null)
        {
            fin = inicio;
        }
    }
    
    //METODO PARA MOSTRAR LOS DATOS
    
    public void mostrarLista()
    {
        Nodo recorrer =inicio;
        while(recorrer != null)
        {
            System.out.println("["+recorrer.dato+"] ---->");
            recorrer = recorrer.siguiente;
        }
            
    }
    
    
    
}

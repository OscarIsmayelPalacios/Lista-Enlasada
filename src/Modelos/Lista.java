
package Modelos;


public class Lista {
    Nodo primero;
    
    public void InsertarNodo(int dato)
    {
        Nodo nodoNuevo = new Nodo(dato);
        if(primero == null)
        {
            primero = nodoNuevo;
        }
        else
        {
            nodoNuevo.siguiente = primero;
            nodoNuevo = primero;
        }
    }
    
    public void ListarNodos()
    {
        Nodo auxiliar;
        auxiliar = primero;
        while(auxiliar!=null)
        {
            System.out.println(auxiliar.getDato());
            auxiliar = auxiliar.siguiente;
        }
        
    }
    
}

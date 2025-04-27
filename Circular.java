public class Circular 
{
    class Nodo 
    {
        int dato;
        Nodo siguiente;

        Nodo(int dato) 
        {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo ultimo = null;

    public static void main(String[] args) 
    {
        Circular lista = new Circular();
        lista.AgregarAlFinal(9);
        lista.AgregarAlFinal(7);
        lista.AgregarAlFinal(5);
        lista.AgregarAlFinal(3);

        System.out.println("Datos de la lista");
        lista.MostrarLista();

        lista.AgregarAlInicio(8);
        System.out.println("Insertado numero al inicio:");
        lista.MostrarLista();

        lista.EliminarPrimero();
        System.out.println("Eliminado el primer numero:");
        lista.MostrarLista();

        lista.EliminarUltimo();
        System.out.println("Eliminado el ultimo numero:");
        lista.MostrarLista();
    }
    public void AgregarAlFinal(int dato) 
    {
        Nodo nuevo = new Nodo(dato);
        if (ultimo == null) 
        {
            ultimo = nuevo;
            ultimo.siguiente = ultimo; 
        } 
        else 
        {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo; 
        }
    }
    public void MostrarLista() 
    {
        if (ultimo == null) 
        {
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo temp = ultimo.siguiente;
        do 
        {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        } while (temp != ultimo.siguiente);
        System.out.println("\n");
    }
    public void AgregarAlInicio(int dato) 
    {
        Nodo nuevo = new Nodo(dato);
        if (ultimo == null) 
        {
            ultimo = nuevo;
            ultimo.siguiente = ultimo; 
        } 
        else 
        {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
    }
    public void EliminarPrimero() 
    {
        if (ultimo == null) 
        {
            System.out.println("La lista esta vacia");
        } 
        else if (ultimo == ultimo.siguiente) 
        {
            ultimo = null; 
        } 
        else 
        {
            ultimo.siguiente = ultimo.siguiente.siguiente; 
        }
    }
    public void EliminarUltimo() 
    {
        if (ultimo == null) 
        {
            System.out.println("La lista esta vacia");
        } 
        else if (ultimo == ultimo.siguiente) 
        {
            ultimo = null; 
        } 
        else 
        {
            Nodo aux = ultimo.siguiente;
            while (aux.siguiente != ultimo) 
            {
                aux = aux.siguiente; 
            }
            aux.siguiente = ultimo.siguiente; 
            ultimo = aux; 
        }
    }
}

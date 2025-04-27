import java.util.LinkedList;
public class CircularLinkedList 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(9);
        lista.add(7);
        lista.add(5);
        lista.add(3);

        System.out.println("Datos de la lista:");
        for (int num : lista) 
        {
            System.out.print(num + " -> ");
        }

        System.out.println("\nRecorrido de la lista circular:");
        int i = 0;
        while (i < 8) 
        { 
            int elemento = lista.get(i % lista.size());
            System.out.print(elemento + " -> ");
            i++;
        }

        lista.addFirst(8); 
        System.out.println("\nInsertado numero al inicio: " + lista);

        lista.removeFirst(); 
        System.out.println("Eliminado el primer numero: " + lista);

        lista.removeLast(); 
        System.out.println("Eliminado el ultimo numero: " + lista);

    }
}

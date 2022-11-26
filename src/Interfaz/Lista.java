package Interfaz;

public class Lista
{
    private Numero numeros;
    int cantNodos;

    public Lista() {
        numeros = null;
        cantNodos = 0;
    }
    

    
    
    public void agregar(int numero)
    {
        //Creamos e inicializamos un nodo de la clase
        Numero nuevo = new Numero(numero);
        nuevo.setNumero(numero);
        
        if(numeros == null)
        {
            //Se agrega el nodo a la lista
            numeros = nuevo;
        }
        else
        {
            //Se genera un apuntador auxiliar para recorrer la lista
            Numero aux = numeros;
            
            while(aux.getSiguiente() != null)
            {
               aux = aux.getSiguiente();
            }
            //La referencia del ultimo nodo
            aux.setSiguiente(nuevo);    
        }
        cantNodos ++;
    }    
        

    public int[] imprimirLista2()
    {
        //Se crea un nodo auxiliar
        Numero aux = numeros;
        //Declarar arreglo temporal donde se guarda la info de la lista
        int[] arreglo = new int[cantNodos];
        //Variable que servira de indice de posicion del arreglo
        int j=0;
        //Contador de elementos
        int i = 1;
        if(numeros == null)
        {
            System.out.println("Lista vacia.");
        }
        else
        {
            System.out.println("Elementos en la lista (imprimir2):");
            //Se recorre la lista mientras no este vacia
            while(aux != null)
            {
                System.out.println("Posicion "+i+":"+aux.getNumero());
                //Copiando el valor del nodo a una posicion del arreglo
                arreglo[j] = aux.getNumero();
                aux = aux.getSiguiente();
                i++;
                j++;
            }
        }
           
        return arreglo;//Devuelve el arreglo con los valores
        
    }



    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }
    
    
    
}    
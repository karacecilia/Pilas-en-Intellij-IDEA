package com.company;



public class Pilas {
    static int [] datos;
    private nodo top;
    private int size;

    //Método para mostrar el menú.
    public void Menu() {
        System.out.println("\nElija una opción: \n\n" +
                "1.-Insertar\n" +
                "2.-Mostrar\n" +
                "3.-Buscar\n" +
                "4.-Eliminar\n" +
                "5.-Contar\n" +
                "6.-Max\n"+
                "7.-Terminar");
    }public void dato (){
        nodo temp= top;
        int i=0;
        while (temp!=null){
            datos[i]=temp.getValor();
            temp=temp.getProx();
            i+
        }
        System.out.println(datos[i]);
    }



    public Pilas (){
        top = null;
        size=0;
    }
    public boolean vacia () {
        return (top == null);
    }
    public void push(int valor){//INSERTAR
        nodo nevoNodo;
        if (vacia ())
            top = new nodo (valor);
        else{
            nodo nuevoNodo = new nodo (valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
        size++;
    }

        public int Tamaño(){
        return size;
        }

    public int Cima (int valor){//buscar por valor
        nodo temp = top;
        int cont=0;
        while(temp.getValor()!=valor){
         temp=temp.getProx();
         cont++;
        }
        return (cont+1);
    }


    public void peek() {//mostrar
        nodo temp =top;
        if( temp!=null){
            System.out.println("\nLos datos de la lista son: ");
            while (temp != null) {
                System.out.println(temp.getValor() + " ");
                temp = temp.getProx();
            }
        }
        else
            System.out.println("PILA VACÍA");
    }
    public void pop() {//extraer
        if (!vacia()) {
            System.out.println("Dato extraido: " + top.getValor());
            top = top.getProx();
        } else {
            System.out.println("La pila esta vacía");
        }
        size--;
    }
}


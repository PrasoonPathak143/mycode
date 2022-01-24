import java.util.Scanner;

class Node{
    Object data;
    Node next;
    Node(){}
    Node(Object element){
        this.data = element;
    }
    Node(Object element,Node add){
        this.data = element;
        this.next = add;
    }
}
class linkedList{
    Node firstNode;
    int size;
    linkedList(){
        firstNode = null;
        size = 0;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public int size(){
        return size;
    }
    void checkIndex(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException ("index = " + index + " size = " + size);
    }
    public Object get(int index){
        checkIndex(index);
        Node presentNode = firstNode;
        for (int i = 0; i < index; i++){
            presentNode = presentNode.next;
        }
        return presentNode.data;
    }
    public int indexOf(Object element){
        Node presentNode = firstNode;
        int index=0;
        while(presentNode!=null && !presentNode.data.equals(element)){
            presentNode = presentNode.next;
            index++;
        }
        if(presentNode==null){
            return -1;
        }
        else{
            return index;
        }
    }
    public Object remove(int index){
        checkIndex(index);
        Object p;  //p = removed element
        if(index==0){
            p = firstNode.data;
            firstNode = firstNode.next;
        }
        else{
            Node tempNode = firstNode;
            for(int i=0; i<=index-2; i++){
                tempNode = tempNode.next;
            }
            p = tempNode.next.data;
            tempNode.next = tempNode.next.next;
            size--;
        }
        return p;
    }
    public void add(int index, Object element){
        if(index<0 || index>size) {
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            firstNode = new Node(element, firstNode);
        }
        else{
            Node tempNode = firstNode;
            for(int i=0; i<=index-2; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = new Node(element,tempNode.next);
        }
        size++;
    }
}
public class Application2 {
    public static void main(String[] args) {
        linkedList object = new linkedList();
        System.out.println("List is empty: " + object.isEmpty());
        object.add(0,"Apple");
        object.add(1,2);
        object.add(2,"Cat");
        object.add(3,3);
        object.add(4,4);
        object.add(5,"Ice");
        System.out.println("\nPrinting the elements:");
        for(int i=0;i<object.size();i++)
        {
            System.out.print(object.get(i)+" ");
        }
        System.out.println("\n\nList is empty: " + object.isEmpty());
        object.checkIndex(5);
        System.out.println("\nSize of list: " + object.size);
        Scanner num = new Scanner(System.in);
        System.out.println(object.indexOf(3));

        System.out.println("\nRemoved: " + object.remove(2));
        System.out.println("\nPrinting the elements:");
        for(int i=0;i<object.size();i++)
        {
            System.out.print(object.get(i)+" ");
        }
        System.out.println("\nSize is: " + object.size);
        object.add(1,3);
        System.out.println("\nPrinting the elements:");
        for(int i=0;i<object.size();i++)
        {
            System.out.print(object.get(i)+" ");
        }
        System.out.println("\nSize is: " + object.size);
    }
}

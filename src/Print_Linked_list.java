import java.util.Scanner;
class Node4{
    Node4 next;
    int data;
    Node4(){}
    Node4(int element){
        this.data = element;
    }
    Node4(int element,Node4 add){
        this.data = element;
        this.next = add;
    }
}
class linkedList2{
    Node firstNode;
    int size;
    linkedList2(){
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

public class Print_Linked_list {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        linkedList2 lk = new linkedList2();
        for(int i = 0; i<n; i++){
            lk.add(lk.size,num.nextInt());
        }
        for(int i = 0; i<n; i++){
            int a = (int) lk.get(i);
            System.out.println(a);
        }
    }
}

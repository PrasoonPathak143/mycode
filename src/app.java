import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

class Node3{
    Object data;
    Node3 next;

    public Node3(){};
    public Node3(Object data){
        this.data = data;
    }
    public Node3(Object data, Node3 node){
        this.data = data;
        this.next = node;
    }
}
 class LL {
    Node3 firstnode;
    int size;
    LL(){
        firstnode = null;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void checkIndex(int index){
       if(index <0 || index >size){
           throw new IndexOutOfBoundsException();
       }
    }
    public void add(Object data, int index){
        checkIndex(index);
        if(index==0){
            firstnode = new Node3(data, firstnode);
        }
        else{
            Node3 presentNode = firstnode;
            for(int i =0; i<=index-2; i++) {
                presentNode = presentNode.next;
            }
            presentNode.next = new Node3(data,presentNode.next);   //1 2 3 4 5  index = 3
        }
        size++;
    }
    public Object get(int index){
        checkIndex(index);
        Node3 presentNode = firstnode;
        for(int i = 0; i<index; i++){
            presentNode = presentNode.next;
        }
        return presentNode.data;
    }
    public int size(){
        return size;
     }
     public Object remove(int index){
        checkIndex(index);
        Object removedElement;
        Node3 presentNode = firstnode;
        if(index == 0){
            removedElement = firstnode.data;
            firstnode = firstnode.next;
        }
        else {
            for (int i = 0; i <= index - 2; i++) {        // how is it running for index = 1
                presentNode = presentNode.next;
            }
            removedElement = presentNode.next.data;
            presentNode.next = presentNode.next.next;
        }
         size--;
         return removedElement;
     }
}

public class app{
    public static void main(String[] args) {
        LL aakash = new LL();
        System.out.println(aakash.isEmpty());
        aakash.add(14,0);
        System.out.println(aakash.isEmpty());
        System.out.println(aakash.get(0));
        aakash.add("CAT",0);
        System.out.println(aakash.get(0));
        System.out.println(aakash.get(1));
        System.out.println(aakash.size());
        aakash.remove(0);
        System.out.println(aakash.get(0));
        System.out.println(aakash.size());
        aakash.add(12,1);
        aakash.add(13,2);
        aakash.add(14,3);
        aakash.add(15,4);
        aakash.add(16,5);
        System.out.println(aakash.size());
        System.out.println(aakash.remove(1));
    }
}
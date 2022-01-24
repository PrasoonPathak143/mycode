import java.util.*;
class arrayList{
    protected Object [] arr;
    protected int size;

    public arrayList(int initialCapacity){
        if(initialCapacity<1){
            throw new IllegalArgumentException();
        }
        else{
            arr = new Object[initialCapacity];
        }
    }
    public arrayList(){
        this(10);
    }
    public boolean isEmpty(){

        return(size==0);
    }
    public int size(){
        return size;
    }
    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
        public Object get(int index){
        checkIndex(index);
        return arr[index];
    }
    public int indexOf(Object x){
        for(int i=0; i<size; i++){
            if(arr[i].equals(x)){
                return i;
            }
        }
            return -1;
    }
    public Object remove(int index){
        checkIndex(index);
        Object removedElement = arr[index];
        for(int i= index+1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
          arr[size] = null;
        return removedElement;
    }
    public void add(int index, Object a){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException();
        }
        if (size == arr.length)
            arr = changelen(2 * size);
        for(int i = size -1; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = a;
        size++;
    }

    public Object[] changelen(int n) {
        Object[] newArr= new Object[n];
        System.arraycopy(arr,0,newArr,0,arr.length);
        return newArr;
    }

    public String toString() {
        StringBuffer s = new StringBuffer("[");
        for (int i = 0; i < size; i++) {
            if (arr[i] == null) {
                s.append("null ");
            }
            else {
                s.append(arr[i].toString() + ", ");
            }
        }
       if (size > 0) s.delete(s.length() - 2, s.length());
       s.append("]");

        return new String(s);
    }

}
public class Application {
    public static void main(String[] args) {
        arrayList b = new arrayList();
        System.out.println(b.isEmpty());
        b.add(0, 1);
        b.add(1, 2);
        b.add(2, "Cat");
        b.add(3, 4);
        b.add(4, 5);
        System.out.println();
        for (int i = 0; i < b.size; i++) {
            System.out.println(b.get(i));
        }
        System.out.println();
        System.out.println(b.isEmpty());
        System.out.println();
        System.out.println("Size = " + b.size());
        b.checkIndex(4);
        System.out.println();
        System.out.println("Index is " + b.indexOf(4));
        b.remove(0);
        System.out.println();
        System.out.println("After removing");
        for (int i = 0; i < b.size; i++) {
            System.out.println(b.get(i));
        }
        System.out.println();
        System.out.println(b.toString());

    }
}
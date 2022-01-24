import java.util.ArrayList;
import java.util.LinkedList;

class QueueAl extends ArrayList {

    public QueueAl(int i){
        super(i);
    }
    public QueueAl() {
        this(10);
    }

    public Object getFrontElement(){
        return super.get(0);
    }
    public Object getRearElement(){
        return super.get(size()-1);
    }
    public void put(Object element){
        super.add(size(), element);
    }
    public Object remove(){
        return super.remove(0);
    }
    public Object get(int index){
        String s = "Can't use this method";
        return s;
    }
    public Object remove(int index){
        String s = "Can't use this method";
        return s;
    }
    public void add(int index, Object a){
        System.out.println("Can't use this method");
    }
    public String toString() {
        String s = "Can't use this method";
        return s;
    }

    public int indexOf(Object x){
        System.out.println("This method can't be used");
        return -1;
    }

}
class QueueLl extends LinkedList {
    public void QueueLl() {
    }
    public Object getFrontElement(){
        return super.get(0);
    }
    public Object getRearElement(){
        return super.get(size()-1);
    }
    public void put(Object element){
        super.add(size(), element);
    }
    public Object remove(){
        return super.remove(0);
    }

    public Object get(int index) {
        String s = "Can't use this method";
        return s;
    }

    public Object remove(int index) {
        String s = "Can't use this method";
        return s;
    }

    public void add(int index, Object a) {
        System.out.println("Can't use this method");
    }

    public int indexOf(Object x) {
        System.out.println("This method can't be used");
        return -1;
    }
}

    public class Application4 {
        public static void main(String[] args) {
            QueueAl queue = new QueueAl(5);
            System.out.println("Implementing Queue using array list");
            queue.put(1);
            queue.put("CAT");
            queue.put(2);
            queue.put("DOG");
            queue.put(3);
            queue.put("RAT");
            System.out.println(queue.isEmpty());
            System.out.println(queue.getFrontElement());
            System.out.println(queue.getRearElement());
            queue.remove();
            queue.put(4);
            System.out.println(queue.getFrontElement());
            System.out.println(queue.getRearElement());
            queue.indexOf("CAT");
            System.out.println("Implementing Queue using linked list");
            QueueLl queue2 = new QueueLl();
            queue2.put("a");
            queue2.put(1);
            queue2.put("b");
            queue2.put(2);
            queue2.put("c");
            queue2.put(3);
            System.out.println(queue2.isEmpty());
            System.out.println(queue2.getFrontElement());
            System.out.println(queue2.getRearElement());
            queue2.remove();
            queue2.put("d");
            System.out.println(queue2.getFrontElement());
            System.out.println(queue2.getRearElement());
            queue2.indexOf("c");


        }
    }


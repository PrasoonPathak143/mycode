import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.*;
class StackAl extends ArrayList{
    public StackAl(int i){
        super(i);
    }
    public StackAl(){
        super();
    }
    public boolean empty() {
        return isEmpty();
    }
    public Object peek(){
        if(empty()){
            throw new EmptyStackException();
        }
        return super.get(size()-1);
    }
    public void push(Object theElement) {
       super.add(size(), theElement);
    }
    public Object pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return super.remove(size() - 1);
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
}
class StackLl extends LinkedList{
    public StackLl(){}
    public boolean empty(){
        return isEmpty();
    }
    public Object peek(){
        if(empty()){
            throw new EmptyStackException();
        }
        return super.get(size()-1);
    }
    public void push(Object theElement) {
        super.add(size(), theElement);
    }
    public Object pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return super.remove(size() - 1);
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


}
public class Application3 {
    public static void main(String[] args) {
        StackAl stack = new StackAl();
        System.out.println("Implementation using array list");
        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(1);
        stack.push(5);
        System.out.println(stack.peek());
        while(!(stack.empty())){
            System.out.println(stack.pop());
        }
        System.out.println(stack.empty());
        System.out.println("Implementation using linear list");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        while(!(stack.empty())){
            System.out.println(stack.pop());
        }
        System.out.println(stack.empty());
        System.out.println("Using some functions that are specified for array list or linked list only");
        stack.add(2,4);
        System.out.println(stack.get(4));

    }
}

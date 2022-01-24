import java.util.*;

class Animal {
    private void animal() {
        System.out.println("All animals are wild animals");

    }

    protected void human() {
        System.out.println("humans are stupid with mind");

    }

}

class Test2 extends Animal {
    public static void main(String[] args) {
        Animal ob = new Animal();
        ob.human();
    }

}
class Employee {
    public static void display(String name, long salary){  // creating method with name and salary parameter
        System.out.println("Name of employee :- " + name);
        System.out.println("Salary of employee :- " + salary);
    }
    public static void display(long salary,String name){  // changing sequence of parameters
        System.out.println("Name of employee :- " + name);
        System.out.println("Salary of employee :- " + salary);
    }
    public static void main(String[] args) {
       display("Prasoon", 200000);
        display(200000,"Prasoon");
    }
}

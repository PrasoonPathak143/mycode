public class RecursiveFactorial {
    static int Fac(int a){
        if(a==0){
            return 1;
        }
        return a * Fac(a-1);
    }
    public static void main(String[] args) {
        System.out.println(Fac(7));
    }
}

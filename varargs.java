public class varargs {
    /*static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }*/
    static int add(int...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of a and b is "+add(10,20));
        System.out.println("The sum of a and b is "+add(10,20,30));
    }
}

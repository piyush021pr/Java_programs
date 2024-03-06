public class method {

    /*static int add(int x,int y){
        return x+y;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }*/
    static int add(int...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 5 and 4 is "+add(5,4));
        System.out.println("The sum of 5,4 and 1 is "+add(5,4,1));
        System.out.println("The sum of 1,2,3,and 4 is "+add(1,2,3));

    }
}

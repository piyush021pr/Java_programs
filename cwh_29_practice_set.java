public class cwh_29_practice_set {
    public static void main(String[] args) {
        float[] marks={45.0f,65.41f,45.23f};
                float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("The sum is "+sum/marks.length);
    }
}

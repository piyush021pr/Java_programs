public class bubble_sort {
    public static void bubble(int [] arr){
        int temp=0;
        //int n=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a1=new int[]{10,20,60,3,2,90,1};
        System.out.println("Element before sorting:");
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
        System.out.println("\n");
        bubble(a1);
        System.out.println("After sorting:");
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
    }
}

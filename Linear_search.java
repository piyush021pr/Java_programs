public class Linear_search {
   public static int linear(int [] arr,int key){
       for(int i=0;i<arr.length;i++){
           if(arr[i]==key){
               return i;
           }
       }
       return -1;
   }
        public static void main(String[] args) {
           int []a1=new int[]{10,20,30,40,50,60,70};
           int k=60;
            System.out.println(k+" found at position "+linear(a1,k));

        }
    }


import java.util.Scanner;

    public class BoxDemo {
      public static void binary(int [] arr,int first,int last,int key){
          int mid=(first+last)/2;
          while(first<=last){
              if(arr[mid]<key){
                  first=mid+1;
              }
              else if(arr[mid]==key){
                  System.out.println("Element found at index " +mid);
                  break;
              }
              else{
                  last=mid+1;
              }
              mid=(first+last)/2;
          }
          if(last>last){
              System.out.println("Element not found:");
          }
      }

        public static void main(String[] args) {
            int [] arr={10,20,30,40,50,60};
            int key=50;
            int last=arr.length-1;
            binary(arr,0,last,key);
        }
    }


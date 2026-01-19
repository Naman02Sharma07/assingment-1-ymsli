package Assingments.ass1;

public class Fibonacci_Array_Avg {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for(int i=0;i<20;i++){
            if(i<=1){
                arr[i]=1;
            }
            else{
                arr[i] = arr[i-1]+arr[i-2];
            }
            System.out.print(arr[i]+" ");
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("the average of an array is :"+sum/(arr.length));
    }
}

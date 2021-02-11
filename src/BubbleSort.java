import java.util.Scanner;  

public class BubbleSort{  
    static void bubbleSort(int[] arr,int size) {  
        int temp = 0;  
         for(int i=0; i <size; i++){  
                 for(int j=1; j < (size-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) { 
                int n;  
                Scanner sc=new Scanner(System.in);  
                System.out.print("Enter the number of elements you want to store: "); 
                n=sc.nextInt();  
                int[] array = new int[10];  
                System.out.println("Enter the elements of the array: ");  
                for(int j=0; j<n;j++)  
                    {  
                        array[j]=sc.nextInt();  
                    }  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int k=0; k <n; k++){  
                        System.out.print(array[k] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(array,n); 
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < n; i++){  
                        System.out.print(array[i] + " ");  
                }  
   
        }  
}  

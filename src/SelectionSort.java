import java.util.Scanner;  
 
public class SelectionSort{  
    public static void selectionSort(int[] arr,int size){  
        for (int i = 0; i < size - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < size; j++){  
                if (arr[j] < arr[index]){  
                    index = j; 
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
            int n;  
            Scanner sc=new Scanner(System.in);  
            System.out.print("Enter the number of elements you want to store: "); 
            n=sc.nextInt();  
            int[] arr1 = new int[10];  
            System.out.println("Enter the elements of the array: ");  
            for(int j=0; j<n;j++)  
                {  
                    arr1[j]=sc.nextInt();  
                }
        System.out.println("Before Selection Sort");  
        for(int i=0;i<n;i++){  
            System.out.print(arr1[i]+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1,n);
         
        System.out.println("After Selection Sort");  
        for(int k=0;k<n;k++){  
            System.out.print(arr1[k]+" ");  
        }  
    }  
}  

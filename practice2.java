public class practice2 {
    public static void main(String[] args) {
        int arr[] = {1,9,5,4,3,6,7,8,2};
        
        
        

        for (int i = 0; i < arr.length; i++){
            int a = arr[0];
            if (a > arr[i]){
                int temp = a;
                a = arr[i];
                arr[i] = temp;
                System.out.println(arr[i]);
          }
          
        }

  }
}

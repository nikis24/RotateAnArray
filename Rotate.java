//Program to rotate an array by d elements.

class Rotate {
    // Function to left rotate arr[] having size n by d. 
    void leftRotate(int arr[], int d, int n){
        for(int i = 0 ;i < d; i++)
        leftRotatebyOne(arr, n);
    }

     void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for(i = 0; i < n-1 ; i++)
        arr[i] = arr[i+1];
        arr[i] = temp;
    }
// Function to print an array.
    void printArray(int arr[], int n){
        for(int i = 0; i < n; i++ )
        System.out.println(arr[i] + " ");
    }

    //Main function to test above functions.
    public static void main(String[] args){
        Rotate rotate =  new Rotate();
        int arr[] = {10,20,30,40,50,60,70};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}

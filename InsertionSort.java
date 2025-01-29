public class InsertionSort{
    public static void main (String[] args) {
        int[] arr={50,-1,11,87,13,68};
        int n= arr.length;
        for(int i=1;i<n;i++){
            int k=arr[i];
            int j=i-1;
            while(j>=0 && k<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=k;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class BubbleSortXOR{
    public static void main (String[] args) {
        int[] arr={50,-1,11,87,13,68};
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];;
                    arr[i]=arr[i]^arr[j];
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
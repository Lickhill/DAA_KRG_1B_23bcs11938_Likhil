class exp5 {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot =high;
        int j=low-1;
        for(int i=low;i<high;i++){
            if(arr[i]<=arr[pivot]){
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,j+1,pivot);
        return j+1;
    }
    
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
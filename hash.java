class hash{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int key = 40;
        int l =0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==key){
                System.out.println("present at Index:"+" "+mid);
                break;
            }
            else if(arr[mid]>key){
                r = mid-1;
             
            }
            else{
                l = mid+1;
                
            }
        }
    }
}
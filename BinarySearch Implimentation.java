public static int binarySearch(int[] arr, int val, int high, int low){
        int mid;
        if(high >= low){
            mid = (low + high) / 2;
            if(val == arr[mid]){
                return mid;
            }else if(val > arr[mid]){
                return binarySearch(arr, val, high, mid + 1);
            }else if(val < arr[mid]){
                return binarySearch(arr, val, mid -1, low);
            }
        }
        return -1;
    }
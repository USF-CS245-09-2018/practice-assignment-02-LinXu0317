public  class BinaryRecursiveSearch implements Practice2Search {

    public String searchName() {

        return "BinaryRecursiveSearch";
    }
    public int search(int [] arr, int target) {

        return search( arr,  target, 0, arr.length-1);
    }
    public int search(int [] arr, int target, int lower, int upper){
        if(lower > upper){
            return -1;
        }
        int mid = (lower + upper)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if (target < arr[mid]) {
            return search(arr, target, lower, mid -1);
        }
        else{
            return search(arr, target, mid+1, upper);
        }
    }
}

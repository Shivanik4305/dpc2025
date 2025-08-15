class Solution {
    public void sort(int[] nums) {
        int[] count=new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]=count[nums[i]]+1;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                nums[k]=i;
                k++;
            }
        }
        
    }
  public static void main(String args[]){
  int[] arr={1,0,2,0,1,1,2};
  sort(arr);
  for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
  }
  }
}

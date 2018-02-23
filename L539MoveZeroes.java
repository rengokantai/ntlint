class L539MoveZeroes{
//Hernan Y.Ke
//02/24/2018
  public void moveZeroes(int[] num){
    int left=0;
    int right=0;
    while(right<num.length){
      if(num[right]!=0){
        int temp = num[left];
        num[left]=num[right];
        num[right]=temp;
        left++;
      }
      right++;
    }
  }
}

//Hernan Y.Ke
//02/23/2018
public int winSum(int[] nums, int k) {
    if (nums.length== 0 || nums.length < k || k == 0)
        return null;
    ArrayList<Integer> result;
    int currSum = 0;
    for (int i = 0; i < k; i++) {
        currSum += nums[i];
    }
    result.add(currSum);
    for (int i = k; i < nums.size(); i++) {
        currSum += nums[i];
        currSum -= nums[i-k];
        result.add(currSum);
    }
    return result.toArray(new Integer[result.size()]);
}

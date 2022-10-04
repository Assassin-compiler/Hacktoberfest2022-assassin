class Solution {
  public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
    int n = queries.length;
    int sum = 0;
    int[] answer = new int[n];
    
    for (int value : nums) {
      if ((value & 1) == 0)
        sum += value;
    }
    
    for (int i = 0; i < n; i++) {
      int val = queries[i][0];
      int index = queries[i][1];
      
      if ((nums[index] & 1) == 0)
        sum -= nums[index];
      
      nums[index] += val;
      
      if ((nums[index] & 1) == 0)
        sum += nums[index];
      
      answer[i] = sum;
    }
    
    return answer;
  }
}

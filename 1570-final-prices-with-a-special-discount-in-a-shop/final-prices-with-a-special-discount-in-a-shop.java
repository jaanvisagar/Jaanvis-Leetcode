class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i < n; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int idx = stack.pop();
                answer[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = prices[idx];
        }
        return answer;
    }
}
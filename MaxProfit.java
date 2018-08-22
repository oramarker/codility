
public class MaxProfit {
	public int solution(int[] prices) {
		if (prices.length < 2) {
			throw new IllegalArgumentException("At least two day prices is needed");
		}
		int min = Math.min(prices[0], prices[1]);
		int maxProfit = Math.max(0, prices[1] - prices[0]);
		int x = 0;
		for (int i = 2; i < prices.length; i++) {
			x = prices[i];
			maxProfit = Math.max(x - min, maxProfit);
			min = Math.min(min, x);

		}
		return maxProfit;
	}
}

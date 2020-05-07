package algorithms.easy.warmup;

/**
 * Given an array of integers representing the color of each sock, determine
 * how many pairs of socks with matching colors there are.
 */
public class SockMerchantSolution {

  /**
   * Takes an array of integers that represent colors of socks and determines
   * how many matching pairs of socks we have.
   * @param n The total number of socks
   * @param ar An array of integers representing sock colors
   * @return the total number of matching sock pairs
   */
  static int sockMerchant(int n, int[] ar) {
    int[] pairs = new int[100];
    int totalPairs = 0;
    for (int i = 0; i < ar.length; i++) {
      if (ar[i] < 1 || ar[i] > 100) continue;
      pairs[ar[i]-1]++;
    }
    for (int i = 0; i < pairs.length; i++) {
      totalPairs += pairs[i] / 2;
    }
    return totalPairs;
  }

}

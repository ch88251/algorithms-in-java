package algorithms.easy.warmup;

/**
 * Emma is playing a new mobile game that starts with consecutively numbered clouds.
 * Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus
 * cloud having a number that is equal to the number of the current cloud plus 1 or 2. She
 * must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to
 * jump from her starting position to the last cloud.
 */
public class JumpingOnCloudsSolution {

  /**
   * Given an integer array that represents numbered clouds, calculate the minimum number
   * or jumps required to reach the last cloud without landing on a thunder cloud.
   * @param c an integer array representing number clouds.
   * @return the minimum number of jumps required.
   */
  static int jumpingOnClouds(int[] c) {
    if (c.length < 2 || c.length > 100) return 0;
    if (c[0] == 1 || c[c.length-1] == 1) return 0;
    int count = 0;
    int currPtr = 0; // every time we make a jump, reset the pointer to zero
    for (int i = 0; i < c.length; i++) {
      currPtr = i;
      if (c[i] == 1) {
        count = count + currPtr / 2;
        currPtr = 0;
      } else if (i % 2 == 0) {
        count++;
      }
    }
    if (c.length % 2 != 0) {
      count--;
    }
    return count;
  }
}

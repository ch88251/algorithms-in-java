package algorithms.easy.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleysSolution {

  static int countingValleys(int n, String s) {
    int currOffset = 0;
    boolean belowSeaLevel = false;
    int valleyCount = 0;
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != 'D' && chars[i] != 'U') return 0;
      if (chars[i] == 'D') {
        currOffset --;
        if (currOffset < 0) {
          belowSeaLevel = true;
        }
        continue;
      } else if (chars[i] == 'U') {
        currOffset ++;
      }
      if (currOffset < 0) {
        belowSeaLevel = true;
      }
      if (belowSeaLevel && currOffset == 0) {
        valleyCount++;
      }
    }
    return valleyCount;
  }
}

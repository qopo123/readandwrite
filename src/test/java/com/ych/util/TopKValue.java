package com.ych.util;

public class TopKValue {


  /**
   * 每次拿数组中最大的一个比，取出之后，把要取出的数组位置减一
   * @param array
   * @param k
   * @return
   */
  public static long[] topn(long[][] array, int k){
    long[] result = new long[k];

    int[] index = new int[array.length];
    for (int i = 0; i < array.length; i++){
      index[i] = array[i].length - 1;
    }

    int bucket = 0;
    for(int cur = 0; cur < result.length; cur++){
      long max = 0L;
      for(int j = 0; j < index.length; j++){
        if(index[j] < 0){
          continue;
        }
        long top = array[j][index[j]];
        if(top > max){
          max = top;
          bucket = j;
        }
      }
      index[bucket] -= 1;
      result[cur] = max;
    }
    return result;
  }

  public static void main(String[] args) {
    long[][] array = {{1, 2, 3, 12}, {7, 8, 9}, {4, 5, 6}};
    long[] topn = topn(array, 1);
    for (long var : topn) {

      System.out.println(var);
    }
  }
}

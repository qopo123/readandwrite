package com.ych.util;

public class AlgoUtils {



  public static boolean find(int[] data, int sum){

    int length = data.length;
    for(int i = 0; i < length; i++){
      if(data[i] > sum){
        continue;
      }
      int target = sum - data[i];
      int start = i;
      int end = length - 1;
      while (start < end){
        int mid = (start + end) / 2;
        if(data[mid] > target){
          end = mid;
        }else if(data[mid] < target){
          start = mid;
        }else {
          return true;
        }

      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] array = {1, 3, 4, 7};
    System.out.println(find(array, 5));
  }

}

package com.ych.util;

public class IpUtils {


  private static final int BEGIN_INT = 48;

  public static int ipToInt(String ip){
    char common = '.';
    char[] chars = ip.toCharArray();
    int[] segmentChar = new int[3];
    int index = 0;
    int ipInt = 0 << 8;
    for(char c : chars){
      if(common == c){
        ipInt |= strToInt(segmentChar, index - 1);
        index = 0;
        ipInt <<= 8;
        continue;
      }
      segmentChar[index] = c -BEGIN_INT;
      index++;
    }
    ipInt |= strToInt(segmentChar, index -1);
    return ipInt;
  }


  public static void main(String[] args) {
    System.out.println(ipToInt("255.255.255.255"));
    System.out.println(ipToStr(ipToInt("255.255.255.255")));

  }

  public static int strToInt(int[] segment, int end){
    int toInt = 0;

    for(int index = 0; index <= end; index++){
      int defalutMulity = 1;
      if(end == 2){
        if(index == 0){
          defalutMulity = 100;
        }
        if(index == 1){
          defalutMulity = 10;
        }
      }else if(end == 1 && index == 0){
        defalutMulity = 10;
      }
      int value = segment[index] * defalutMulity;
      toInt += value;
    }
    return toInt;
  }


  public static String ipToStr(int ip){
    int seg1 = ip & 0xFF;
    int seg2 = (ip >>> 8) & 0xFF;
    int seg3 = (ip >>> 16) & 0xFF;
    int seg4 = (ip >>> 24) & 0xFF;
    return seg4 + "." + seg3 + "." + seg2 + "." + seg1;
  }
}

package com.hua.tpwg.utils;

import java.util.*;

/**
 * Created by yangchuanhua on 2017/10/11.
 */
public class CollectionUtil {

  /**
   *
   * @param <E>
   * @return
   */
  public static <E> ArrayList<E> createArrayList(){
    return new ArrayList<E>();
  }

  public static <E> ArrayList<E> createArrayList(int initialCapacity){
    return new ArrayList<>(initialCapacity);
  }

  public static <E> ArrayList<E> createArrayList(Collection<? extends E> collection){
    if(collection == null){
      return new ArrayList<E>();
    }

    return new ArrayList<E>(collection);
  }
  /**
   *
   * @param <K>
   * @param <V>
   * @return
   */
  public static <K, V> HashMap<K, V> createHashMap(){
    return new HashMap<K, V>();
  }
}

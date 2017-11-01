package in.vamsoft.training.employee;

import java.util.*;
/*
 * @this is the list sort program in collection.
 * @using sort,reverse,fill,position.
 */

public class Listdemo {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<Integer>();

    list.add(22);
    list.add(10);
    list.add(30);
    list.add(40);
    list.add(2, 88);

    Collections.sort(list);
    System.out.println("Sorting a list:" + list);

    Collections.reverse(list);
    System.out.println("Reversing Number:" + list);

    Iterator itr = list.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    Collections.fill(list, 1);
    System.out.println("Fill the numbers:"+list);

    Collections.sort(list);
    int position = Collections.binarySearch(list, 30);
    System.out.println("Position of number:"+position);
  }

}

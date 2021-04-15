import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListMod {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0,10);
        System.out.println("Add first element in ArrayList: "+list1);
        LinkedList<Integer> list2 =new LinkedList<>();
//        long startTime = System.nanoTime();
//        (list1.add(1))ToTime();
//        long endTime = System.nanoTime();
//
//        long duration = (endTime - startTime);
        list2.addFirst(1);
        System.out.println("Add first element in LinkedList: "+list2);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        System.out.println(list1);
        int position1= list1.size()/2;
        list1.add(position1,100);
        System.out.println(list1);
        int position2= list2.size()/2;
        list2.add(position2,1000);
        System.out.println(list2);
        list1.add(1234);
        System.out.println("Add last in ArrayList:"+list1);
        list2.addLast(123);
        System.out.println("Add Last in LikedList: "+list2);
        list1.remove(0);
        System.out.println("Delete the first element in ArrayList:"+list1);
        list2.removeFirst();
        System.out.println("Delete the first element in LinkedList:"+list2);
        list1.remove(position1);
        System.out.println("Remove the middle element in ArrayList"+list1);
        list2.remove(position2);
        System.out.println("Remove the middle element in LikedList "+list2);
        list1.remove(list1.size()-1);
        System.out.println(list1);
        list2.removeLast();
        System.out.println(list2);




        }


    }

package z11_3;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Map<Integer,Integer> first=new TreeMap<>(new Comparator<Integer>(){
        @Override
        public int compare(Integer o1, Integer o2) {
            return -(o1.compareTo(o2));
        }});

        Map<Integer,Integer> second=new TreeMap<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }});

        /*Map<Integer,Integer> third=new TreeMap<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }});
*/





        //Collections.reverse(first);
        first.put(4,3);
        first.put(3,5);
        first.put(2,8);
        first.put(1,1);
        first.put(0,3);

        second.put(4,3);
        second.put(2,1);
        second.put(5,-3);
        second.put(8,3);
        second.put(1,2);
        second.put(9,8);


        Utils.print(first);
        Utils.print(second);

        Utils.adding(first,second);

        Utils.print(first);
    }

}

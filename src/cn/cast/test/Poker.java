package cn.cast.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String[] color = { "♠", "♥", "♣", "♦" };
        String[] point = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K", "A", "2" };

        int index = 0;
        for (String poi : point) {
            for (String col : color) {
                String key = col.concat(poi);
                hm.put(index, key);
                arr.add(index);
                index++;
            }
        }

        hm.put(index, "小王");
        arr.add(index);
        index++;
        hm.put(index, "大王");
        arr.add(index);

        TreeSet<Integer> s1 = new TreeSet<Integer>();
        TreeSet<Integer> s2 = new TreeSet<Integer>();
        TreeSet<Integer> s3 = new TreeSet<Integer>();
        TreeSet<Integer> s4 = new TreeSet<Integer>();

        Collections.shuffle(arr);

        for (int x = 0; x < arr.size(); x++) {
            if (x > arr.size() - 4) {
                s4.add(arr.get(x));
            } else if (x % 3 == 0) {
                s1.add(arr.get(x));
            } else if (x % 3 == 1) {
                s2.add(arr.get(x));
            } else if (x % 3 == 2) {
                s3.add(arr.get(x));
            }
        }
        Lookpoint("姜南", hm, s1);
        Lookpoint("杨耀伟", hm, s2);
        Lookpoint("大牙", hm, s3);
        Lookpoint("底牌", hm, s4);
    }

    public static void Lookpoint(String name, HashMap<Integer, String> hm,
                                 TreeSet<Integer> ts) {
        System.out.println(name + "的牌是：");
        for (Integer x : ts) {
            String key = hm.get(x);
            System.out.print(key + " ");
        }
        System.out.println();
    }
}

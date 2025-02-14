package aaLEETCODE;

import java.util.*;


/*
* Set [SortedSet <- NavigableSet <- TreeSet]
* Set [HashSet, LinkedHashSet]
*
* List [Vector <- Stack]
* List [ArrayList, LinkedList]
*
* Queue [Deque <- LinkedList, ArrayDeque]
* Queue [PriorityQueue]
*
* EnumSet
* */


enum VechileType {
    CAR,
    BIKE,
    TRUCK
}

class Event {
    private final int val;

    Event(int val) {
        this.val = val;
    }

    int getVal() {
        return val;
    }
}

public class Basics {

    public static void main(String[] args) {
        Basics basics = new Basics();
        basics.doSet();
        basics.doHash();
        basics.doQueue();
    }


    public void doQueue() {

        System.out.println("----------- QUEUE -------------");

        PriorityQueue<Event> pq = new PriorityQueue<>(new Comparator<Event>() {
            @Override
            public int compare(Event o1, Event o2) {
                return o1.getVal() - o2.getVal();
            }
        });

        pq.add(new Event(10));
        pq.add(new Event(20));

        System.out.print("pq: ");

        while(!pq.isEmpty()) {
            System.out.print(pq.poll().getVal() + " ");
        }

        System.out.println();
    }

    public void doHash() {

        System.out.println("----------- HASH MAP ------------");

        Random random = new Random(System.currentTimeMillis());

        int[] arr = new int[10];

        System.out.print("arr: ");

        for(int i=0; i<arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Map<String, Integer> hm = new HashMap<>();

        for(int i=0; i<10; i++) {
            hm.put("i" + i , arr[i]);
        }

        System.out.print("hm: ");

        for(Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.printf("[%s:%d] ", entry.getKey(), entry.getValue());
        }

        System.out.println();

        hm.computeIfAbsent("", (String key) -> {
            return 10;
        });

        Integer newVal = hm.computeIfPresent("i0", (String key, Integer val) -> {
            return 10*val;
        });

        System.out.println(newVal + " " + hm.get("i0"));






    }








    public void doSet() {

        System.out.println("------------- SET ------------");

        Random random = new Random(System.currentTimeMillis());

        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("al: ");

        for(int i=0; i<10; i++) {
            al.add(random.nextInt(100));
            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        Set<Integer> hs = new HashSet<>();

        for(Integer ele : al) {
            hs.add(ele);
        }

        Iterator<Integer> itr = hs.iterator();

        System.out.print("hs: ");

        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();


        Set<VechileType> svt = EnumSet.allOf(VechileType.class);

        System.out.print("svt: ");

        for(VechileType vt : svt) {
            System.out.print(vt.name() + " ");
        }

        System.out.println();

        Set<Integer> lhs = new LinkedHashSet<>();

        for(Integer ele : al) {
            lhs.add(ele);
        }

        lhs.remove(al.get(0));

        System.out.print("lhs: ");

        Iterator<Integer> itr2 = lhs.iterator();

        while(itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }

        System.out.println();

        TreeSet<Integer> ts = new TreeSet<>();

        for(Integer ele : al) {
            ts.add(ele);
        }

        System.out.print("ts: ");

        Iterator<Integer> itr3 = ts.iterator();

        while(itr3.hasNext()) {
            System.out.print(itr3.next() + " ");
        }

        System.out.println();

        SortedSet<Integer> ss = ts.tailSet(50);

        System.out.print("ss: ");

        for(Integer ele : ss) {
            System.out.print(ele + " ");
        }

        System.out.println();
    }
}

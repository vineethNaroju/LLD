package iterator_pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Item {

}


interface IMenuIterator {
    public boolean hasNext();
    public Item next();
}

class Menu {
    private final ArrayList<Item> items = new ArrayList<>();


    public void add(Item item) {
        items.add(item);
    }

    public MenuIterator getIterator() {
        return new MenuIterator(items);
    }

    public class MenuIterator implements IMenuIterator {
        private final ArrayList<Item> list;
        private int curr = 0;
        private final int total;


        public MenuIterator(ArrayList<Item> list) {
            this.list = list;
            total = list.size();
        }

        @Override
        public boolean hasNext() {
            return curr + 1 < total;
        }

        @Override
        public Item next() {

            if(curr >= total) {
                throw new RuntimeException("no more elements");
            }

            System.out.println("curr:" + curr + " total:" + total);


            return list.get(curr++);
        }
    }
}



public class Demo {
    public static void main(String[] args) {


        HashMap<String, Integer> mp = new HashMap<>();

        mp.put("hello", 10);


        Iterator<Map.Entry<String, Integer>> itr =  mp.entrySet().iterator();

        while(itr.hasNext()) {

            Map.Entry<String, Integer> entry = itr.next();

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



        Menu menu = new Menu();

        menu.add(new Item());

        int x = 0;

        IMenuIterator iterator = menu.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().hashCode());

            while(x++ < 3) menu.add(new Item());
        }

    }
}

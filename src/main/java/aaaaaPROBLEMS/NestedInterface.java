package aaaaaPROBLEMS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

interface  IA {

    boolean isTerminal();
}
class B implements IA {

    List<IA> list = new LinkedList<>();

    @Override
    public boolean isTerminal() {
        return false;
    }

    List<IA> getList() {
        return list;
    }

    void add(IA ia) {
        list.add(ia);
    }
}

class C implements IA {
    public boolean isTerminal() {
        return true;
    }
}


interface ICake<K, V> {
    V get(K key);
    void set(K key, V value);
}

interface IState {}
interface IAgent {
    void invoke();
}


interface INotificationStrategy<A extends IAgent> {

    List<A> getList();
    void called(A agent);

    void add(A agent);
}

class SimpleList<A extends IAgent> implements INotificationStrategy<A> {

    List<A> list = new LinkedList<>();

    @Override
    public List<A> getList() {
        return list;
    }

    @Override
    public void called(A agent) {

    }

    public void add(A agent) {
        list.add(agent);
    }
}

class ChannelHandler<S extends IState , A extends IAgent> {

    HashMap<S, INotificationStrategy<A>> map = new HashMap<>();

    void addState(S state, INotificationStrategy<A> notif) {
        map.put(state, notif);
        System.out.println("added state:" + state.getClass() + " with strategy:" + notif.getClass());
    }

    void addAgent(S state, A agent) {
        map.get(state).add(agent);
        System.out.println("added agent:" + agent.getClass() + " to state:" + state.getClass());
    }

    void updateAgents(S state) {
        List<A> list = map.get(state).getList();

        for(A ia : list) {
            ia.invoke();
        }
    }


}

class Aa implements IAgent {
    @Override
    public void invoke() {
        System.out.println(this.getClass());
    }
}
class Ss implements IState {}

public class NestedInterface {

    public static void main(String[] args) {

        NestedInterface ni = new NestedInterface();
        ni.demo();

    }


    public void demo() {
        ChannelHandler<IState, IAgent> ch = new ChannelHandler<>();

        Ss ss = new Ss();
        Aa aa = new Aa();

        SimpleList<IAgent> sl = new SimpleList<>();

        ch.addState(ss, sl);
        ch.addAgent(ss, aa);

        ch.updateAgents(ss);
    }
}

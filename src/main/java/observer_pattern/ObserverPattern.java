package observer_pattern;


import java.util.ArrayList;
import java.util.List;

abstract class StateObserver {
    protected final State state;

    public StateObserver(State state) {
        this.state = state;
        this.state.add(this);
    }

    public abstract void stateIsUpdated();
}

class State {
    List<StateObserver> observerList = new ArrayList<>();

    public void updateContents() {
        for(StateObserver observer : observerList) {
            observer.stateIsUpdated();
        }
    }

    public void add(StateObserver observer) {
        observerList.add(observer);
    }

    public void getStuff() {
        // to fetch state related data
    }
}

class Agent extends StateObserver {

    public Agent(State state) {
        super(state);
    }

    @Override
    public void stateIsUpdated() {
        this.state.getStuff();
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        State state = new State();

        new Agent(state);
        new Agent(state);

        state.updateContents();
    }
}

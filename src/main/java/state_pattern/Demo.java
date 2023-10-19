package state_pattern;

import java.util.HashMap;
import java.util.List;


class Transition {
    State source;
    State destination;

    Transition(State source, State destination) {
        this.source = source;
        this.destination = destination;
    }

}

class State {

    private final int userId;
    List<Transition> transitions;
    private final Platform platform;

    public State(Platform platform, int userId) {
        this.platform = platform;
        this.userId = userId;
    }

    void performTransition(int idx) {
        platform.setUserState(userId, transitions.get(idx).destination);
    }
}

class Platform {
    HashMap<Integer, State> userState = new HashMap<>();

    public int getNewUserState(int userId) {
        State a = new State(this, userId);
        userState.put(userId, a);
        return a.hashCode();
    }

    public void setUserState(int userId, State dest) {
        userState.put(userId, dest);
    }
}

class MyPlatform extends Platform {





    public MyPlatform() {

    }

}

class StateA {

}


public class Demo {
    public static void main(String[] args) {

        Platform platform = new Platform();

        int u = 10;

        platform.getNewUserState(u);





    }
}

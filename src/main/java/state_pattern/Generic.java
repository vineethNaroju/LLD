package state_pattern;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


abstract class Operation {

    @Getter @Setter
    GenericState nextState;


    abstract void performAction();
}


abstract class GenericState {

    private final Generic generic;

    GenericState (Generic generic) {
        this.generic = generic;
    }

    Set<Operation> operationSet = new HashSet<>();

    void addNextOperation(Operation operation) {
        operationSet.add(operation);
    }

    List<Operation> listOperations() {
        return new ArrayList<>();
    }

    void performOperation(Operation operation) {
        operation.performAction();
        generic.setState(operation.getNextState());
    }
}


class GenericStateA extends GenericState {

    GenericStateA(Generic generic) {
        super(generic);

        Operation opx = generic.getOperationA2B();
        opx.setNextState(generic.getStateB());
        this.addNextOperation(opx);


    }
}


class OperationA2B extends Operation {

    @Override
    void performAction() {
        System.out.println("Moving from A to B");
    }


}

class GenericStateB extends GenericState {

    GenericStateB(Generic generic) {
        super(generic);
    }
}






public class Generic {

    @Getter @Setter
    GenericStateB stateB;

    @Getter
    OperationA2B operationA2B;

    @Getter
    GenericStateA stateA;

    Generic () {
        stateA = new GenericStateA(this);

    }


    void setState(GenericState state) {

    }






}

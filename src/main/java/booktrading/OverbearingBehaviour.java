package booktrading;
import jade.core.Agent;
import jade.core.AID;
import jade.core.behaviours.Behaviour;

public class OverbearingBehaviour extends Behaviour {
    public void action() {
        while (true) {
        // do something
            System.out.println("Doing something");
        }
    }

    public boolean done() {
        return true;
    }
}
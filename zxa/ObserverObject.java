package zxa;

import java.util.Observable;
import java.util.Observer;

public class ObserverObject extends Observable {

	public void changeMessage(String msg) {
		setChanged();
		notifyObservers(msg);
	}

	public static void main(String[] args) {
		ObserverObject board = new ObserverObject();
		Student bob = new Student();
		board.addObserver(bob);
		board.changeMessage("More Homework!");
	}
}

class Student implements Observer {
	public void update(Observable o, Object arg) {
		System.out.println("Message board changed: " + arg);
	}
}

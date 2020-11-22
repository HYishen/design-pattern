package yishen.design.patterns.action.observer;

import org.junit.Test;
import yishen.design.patterns.action.observer.demo.*;

/**
 * <pre>
 * 。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestObserver {
    @Test
    public void testObserver() {
        Observer observerOne = new ConcreteObserverOne();
        Observer observerTwo = new ConcreteObserverTwo();

        Subject subject = new ConcreteSubject();
        subject.registerObserver(observerOne);
        subject.registerObserver(observerTwo);

        subject.notifyObservers(new Message("knock!knock!"));
    }
}

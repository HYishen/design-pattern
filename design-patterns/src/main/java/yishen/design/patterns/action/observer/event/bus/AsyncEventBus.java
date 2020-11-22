package yishen.design.patterns.action.observer.event.bus;

import java.util.concurrent.Executor;

/**
 * <pre>
 * 来源：极客时间《设计模式之美》57节，观察者模式（下）。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */

public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
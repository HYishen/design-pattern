package yishen.design.patterns.creation.singleton.hungry;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉模式id生成器
 *
 * @author Yishen 844147804@qq.com
 */
public class IdGenerator {
    private AtomicLong generator = new AtomicLong();

    private static IdGenerator idGenerator = new IdGenerator();

    private IdGenerator() {
    }


    public static IdGenerator getInstance() {
        return idGenerator;
    }

    public long getId() {
        return generator.incrementAndGet();
    }
}

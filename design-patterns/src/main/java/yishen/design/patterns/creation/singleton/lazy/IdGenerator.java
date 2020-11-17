package yishen.design.patterns.creation.singleton.lazy;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉模式id生成器.
 *
 * @author Yishen 844147804@qq.com
 */
public class IdGenerator {
    private AtomicLong generator = new AtomicLong();

    private static IdGenerator idGenerator;

    private IdGenerator() {
    }

    public static synchronized IdGenerator getInstance() {
        if (idGenerator == null) {
            idGenerator = new IdGenerator();
        }
        return idGenerator;
    }

    public long getId() {
        return generator.incrementAndGet();
    }
}

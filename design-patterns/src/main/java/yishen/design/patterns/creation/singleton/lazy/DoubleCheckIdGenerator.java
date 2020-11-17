package yishen.design.patterns.creation.singleton.lazy;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 双重检测id生成器.
 *
 * @author Yishen 844147804@qq.com
 */
public class DoubleCheckIdGenerator {

    private AtomicLong generator = new AtomicLong();

    private static DoubleCheckIdGenerator idGenerator;

    private DoubleCheckIdGenerator() {
    }

    public static DoubleCheckIdGenerator getInstance() {
        if (idGenerator == null) {
            synchronized (DoubleCheckIdGenerator.class) {
                if (idGenerator == null) {
                    idGenerator = new DoubleCheckIdGenerator();
                }
            }
        }
        return idGenerator;
    }

    public long getId() {
        return generator.incrementAndGet();
    }
}

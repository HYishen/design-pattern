package yishen.design.patterns.creation.singleton.singleton.lazy;

import org.junit.Assert;
import org.junit.Test;
import yishen.design.patterns.creation.singleton.lazy.DoubleCheckIdGenerator;

/**
 * 懒汉模式id生成器.
 *
 * @author Yishen 844147804@qq.com
 */
public class TestDoubleCheckIdGenerator {
    @Test
    public void testIdGenerator() {
        int num = 10;
        for (int i = 0; i < num; i++) {
            long id = DoubleCheckIdGenerator.getInstance().getId();
            System.out.println(id);
            Assert.assertEquals(i + 1, id);
        }
    }
}

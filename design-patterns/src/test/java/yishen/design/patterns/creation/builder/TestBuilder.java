package yishen.design.patterns.creation.builder;

import org.junit.Test;

/**
 * @author Yishen 844147804@qq.com
 */
public class TestBuilder {

    @Test
    public void testBuilder() {
        ResourcePoolConfig.Builder builder = new ResourcePoolConfig.Builder();
        builder.setName("pool");
        ResourcePoolConfig poolConfig = builder.build();
        System.out.println(poolConfig);
    }

}

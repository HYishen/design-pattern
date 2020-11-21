package yishen.design.patterns.structure.proxy;

import org.junit.Test;

/**
 * <pre>
 * .
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 */
public class TestUserServiceProxy {

    @Test
    public void testUserServiceProxy() {
        UserService service1 = new UserServiceImpl();
        UserService service2 = new UserServiceImpl2();

        UserServiceProxy proxy1 = new UserServiceProxy(service1);
        UserServiceProxy proxy2 = new UserServiceProxy(service2);

        UserService userServiceProxy1 = (UserService) proxy1.createUserServiceProxy();
        UserService userServiceProxy2 = (UserService) proxy2.createUserServiceProxy();

        System.out.println("------------------------------ Test userServiceProxy1 ------------------------------");
        userServiceProxy1.login("Yishen", "123");
        userServiceProxy1.findUser("Yishen");
        System.out.println("------------------------------ Test userServiceProxy1 ------------------------------");
        userServiceProxy2.login("Yishen", "123");
        userServiceProxy2.findUser("Yishen");
    }

}

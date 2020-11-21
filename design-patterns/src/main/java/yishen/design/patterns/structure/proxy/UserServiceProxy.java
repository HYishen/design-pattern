package yishen.design.patterns.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <pre>
 * .
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 */
public class UserServiceProxy {

    UserService userService;

    public UserServiceProxy(UserService userService) {
        if (userService == null) {
            throw new RuntimeException("Param userService cannot be null");
        }
        this.userService = userService;
    }

    public Object createUserServiceProxy() {
        return Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), new DynamicProxyHandler(userService));
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTime = System.currentTimeMillis();
            Object result = method.invoke(proxiedObject, args);
            long endTime = System.currentTimeMillis();
            String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
            System.out.println(apiName + "调用时间：" + (endTime - startTime));

            return result;
        }
    }

}

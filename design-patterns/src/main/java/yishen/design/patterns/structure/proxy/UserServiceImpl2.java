package yishen.design.patterns.structure.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <pre>
 * .
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 */
public class UserServiceImpl2 implements UserService {

    private static Map<String, User> userMap;

    static {
        userMap = new HashMap<>();
        userMap.put("Yishen", new User("Yishen", "123", "Mars"));
    }

    @Override
    public boolean login(String username, String password) {
        User user = userMap.get(username);
        if (user == null) {
            System.out.println("UserServiceImpl2.login......登录失败");
            return false;
        }
        if (Objects.equals(user.getPassword(), password)) {
            System.out.println("UserServiceImpl2.login......登录成功");
            return true;
        }
        System.out.println("UserServiceImpl2.login......登录成功");
        return false;
    }

    @Override
    public User findUser(String username) {
        System.out.println("UserServiceImpl2.findUser......");
        return userMap.get(username);
    }
}

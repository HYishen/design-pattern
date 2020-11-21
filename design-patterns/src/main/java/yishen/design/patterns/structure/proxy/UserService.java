package yishen.design.patterns.structure.proxy;

/**
 * <pre>
 * .
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 */
public interface UserService {

    boolean login(String username, String password);

    User findUser(String username);
}

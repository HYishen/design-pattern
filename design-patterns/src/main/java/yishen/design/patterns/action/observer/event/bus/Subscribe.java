package yishen.design.patterns.action.observer.event.bus;

import com.google.common.annotations.Beta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 * 来源：极客时间《设计模式之美》57节，观察者模式（下）。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Beta
public @interface Subscribe {
}

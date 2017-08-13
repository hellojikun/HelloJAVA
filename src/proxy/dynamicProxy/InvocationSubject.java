package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kun.ji on 17-8-13.
 */
public class InvocationSubject implements InvocationHandler{
    Subject target;

    public InvocationSubject(Subject subject){
        target = subject;
    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("log " + method.getName() +" ;"+ "invoked with " + objects);
        return method.invoke(target,objects);
    }
}

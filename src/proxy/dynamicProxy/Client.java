package proxy.dynamicProxy;


import java.lang.reflect.Proxy;

/**
 * Created by kun.ji on 17-8-13.
 * 代理模式
 */
public class Client {

    public static void main(String[] args) {
        dynamicProxy();
    }

    public static void dynamicProxy(){
        Subject realSubject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                new InvocationSubject(realSubject)
        );
        proxy.request(1);
    }


}

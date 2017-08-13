package proxy.staticProxy;


/**
 * Created by kun.ji on 17-8-13.
 * 代理模式
 */
public class Client {

    public static void main(String[] args) {
        Subject s = new Proxy(new RealSubject());
        s.request(3);
    }
}

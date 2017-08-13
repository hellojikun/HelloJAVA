package proxy.staticProxy;

/**
 * Created by kun.ji on 17-8-13.
 */
public class RealSubject implements Subject {

    public void request(int id) {
        System.out.println("RealSubject.request: " + id);
    }
}

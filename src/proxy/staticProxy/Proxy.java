package proxy.staticProxy;

/**
 * Created by kun.ji on 17-8-13.
 */

/**
 *  代理角色：保存一个引用使得代理可以访问实体，并且提供一个与Subject相同的接口，可以代替实体类
 *  常用代理：Remote Proxy, virtual Proxy,Protection Proxy Smart Reference
 */
public class Proxy implements Subject {

    private Subject target;

    public Proxy(Subject s){
        target = s;
    }

    public void request(int id) {
        System.out.println("Proxy log: " + id);
        target.request(id);
    }

    public void setTarget(Subject realSubject){
       target = realSubject;
    }
}

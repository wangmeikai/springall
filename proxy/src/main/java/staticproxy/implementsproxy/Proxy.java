package staticproxy.implementsproxy;

public class Proxy implements TargetInterface {
    private TargetInterface target;

    public Proxy(TargetInterface target) {
        this.target = target;
    }

    @Override
    public void query() {
        System.out.println("创建事务");
        target.query();
    }
}

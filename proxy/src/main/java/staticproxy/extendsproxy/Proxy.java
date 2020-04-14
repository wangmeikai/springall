package staticproxy.extendsproxy;

public class Proxy extends Target {
    @Override
    public void query() {
        System.out.println("创建事务");
        super.query();
    }
}

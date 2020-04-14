package staticproxy.implementsproxy;

public class test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Target());
        proxy.query();
    }
}

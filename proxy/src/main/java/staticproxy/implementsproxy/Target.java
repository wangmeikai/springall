package staticproxy.implementsproxy;

public class Target implements TargetInterface {
    public void query(){
        System.out.println("查询数据库");
    }
}

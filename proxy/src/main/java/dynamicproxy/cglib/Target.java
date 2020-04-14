package dynamicproxy.cglib;

public class Target {
    public void query(String s){
        System.out.println("查询数据库"+ s);
    }
}

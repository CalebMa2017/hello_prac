package java05;

public class Example05 {
    public static void main(String[] args) {
        BaseManager bm = new UserManager();
        bm.check("admin", "delete");
    }
}
abstract class BaseManager {
    public void check(String name, String method) {
        if("admin".equals(name)) {
            execute(method);
        }else {
            System.out.println("你没有权限执行此方法");
        }
    }
    public abstract void execute(String method);
}

class UserManager extends BaseManager {
    @Override
    public void execute(String method) {
        if("add".equals(method)) {
            System.out.println("执行添加方法");
        }else if("update".equals(method)) {
            System.out.println("执行更新方法");
        }else {
            System.out.println("没有此操作");
        }
    }
}
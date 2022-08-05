package java05;

public class Example09 {
    public static void main(String[] args) {
        Action actor = new Actor();
        actor.doAction();
        System.out.println("-------------------------------------");
        Action proxyAction = new ProxyAction(actor);
        proxyAction.doAction();
    }
}
class Actor implements Action {

    @Override
    public void doAction() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("演员在演戏...");
    }
}

class ProxyAction implements Action {
    public ProxyAction() {
    }

    public ProxyAction(Action action) {
        this.action = action;
    }
    private Action action;
    @Override
    public void doAction() {
        System.out.println("经纪人接戏...");
        System.out.println("经纪人安排档期...");
        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();
        System.out.println("演出一共耗时：" + (end-start) + "ms");
        System.out.println("经纪人收钱...");
    }
}
/**
 * 行动接口
 */
interface Action {
    void doAction();
}

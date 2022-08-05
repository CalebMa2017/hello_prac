package java04.example05;

import java.util.Arrays;
import java.util.zip.CheckedInputStream;

/**
 * 鸡舍管理类
 */
public class ChickenManager {
    private Chicken[] chickens = new Chicken[5];
    //代表当前鸡舍中鸡的数量
    private int count = 0;

    /**
     * 获取鸡舍中鸡的数量
     *
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     * 添加一只鸡
     *
     * @param chicken
     */
    public void add(Chicken chicken) {
        if (count == chickens.length) copyOf();
        chickens[count++] = chicken;
    }

    /**
     * 删除指定id的一只鸡
     * 若返回true即删除成功
     * 若返回false即没找到该id的鸡删除失败
     */
    public boolean deleteById(int id) {
        for (int i = 0; i < count; i++) {
            if (chickens[i].getId() == id) {
                for (int j = i + 1; j < count; j++) {
                    chickens[j - 1] = chickens[j];
                }
                chickens[--count] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * 根据颜色删除对应的一或多只鸡
     * 若没有删除返回false
     * 若或多只鸡删除返回true
     * @param color
     * @return
     */
    public boolean deleteByColor(String color) {
        boolean result = false;
        for (int i = 0; i < count; i++) {
            if (chickens[i].getColor().equals(color)) {
                for(int j = i + 1; j<count; j++) {
                    chickens[j-1] = chickens[j];
                }
                chickens[--count] = null;
                result = true;
            }
        }
        return result;
    }

    /**
     * 根据索引插入一只鸡
     * @param chicken
     * @param index
     * @return
     */
    public boolean insert(Chicken chicken, int index) {
        if(index > count || index < 0) return false;
        if(count == chickens.length) copyOf();
        for(int i = count -1 ; i >= index; i--) {
            chickens[i+1] = chickens[i];
        }
        chickens[index] = chicken;
        count++;
        return true;
    }

    /**
     * 根据id修改一只鸡
     * @param chicken
     * @param id
     * @return
     */
    public boolean updateById(Chicken chicken, int id) {
        for(int i = 0 ; i< count; i ++) {
            if(chickens[i].getId() == id) {
                chickens[i] = chicken;
                return true;
            }
        }
        return false;
    }

    /**
     * 根据id获取一只鸡
     * 若不存在该id的鸡，则返回null
     * @return
     */
    public Chicken getChickenById(int id) {
        for(Chicken chicken: chickens) {
            if(chicken.getId() == id) {
                return chicken;
            }
        }
        return null;
    }
    /**
     * 给鸡舍扩容
     */
    private void copyOf() {
        chickens = Arrays.copyOf(chickens, chickens.length + chickens.length / 2 + 1);
    }

    /**
     * 打印鸡舍中的所有小鸡
     */
    public void printAll() {
        for(int i = 0; i < count; i++) {
            System.out.println(chickens[i]);
        }
        System.out.println("---------------------------------------------------");
    }
}

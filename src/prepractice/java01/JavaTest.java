package prepractice.java01;

import prepractice.java01.fruit.Apple;
import prepractice.java01.fruit.Fruit;
import prepractice.java01.fruit.Orange;
import prepractice.java01.fruit.RedApple;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class JavaTest {
    @Test
    public void testFn() {
        Generic generic = new Generic();
        Integer i1 = 1;
        Integer i2 = (Integer) generic.genericMethod(i1);
        System.out.println("i2 = " + i2);
    }

    public void method01(Generic<Number> generic) {
        System.out.println("key = " + generic.getKey());
    }

    @Test
    public void testFn2() {
        Generic<Number> numberGeneric = new Generic<>(111);
        Generic<Integer> integerGeneric = new Generic<>(222);
        method01(numberGeneric);
//        method01(integerGeneric);  //编译期报错
    }

    @Test
    public void testFn3() {
        List<?>[] ls = new ArrayList<?>[10];
        List<String>[] ls2 = new ArrayList[10];
        Generic<?>[] g1 = new Generic<?>[11];
    }

    public void print1(Generic<? extends Apple> generic) {
        System.out.println(generic);
    }

    public void print2(Generic<? super Apple> generic) {
        System.out.println(generic);
    }
    @Test
    public void testFn4() {
        Generic<Apple> appleGeneric = new Generic<>(new Apple());
        Generic<RedApple> redAppleGeneric = new Generic<>(new RedApple());
        Generic<Fruit> fruitGeneric = new Generic<>(new Fruit());
        print1(appleGeneric);
        print1(redAppleGeneric);
        System.out.println("===========");
        print2(appleGeneric);
        print2(fruitGeneric);
        System.out.println("===========");
        List<Orange> orangeList = new ArrayList<>();
        orangeList.add(new Orange());
        orangeList.add(new Orange());
        orangeList.add(new Orange());
        print3(orangeList);
    }

    public void print3(List<? extends Fruit> fruitList) {
        for (Fruit fruit: fruitList) {
            System.out.println(fruit);
        }
    }
    @Test
    public void testFn5() {
        Orange o = new Orange();
        System.out.println(o);
    }

}

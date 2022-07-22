package prepractice.java01;

public class Entity2<T, K> implements Generator<T> {

    @Override
    public void say(T t) {
        System.out.println(t);
    }

    public void say2(T t, K k) {
        System.out.println(t);
        System.out.println(k);
    }


}

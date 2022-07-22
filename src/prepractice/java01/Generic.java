package prepractice.java01;

public class Generic<T> {

    private T key;

    public <T> T genericMethod(T t) {
        if(t instanceof Integer) {
            return (T)(Integer)(((Integer)t).intValue() + 1);
        }
        return t;
    }

    public T getKey() {
        return key;
    }

    public Generic() {

    }

    public Generic(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }

}

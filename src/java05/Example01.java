package java05;

public class Example01 {
    public static void main(String[] args) {

    }
}

class Book {
    protected String language = "Unknown";
    protected String read(Object name) throws Exception{
        return name + " read " + language;
    }
}
class EnglishBook extends Book{


    @Override
    public String read(Object name) throws RuntimeException{
        return name + "read" + language;
    }
}
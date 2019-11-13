public class TestSingleton {
    private static TestSingleton instance = null;
    protected TestSingleton(){
        // protected exists only to defeat instantiation
    }

    public  static TestSingleton getInstance(){
        // lazy initialization of singleton design pattern
        if(instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }
}


public class Singleton {

    // initializing
    private final static Singleton mInstance = new Singleton();

    // Prevent any other class from doing 'new Singleton()'
    private Singleton () {

    }


    // Caller to get to the Singleton
    // @return
    public static Singleton getInstance() {
        return mInstance;
    }

    
}

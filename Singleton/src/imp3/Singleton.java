package imp3;

public class Singleton
{
    private static Singleton uniqueInstance = new Singleton();

    private Singleton()
    {
    }

    public static Singleton getUniqueInstance()
    {
        return uniqueInstance;
    }
}
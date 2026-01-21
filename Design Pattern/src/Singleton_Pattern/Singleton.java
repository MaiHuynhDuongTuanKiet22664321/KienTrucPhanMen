package Singleton_Pattern;

public class Singleton {

    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data){
        Singleton result = instance;
        if(result == null){
            synchronized (Singleton.class){
                result = instance;
                if(result == null){
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

}

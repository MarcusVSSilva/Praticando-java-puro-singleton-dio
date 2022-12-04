package digitalinnovation;

/**
 * Singleton "Lazy Holder"
 * 
 * @author MarcusVSSilva
 */

public class SingletonLazyHolder {
    //encapsulamento da instancia
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}

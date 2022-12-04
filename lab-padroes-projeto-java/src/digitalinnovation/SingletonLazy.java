package digitalinnovation;

/**
 * Singleton "preguiçoso"
 * 
 * @author MarcusVSSilva
 * 
 */
public class SingletonLazy{
    //singleton possui uma instância dele mesmo
    private static SingletonLazy instancia;

    //construtor privado, garantindo que ninguém externamente instancie
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
package digitalinnovation;

/**
 * Singleton "apressado"
 * 
 * @author MarcusVSSilva
 */

public class SingletonEager {
    //singleton "apressado" já inicializa a instancia
    private static SingletonEager instancia = new SingletonEager();

    //construtor público, não permitindo a instanciação por classes externas
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}

import model.Funcionario;

/**
 * Básico Classe
 */
public class Main_1 {
    public static void main(String... args){
        Funcionario func = new Funcionario("Juliano", "Analista de sistemas", 24, 4);
        System.out.println(func.hello());
        System.out.println(func.getCargo());
        System.out.println(func);
    }
}

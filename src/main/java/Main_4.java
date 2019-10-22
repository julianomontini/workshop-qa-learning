import model.Funcionario;

public class Main_4 {
    public static void main(String... args){
        Funcionario f1 = new Funcionario("Juliano", "Analista de sistemas", 24, 4);
        Funcionario f2 = new Funcionario("Juliano", "Analista de sistemas", 24, 4);
        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
    }
}

import model.Funcionario;

public class Main_2 {
    public static void main(String... args){
        Funcionario f1 = new Funcionario("Juliano", "Analista de sistemas", 24, 4);
        Funcionario f2 = f1;
        f2.setIdade(42);
        System.out.println(f1.getIdade());
    }
}

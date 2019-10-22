import model.Funcionario;
import org.apache.commons.lang.SerializationUtils;

import java.util.ArrayList;
import java.util.List;

public class Main_3 {
    public static void main(String... args){
        Funcionario f1 = new Funcionario("Juliano", "Analista de sistemas", 24, 4);
        Funcionario f2 = new Funcionario("Juliano", "Analista de sistemas", 21, 4);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f1);
        funcionarios.add(f2);

        for(Funcionario f : funcionarios){
            f.setIdade(f.getIdade() + 2);
        }

        System.out.println(f1.getIdade());
        System.out.println(f2.getIdade());

        List<Funcionario> funcionarios2 = new ArrayList<>();
        funcionarios2.add((Funcionario) SerializationUtils.clone(f1));
        funcionarios2.add((Funcionario) SerializationUtils.clone(f2));

        for(Funcionario f : funcionarios2){
            f.setIdade(f.getIdade() + 2);
        }

        System.out.println(f1.getIdade());
        System.out.println(f2.getIdade());

    }
}

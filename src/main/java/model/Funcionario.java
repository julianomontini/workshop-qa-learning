package model;

import java.io.Serializable;
import java.util.Objects;

public class Funcionario implements Serializable {

    private String nome;
    private String cargo;
    private int idade;
    private Integer tempoExperiencia;

    public Funcionario(String nome, String cargo, int idade, Integer tempoExperiencia) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.tempoExperiencia = tempoExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(Integer tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }

    public String hello(){
        return String.format(
                "Olá, meu nome é %s, tenho %d anos e trabalho como %s a %d anos",
                this.nome, this.idade, this.getCargo(), this.getTempoExperiencia()
        );
    }

    @Override
    public String toString(){
        return String.format("Funcionário<Nome: %s, Idade: %d>", this.getNome(), this.getIdade());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return idade == that.idade &&
                nome.equals(that.nome) &&
                cargo.equals(that.cargo) &&
                tempoExperiencia.equals(that.tempoExperiencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cargo, idade, tempoExperiencia);
    }
}

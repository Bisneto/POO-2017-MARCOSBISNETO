package model;

public class Diretor extends Funcionario{

    private double salario;

    @Override
    public double getBonificacao() {
        return this.salario * 2 + 1000;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

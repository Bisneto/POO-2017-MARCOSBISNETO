package model;

public class gerenteRestaurante extends Funcionario {
    private double salario;

    @Override
    public double getBonificacao() {
        return this.salario * 2 + 100;
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


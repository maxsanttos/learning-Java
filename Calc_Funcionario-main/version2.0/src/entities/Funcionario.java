package entities;

public class Funcionario {
    private String name;
    private Double salario;
    private int qtdDependentes;

    public Funcionario(){}

    public Funcionario(String name, Double salario, int qtdDependentes) {
        this.name = name;
        this.salario = salario;
        this.qtdDependentes = qtdDependentes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getQtdDependentes() {
        return qtdDependentes;
    }

    public void setQtdDependentes(int qtdDependentes) {
        this.qtdDependentes = qtdDependentes;
    }

    private Double finallySalary(){
        double salarioFinal = salario * (qtdDependentes * 0.03) + salario;
        return  salarioFinal;
    }

    private Double familySalary(){
        double salarioFamilia = qtdDependentes * 134.98;
        return salarioFamilia;
    }

    private Double salaryReceived(){
       double salarioRecebido = familySalary() + finallySalary();
       return salarioRecebido;
       
    }

    public String toString(){
        return "NOME: "
                + getName()
                + "\n"
                + "Salary: "
                + String.format("%.2f",salario)
                + "\n"
                + "Quantidade de Depententes: "
                + getQtdDependentes()
                + "\n"
                + "Total do Salario Família: "
                + String.format("%.2f",familySalary())
                +"\n"
                + "Salário final: "
                +String.format("%.2f",finallySalary())
                + "\n"
                + "Salario Recebido: "
                + String.format("%.2f",salaryReceived())
                + "\n";
    }

}

import java.util.ArrayList;

public abstract class Funcionario extends Pessoa implements IFuncionario {
    private String cargo;
    private double salario;
    private double saldoBancario;
    private static ArrayList<Funcionario> registroFuncionarios = new ArrayList<>();

    public Funcionario(String nome, String cargo, double salario) {
        super(nome);
        this.cargo = cargo;
        this.salario = salario;
        this.saldoBancario = 0;
    }

    public static ArrayList<Funcionario> getRegistroFuncionarios() {
        return registroFuncionarios;
    }

    @Override
    public void adicionarAoRegistro() {
        registroFuncionarios.add(this);
    }

    @Override
    public void receberBonus(double bonus) {
        setSaldoBancario(getSaldoBancario() + bonus);
    }

    @Override
    public void listarFuncionarios() {
        for (Funcionario funcionario : registroFuncionarios) {
            System.out.println(funcionario.getNome() + " - " + funcionario.cargo);
        }
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    
    public void setSalario(double salario) throws SalarioNegativoException {
        if (salario < 0) {
            throw new SalarioNegativoException("O salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    public void setSalario(double salario, double incrementoPercentual) throws SalarioNegativoException {
        double salarioIncrementado = salario + salario * incrementoPercentual / 100;
        setSalario(salarioIncrementado);  
    }

    public double getSaldoBancario() {
        return saldoBancario;
    }

    public void setSaldoBancario(double saldoBancario) {
        this.saldoBancario = saldoBancario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
               "nome='" + getNome() + '\'' +
               ", cargo='" + cargo + '\'' +
               ", salario=" + salario +
               ", saldoBancario=" + saldoBancario +
               '}';
    }
    
}

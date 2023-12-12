import java.util.ArrayList;

public class Desenvolvedor extends Funcionario {
    private int idade;
    private String nivelDeHabilidade; // Exemplo: Junior, Pleno, Sênior
    private static ArrayList<Funcionario> registroFuncionarios = new ArrayList<>();

    public Desenvolvedor(String nome, String cargo, double salario, int idade, String nivelDeHabilidade) throws DadosInvalidosException {
        super(nome, cargo, salario);
        setIdade(idade); // Usando o setter para aplicar a validação
        setNivelDeHabilidade(nivelDeHabilidade); // Usando o setter para aplicar a validação
        registroFuncionarios.add(this); // Adiciona o desenvolvedor ao registro na criação
    }

    // Getters
    public int getIdade() {
        return idade;
    }

    public String getNivelDeHabilidade() {
        return nivelDeHabilidade;
    }

    // Setters com validação
    public void setIdade(int idade) throws DadosInvalidosException {
        if (idade < 18) {
            throw new DadosInvalidosException("Idade do desenvolvedor deve ser maior ou igual a 18 anos.");
        }
        this.idade = idade;
    }

    public void setNivelDeHabilidade(String nivelDeHabilidade) throws DadosInvalidosException {
        if (!(nivelDeHabilidade.equals("Junior") || nivelDeHabilidade.equals("Pleno") || nivelDeHabilidade.equals("Senior"))) {
            throw new DadosInvalidosException("Nível de habilidade inválido. Deve ser 'Junior', 'Pleno' ou 'Senior'.");
        }
        this.nivelDeHabilidade = nivelDeHabilidade;
    }

    @Override
    public String toString() {
        return String.format(
            "Desenvolvedor [Nome: %s, Cargo: %s, Salário: %.2f, Saldo Bancário: %.2f, Idade: %d, Nível de Habilidade: %s]",
            getNome(), getCargo(), getSalario(), getSaldoBancario(), idade, nivelDeHabilidade);
    }

    @Override
    public void receberBonus(double bonus) {
        setSaldoBancario(getSaldoBancario() + bonus);
    }
}

    import java.util.ArrayList;

    public class CEO extends Funcionario {
        private static ArrayList<Funcionario> registroFuncionarios = Funcionario.getRegistroFuncionarios();

        public CEO(String nome, double salario) throws CEOInvalidExeception {
            super(nome, "CEO", salario);
            if (salario < 0) {
                throw new CEOInvalidExeception("O salário não pode ser negativo.");
            }
            registroFuncionarios.add(this);
        }

        public void enviarSalario(Funcionario funcionario, double valor) throws CEOInvalidExeception {
            if (valor < 0) {
                throw new CEOInvalidExeception("Valor para enviar não pode ser negativo.");
            }

            if (funcionario != null) {
                funcionario.setSaldoBancario(funcionario.getSaldoBancario() + valor);
            }
        }


        public void enviarSalario(Funcionario funcionario, double valor, double bonus) throws CEOInvalidExeception {
            if (valor < 0 || bonus < 0) {
                throw new CEOInvalidExeception("Valor para enviar não pode ser negativo.");
            }
    
            if (funcionario != null) {
                funcionario.setSaldoBancario(funcionario.getSaldoBancario() + valor + bonus);
            }
        }

        public void receberSalario(double valor) {
            this.setSaldoBancario(this.getSaldoBancario() + valor);
        }

        public void excluirFuncionario(Funcionario funcionario) {
            registroFuncionarios.remove(funcionario);
        }

        @Override
        public String toString() {
            return String.format(
                "CEO [Nome: %s, Saldo Bancário: %.2f]",
                getNome(), getSaldoBancario());
        }

        @Override
        public void listarFuncionarios() {
            for (Funcionario funcionario : getRegistroFuncionarios()) {
                System.out.println(funcionario);
            }
        }


        
        @Override
        public String getNome() {
            return super.getNome();
        }

        @Override
        public String getCargo() {
            return super.getCargo();
        }

        @Override
        public double getSalario() {
            return super.getSalario();
        }

        @Override
        public double getSaldoBancario() {
            return super.getSaldoBancario();
        }

        @Override
        public void setNome(String nome) {
            super.setNome(nome);
        }

        @Override
        public void setCargo(String cargo) {
            super.setCargo(cargo);
        }

        @Override
        public void setSalario(double salario) throws SalarioNegativoException {
        try {
            super.setSalario(salario);
        } catch (SalarioNegativoException e) {
            System.out.println("Erro ao definir o salário: " + e.getMessage());
            }
        }


        @Override
        public void setSaldoBancario(double saldoBancario) {
            super.setSaldoBancario(saldoBancario);
        }

        
    }



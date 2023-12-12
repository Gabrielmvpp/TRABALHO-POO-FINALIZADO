public class Main {
    public static void main(String[] args) {
        try {
            CEO ceo = new CEO("Sergio Banhos", 15000);
            Desenvolvedor dev1 = new Desenvolvedor("Ana", "Desenvolvedor", 5000, 25, "Senior");
            Desenvolvedor dev2 = new Desenvolvedor("Gab", "Desenvolvedor", 10000, 23, "Senior");
            
            ceo.setSalario(5000);
            ceo.enviarSalario(dev1, 5000);
            ceo.enviarSalario(dev2, 10000);

            ceo.listarFuncionarios();

            ClientePublico clientePub = new ClientePublico("Cidade Maranguape", "Contrato A", 20000, "Licitação liberada pelo Governo Federal", "CE", "SARTO NOSSO PREFEITO CHANCELER");
            ClienteParticular clientePar = new ClienteParticular("Empresa JUNGLE", "Contrato B", 50000, 1000000, "Nugget");

            clientePub.listarClientes();
            clientePar.listarClientes();

            System.out.println();
            System.out.println(ceo);
            System.out.println();
            System.out.println(dev1);
            System.out.println();
            System.out.println(dev2);
            System.out.println();
            System.out.println(clientePub);
            System.out.println();
            System.out.println(clientePar);

        } catch (CEOInvalidExeception | DadosInvalidosException | SalarioNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

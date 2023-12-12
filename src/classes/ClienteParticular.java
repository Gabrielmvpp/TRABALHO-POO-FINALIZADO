public class ClienteParticular extends Cliente {
    private double valuation;
    private String donoEmpresa;

    public ClienteParticular(String nome, String contrato, double valorContrato,
        double valuation, String donoEmpresa) {
        super(nome, contrato, valorContrato);
        this.valuation = valuation;
        this.donoEmpresa = donoEmpresa;
    }

        // Getters
    public double getValuation() {
        return valuation;
    }

    public String getDonoEmpresa() {
        return donoEmpresa;
    }

    // Setters
    public void setValuation(double valuation) throws ValorContratoInvalidoException {
        if (valuation < 0) {
            throw new ValorContratoInvalidoException("O valuation não pode ser negativo.");
        }
        this.valuation = valuation;
    }

    public void setDonoEmpresa(String donoEmpresa) {
        this.donoEmpresa = donoEmpresa;
    }


    @Override
    public String toString() {
        return String.format(
            "Cliente Particular [Nome: %s, Contrato: %s, Valor do Contrato: %.2f, Valuation: %.2f, Dono da Empresa: %s]",
            getNome(), getContrato(), getValorContrato(), valuation, donoEmpresa);
    }

}
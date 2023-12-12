public class ClientePublico extends Cliente {
    private String licitacao;
    private String estado;
    private String prefeito;

    public ClientePublico(String nome, String contrato, double valorContrato,
                          String licitacao, String estado, String prefeito) {
        super(nome, contrato, valorContrato);
        this.licitacao = licitacao;
        this.estado = estado;
        this.prefeito = prefeito;
    }


    public void setValorContrato(double valorContrato) throws ValorContratoInvalidoException {
        if (valorContrato < 0) {
            throw new ValorContratoInvalidoException("O valor do contrato não pode ser negativo.");
        }
        this.valorContrato = valorContrato;
    }


        // Getters
    public String getLicitacao() {
        return licitacao;
    }

    public String getEstado() {
        return estado;
    }

    public String getPrefeito() {
        return prefeito;
    }

    // Setters
    public void setLicitacao(String licitacao) {
        this.licitacao = licitacao;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrefeito(String prefeito) {
        this.prefeito = prefeito;
    }



    @Override
    public String toString() {
        return String.format(
            "Cliente Público [Nome: %s, Contrato: %s, Valor do Contrato: %.2f, Licitação: %s, Estado: %s, Prefeito: %s]",
            getNome(), getContrato(), getValorContrato(), licitacao, estado, prefeito);
    }

}
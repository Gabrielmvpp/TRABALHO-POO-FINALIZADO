import java.util.ArrayList;

public abstract class Cliente extends Pessoa implements ICliente {
    private String contrato;
    protected double valorContrato;
    private static ArrayList<Cliente> registroClientes = new ArrayList<>();

    public Cliente(String nome, String contrato, double valorContrato) {
        super(nome);
        this.contrato = contrato;
        this.valorContrato = valorContrato;
    }


    @Override
    public void adicionarAoRegistro() {
        registroClientes.add(this);
    }

    @Override
    public void listarClientes() {
        for (Cliente cliente : registroClientes) {
            System.out.println(cliente.getNome());
        }
    }


    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) throws ValorContratoInvalidoException {
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "nome='" + getNome() + '\'' +
               ", contrato='" + contrato + '\'' +
               ", valorContrato=" + valorContrato +
               '}';
    }


}

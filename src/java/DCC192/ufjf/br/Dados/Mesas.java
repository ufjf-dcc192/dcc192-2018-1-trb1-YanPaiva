package DCC192.ufjf.br.Dados;
        
public class Mesas {
    private int codigo;
    private String descricao;
    private String horaAbertura;
    private String horaFechamento;
    private boolean status = false;

    public Mesas() {
    }

    public Mesas(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        status = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}

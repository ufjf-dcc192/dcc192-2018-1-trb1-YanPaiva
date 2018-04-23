package DCC192.ufjf.br.Dados;

import java.util.ArrayList;
import java.util.List;

public class Mesas {

    private int codigo;
    private String descricao;
    private String horaAbertura;
    private String horaFechamento;
    private boolean status = false;
    private List<Itens> pedido;

    public Mesas() {
    }

    public Mesas(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        status = true;
        pedido = new ArrayList<>();
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

    public void addPedido(ArrayList<Itens> novosPedidos) {
        if (pedido.size() == 0) {
            this.pedido = novosPedidos;
        } else {
            for (int i = 0; i < novosPedidos.size(); i++) {
                pedido.add(novosPedidos.get(i));
            }
        }
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

    public String getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(String horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

}

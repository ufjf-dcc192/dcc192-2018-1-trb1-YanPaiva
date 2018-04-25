package DCC192.ufjf.br.Dados;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Mesas {


    private int codigo;
    private String horaAbertura;
    private String horaFechamento;
    private boolean status = false;
    private static ArrayList<Itens> pedido;

    public Mesas() {
    }

    public Mesas(int codigo) {
        this.codigo = codigo;
    //    pedido = new ArrayList<>();
        this.horaAbertura= "--";
        this.horaFechamento ="--";
    }
    public double valorConsumo(){
        double valor = 0.0;
        for(int i=0; i<pedido.size();i++){
            valor+=(pedido.get(i).getPreco()*pedido.get(i).getQuantidade());
        }
        return valor;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Itens> getPedido() {
        return pedido;
    }
    public void addPedido(ArrayList<Itens> novosPedidos) {
        if (pedido == null) {
            this.pedido = novosPedidos;
        } else {
            for (int i = 0; i < novosPedidos.size(); i++) {
                pedido.add(novosPedidos.get(i));
            }
        }
    }

    public String mesaLivre(){
        return (status?"não, mesa ocupada":"sim, mesa livre");
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

    public void setHoraAbertura() {
        this.horaAbertura = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                                    .format(System.currentTimeMillis()); 
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

}

package DCC192.ufjf.br.Dados;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Mesas {


    private int id;
    private String horaAbertura;
    private String horaFechamento;
    private boolean status = false;
    private ArrayList<Itens> pedido;

    public Mesas() {
        this.id = Restaurante.getMesasRestaurante().size();
        pedido = new ArrayList<>();
        this.horaAbertura= "--";
        this.horaFechamento ="--";
    }

    public Mesas(int id) {
        this.id = id;
        pedido = new ArrayList<>();
        this.horaAbertura= "--";
        this.horaFechamento ="--";
    }
    public double valorConsumo(){
        double valor = 0.0;
        for(int i=0; i<pedido.size();i++){
            if(pedido.get(i).getQuantidade()!=null){
                valor+=(pedido.get(i).getPreco()*pedido.get(i).getQuantidade());
            }else{
                return 0.0;
            }
        }
        return valor;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Itens> getPedido() {
        return pedido;
    }
    public void addPedido(ArrayList<Itens> novosPedidos) {
        if (pedido == null) {
            pedido = new ArrayList<Itens>();
        }
        for (int i = 0; i < novosPedidos.size(); i++) {
            if(!pedido.equals(novosPedidos.get(i))){
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

    public void mesaReaberta(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }
    public void setHoraFechamento() {
        this.horaFechamento = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                                    .format(System.currentTimeMillis()); 
    }

}

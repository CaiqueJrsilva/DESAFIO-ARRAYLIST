import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Cartao  {
    private double limite;
    private double saldo;
    private String bandeira;
    private String banco;
    private List<Compras>comprasList;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;


        this.comprasList = new ArrayList<>();

    }
    public boolean lancaCompra(Compras compra){
        if(this.saldo > compra.getValor()){;
            this.saldo -= compra.getValor();
            this.comprasList.add(compra);
            return true;
        }else {
            return false;
        }
    }



    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getComprasList() {
        return comprasList;
    }


}

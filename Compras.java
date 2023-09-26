public class Compras implements Comparable<Compras> {
    private String Descricao;
    private Double valor;

    public Compras(String descricao, Double valor) {
        Descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras : Descricao='" + Descricao  +
                " valor =" + valor + '}';
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}

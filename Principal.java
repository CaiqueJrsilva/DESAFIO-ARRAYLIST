import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartao :");
        double limite = leitura.nextDouble();
        var cartao = new Cartao(limite);

        int sair = 1;
        while (sair !=0)
        {
            System.out.println("Digite a descrição da compra");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra : ");
            double valor = leitura.nextDouble();

            Compras compra = new Compras(descricao,valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compra realizada com sucesso !!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            }else{
                System.out.println("Saldo insuficiente !!");
                sair = 0;
            }
        }

        System.out.println("********************");
        System.out.println("Compras realizadas");

        for(Compras cr: cartao.getComprasList()){
            System.out.println(cartao.getComprasList()+" - "+ cr.getValor());
        }
        System.out.println("\n********************");
        System.out.println("\nSaldo do cartão:"+cartao.getSaldo());


    }
}

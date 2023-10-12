package pedido;

public class main {
    public static void main(String[] args) {
        pedido pedido = new pedido();

        double valorPedido1 = pedido.calcularValorPedido("sopa de fideo", "soda");
        double valorPedido2 = pedido.calcularValorPedido("carne a la plancha", "churrasco", "cocacola");
        double valorPedido3 = pedido.calcularValorPedido("Ensalada", "Pescado", "Agua", "pastel");
        double valorPedido4 = pedido.calcularValorPedido("chicharron al horno", "chicha");

        System.out.println("precio del Pedido uno: $" + valorPedido1);
        System.out.println("precio del Pedido dos: $" + valorPedido2);
        System.out.println("precio del Pedido tres: $" + valorPedido3);
        System.out.println("precio del Pedido cuatro: $" + valorPedido4);
        
    }
}
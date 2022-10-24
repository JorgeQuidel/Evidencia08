import java.util.ArrayList;

public class Cuenta {
	private Cliente cliente;
	private CarritoDeCompras carritoDeCompras;
	private ArrayList<MedioDePago> mediosDePago = new ArrayList<MedioDePago>();
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
}
import java.util.ArrayList;

public class Pedido {
	private Cuenta cuenta;
	private ArrayList<MedioDePago> mediosDePago = new ArrayList<MedioDePago>();
	private EstadoDePedido estado;
	private ArrayList<FamiliaDeProductos> familiasDeProductos = new ArrayList<FamiliaDeProductos>();
}
package builder.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoVendaBuilder {

	private PedidoVenda instancia;

	public PedidoVendaBuilder() {
		this.instancia = new PedidoVenda();
	}
	
	public PedidoVendaBuilder comComClienteVip(String nome) {
		definirCliente(nome, true);
		return this;
	}
	
	private void definirCliente(String nome, boolean vip) {
		Cliente cliente = new Cliente();
		cliente.setVip(vip);
		cliente.setNome(nome);
		this.instancia.setCliente(cliente);
	}
	
	public PedidoVendaBuilder comClienteNormal(String nome) {
		definirCliente(nome, false);
		return this;
	}
	
	public PedidoVendaBuilder comItem(String nome, int quantidade, String valorUnitario) {
		ItemPedido item = new ItemPedido();
		item.setNome(nome);
		item.setValorUnitario(new BigDecimal(valorUnitario));
		item.setQuantidade(quantidade);
		
		if(this.instancia.getIntensPedido() == null) {
			this.instancia.setIntensPedido(new ArrayList<ItemPedido>());
		}
		
		this.instancia.getIntensPedido().add(item);
		return this;
	}
	
	public PedidoVenda builder() {
		return this.instancia;
	}
	
	
}

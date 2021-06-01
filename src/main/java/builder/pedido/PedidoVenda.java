package builder.pedido;

import java.math.BigDecimal;
import java.util.List;

public class PedidoVenda {

	private String numero;
	private Cliente cliente;
	private List<ItemPedido> intensPedido;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getIntensPedido() {
		return intensPedido;
	}

	public void setIntensPedido(List<ItemPedido> intensPedido) {
		this.intensPedido = intensPedido;
	}

	public BigDecimal getValorTotal() {
		BigDecimal valorTotal = BigDecimal.ZERO;

		for (ItemPedido item : intensPedido) {
			valorTotal = valorTotal.add(item.getValorUnitario().multiply(new BigDecimal(item.getQuantidade())));
		}

		// Se o cliente é vip, 4% de desconto
		if (cliente.isVip()) {
			valorTotal = valorTotal.multiply(new BigDecimal("0.96"));
		}
		return valorTotal;
	}
}

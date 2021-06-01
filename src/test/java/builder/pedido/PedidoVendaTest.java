package builder.pedido;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PedidoVendaTest {
	
	//Metodo sem o builder
	@Test
	public void calcularValorTotalPedidoParaClienteVip() {
		
		PedidoVenda pedidoVenda = new PedidoVenda();
		Cliente cliente = new Cliente();
		cliente.setNome("João");
		cliente.setVip(true);
		pedidoVenda.setCliente(cliente);
		
		ItemPedido item1 = new ItemPedido();
		item1.setNome("Calculadora");
		item1.setValorUnitario(new BigDecimal("200"));
		item1.setQuantidade(2);
		
		ItemPedido item2 = new ItemPedido();
		item2.setNome("Mochila");
		item2.setValorUnitario(new BigDecimal("200"));
		item2.setQuantidade(1);
		
		List<ItemPedido> itensPedido = Arrays.asList(item1, item2);
		pedidoVenda.setIntensPedido(itensPedido);
		
		assertEquals(new BigDecimal("576").doubleValue(), pedidoVenda.getValorTotal().doubleValue(), 0.0001);
		
	}
	
	
	@Test
	public void calcularValorTotalPedidoParaClienteVipComBuilder() {
		
		PedidoVenda pedidoVenda = new PedidoVendaBuilder().comComClienteVip("Joao")
				.comItem("Calculadora", 2, "200")
				.comItem("Mochila", 1, "200")
				.builder();
		
		BigDecimal valorTotal = pedidoVenda.getValorTotal();
		
		assertEquals(new BigDecimal("576").doubleValue(), valorTotal.doubleValue(), 0.0001);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			

}

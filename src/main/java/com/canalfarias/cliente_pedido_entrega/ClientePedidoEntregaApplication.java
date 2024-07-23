package com.canalfarias.cliente_pedido_entrega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePedidoEntregaApplication {
	@GetMapping
	public String getHomeTeste() {
		return "Cliente Pedido Entrega - API Home";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientePedidoEntregaApplication.class, args);
	}

}

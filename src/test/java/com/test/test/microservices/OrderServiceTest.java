package com.test.test.microservices;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    @Test
    public void testCalculateTotal() {
        // Arrange: Creamos un pedido con ítems conocidos
        Order order = new Order();
        order.addItem(new Item("Producto A", 1000.0));
        order.addItem(new Item("Producto B", 2000.0));
        order.addItem(new Item("Producto C", 500.0));

        OrderService orderService = new OrderService();

        // Act: Calculamos el total
        double resultado = orderService.calculateTotal(order);

        // Assert: Verificamos el cumplimiento del requerimiento
        // El total esperado es 3500.0
        assertEquals(3500.0, resultado,
                "El total del pedido no coincide con la suma esperada de los ítems.");
    }
}
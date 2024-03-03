package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderRepositoryTest {
    OrderRepository orderRepository = new OrderRepository();

    @Test
    void espresso() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList()));
            assertEquals(receipt.cost(), 1.34, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void darkRoast() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Dark roast", Arrays.asList()));
            assertEquals(receipt.cost(), 1.99, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void decaf() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList()));
            assertEquals(receipt.cost(), 1.28, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void houseBlend() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("House blend", Arrays.asList()));
            assertEquals(receipt.cost(), 1.65, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void espressoMilk() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList("Milk")));
            assertEquals(receipt.cost(), 1.74, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void espressoWhip() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList("Whip")));
            assertEquals(receipt.cost(), 1.59, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void espressoSoy() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList("Soy")));
            assertEquals(receipt.cost(), 1.61, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void espressoMocha() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Espresso", Arrays.asList("Mocha")));
            assertEquals(receipt.cost(), 1.64, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void houseBlendMilk() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("House Blend", Arrays.asList("Milk")));
            assertEquals(receipt.cost(), 2.05, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void houseBlendWhip() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("House Blend", Arrays.asList("Whip")));
            assertEquals(receipt.cost(), 1.90, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void houseBlendSoy() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("House Blend", Arrays.asList("Soy")));
            assertEquals(receipt.cost(), 1.92, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void houseBlendMocha() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("House Blend", Arrays.asList("Mocha")));
            assertEquals(receipt.cost(), 1.95, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void decafMilk() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList("Milk")));
            assertEquals(receipt.cost(), 1.68, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void decafWhip() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList("Whip")));
            assertEquals(receipt.cost(), 1.53, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void decafSoy() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList("Soy")));
            assertEquals(receipt.cost(), 1.55, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void decafMocha() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Decaf", Arrays.asList("Mocha")));
            assertEquals(receipt.cost(), 1.58, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void darkRoastMilk() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Milk")));
            assertEquals(receipt.cost(), 2.39, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void darkRoastWhip() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Whip")));
            assertEquals(receipt.cost(), 2.24, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void darkRoastSoy() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Soy")));
            assertEquals(receipt.cost(), 2.26, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void darkRoastMocha() {
        try {
            Receipt receipt = orderRepository.add(new OrderData("Dark Roast", Arrays.asList("Mocha")));
            assertEquals(receipt.cost(), 2.29, 0.0001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

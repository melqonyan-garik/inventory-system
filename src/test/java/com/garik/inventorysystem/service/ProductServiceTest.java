package com.garik.inventorysystem.service;

import com.garik.inventorysystem.model.Product;
import com.garik.inventorysystem.repo.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        // Arrange
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Product 1");
        product1.setDescription("Description 1");
        product1.setPrice(20.0);
        product1.setQuantity(5);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Product 2");
        product2.setDescription("Description 2");
        product2.setPrice(25.0);
        product2.setQuantity(10);

        List<Product> products = Arrays.asList(product1, product2);

        when(productRepository.findAll()).thenReturn(products);

        // Act
        List<Product> result = productService.getAllProducts();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Product 1", result.get(0).getName());
        assertEquals("Product 2", result.get(1).getName());

        verify(productRepository, times(1)).findAll();
    }

    @Test
    public void testAddProduct() {
        // Arrange
        Product product = new Product();
        product.setName("New Product");
        product.setDescription("New Description");
        product.setPrice(30.0);
        product.setQuantity(15);

        // Act
        productService.addProduct(product);

        // Assert
        verify(productRepository, times(1)).save(product);
    }

    @Test
    public void testUpdateProduct() {
        // Arrange
        Product existingProduct = new Product();
        existingProduct.setId(1L);
        existingProduct.setName("Existing Product");
        existingProduct.setDescription("Existing Description");
        existingProduct.setPrice(40.0);
        existingProduct.setQuantity(20);

        when(productRepository.save(any())).thenReturn(existingProduct);

        // Act
        productService.updateProduct(existingProduct);

        // Assert
        verify(productRepository, times(1)).save(existingProduct);
    }
}

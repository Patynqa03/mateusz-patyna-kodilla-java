package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        // Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");

        Item item1 = new Item(product1, new BigDecimal("100"), 2);
        Item item2 = new Item(product2, new BigDecimal("50"), 3);

        Invoice invoice = new Invoice("INV-2023/001");
        invoice.addItem(item1);
        invoice.addItem(item2);

        // When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);

        int invoiceId = invoice.getId();
        int product1Id = product1.getId();
        int product2Id = product2.getId();

        // Then
        assertEquals(1, invoiceId);
        assertEquals(1, product1Id);
        assertEquals(2, product2Id);

        // Clean up
        invoiceDao.deleteById(invoiceId);
        productDao.deleteById(product1Id);
        productDao.deleteById(product2Id);
    }
}
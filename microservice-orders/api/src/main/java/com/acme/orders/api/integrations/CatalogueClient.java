package com.microservice.orders.api.integrations;

import com.microservice.orders.api.integrations.lib.catalogue.Product;

public interface CatalogueClient {

    Product findProductById(String id);
}

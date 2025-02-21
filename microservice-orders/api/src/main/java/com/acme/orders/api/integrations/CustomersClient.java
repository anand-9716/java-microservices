package com.microservice.orders.api.integrations;

import com.microservice.customers.lib.v1.Customer;
import com.microservice.orders.api.rest.v1.auth.User;

public interface CustomersClient {

    Customer findCustomerById(String id, User user);
}

package com.microservice.orders.api.integrations;

import com.microservice.orders.api.models.db.OrderEntity;
import com.microservice.payments.lib.Transaction;

public interface PaymentsClient {

    Transaction createTransaction(OrderEntity order);
}

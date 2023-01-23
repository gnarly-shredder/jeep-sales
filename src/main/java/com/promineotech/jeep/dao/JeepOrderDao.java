package com.promineotech.jeep.dao;

import javax.validation.constraints.NotNull;
import com.promineotech.jeep.entity.Customer;
import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;

public interface JeepOrderDao {

  Customer fetchCustomer(String Customer);

}
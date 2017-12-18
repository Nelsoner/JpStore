package com.JppStore.order.service;

import com.JppStore.common.utils.E3Result;
import com.JppStore.order.pojo.OrderInfo;

public interface OrderService {

	E3Result createOrder(OrderInfo orderInfo);
}

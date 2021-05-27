package com.coinex.api.client.model.market;

/**
 * @author xingyi
 */
public class UserTrade extends Trade {
    private Long orderId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}

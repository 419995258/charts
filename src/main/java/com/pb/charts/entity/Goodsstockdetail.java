package com.pb.charts.entity;

import java.math.BigDecimal;

public class Goodsstockdetail extends GoodsstockdetailKey {
    private BigDecimal qty;

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }
}
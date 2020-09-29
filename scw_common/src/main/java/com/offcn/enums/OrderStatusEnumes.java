package com.offcn.enums;

/**
 * 订单状态的枚举类
 */
public enum OrderStatusEnumes {
    UNPAY((byte)0,"未支付"),
    CANCEL((byte)1,"已取消"),
    PAYED((byte)2,"支付成功"),
    WAITING((byte)3,"等待发货"),
    SEND((byte)4,"已发货"),
    SENDED((byte)5,"已送达"),
    SUCCESS((byte)6,"交易完成"),
    FAIL((byte)7,"交易未完成");

    private byte code;
    private String status;

    OrderStatusEnumes(byte code, String status) {
        this.code = code;
        this.status = status;
    }

    public byte getCode() {
        return code;
    }

    public void setCode(byte code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

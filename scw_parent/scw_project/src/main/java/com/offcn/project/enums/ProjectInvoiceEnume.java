package com.offcn.project.enums;

public enum ProjectInvoiceEnume {
    NO_FP((byte) 0, "不开发票"),
    HAVE_FP((byte) 1, "开发票");

    private byte code;
    private String type;

    ProjectInvoiceEnume(byte code, String type) {
        this.code = code;
        this.type = type;
    }

    public byte getCode() {
        return code;
    }

    public void setCode(byte code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

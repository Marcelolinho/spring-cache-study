package com.mpp.cache.entities.enums;

import lombok.Getter;

@Getter
public enum SizeSKUEnum {
    SIZE_33("33"),
    SIZE_34("34"),
    SIZE_35("35"),
    SIZE_36("36"),
    SIZE_37("37"),
    SIZE_38("38"),
    SIZE_39("39"),
    SIZE_40("40"),
    SIZE_41("41"),
    SIZE_42("42"),
    SIZE_43("43"),
    SIZE_44("44"),
    SIZE_45("45"),
    SIZE_46("46"),
    U("U"),
    PP("PP"),
    P("P"),
    M("M"),
    G("G"),
    GG("GG");

    private final String value;

    SizeSKUEnum(String value) {
        this.value = value;
    }
}

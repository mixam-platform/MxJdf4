package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SubProductType {
    INVALID(0),
    PRODUCT_HARD_COVER_BOOKS(100001),
    PRODUCT_PAPERBACK_BOOKS(100002),
    PRODUCT_PERFECT_BOOKLETS(100003),
    PRODUCT_WIRO_BOOKLETS(100004),
    PRODUCT_LOOP_BOOKLETS(100005),
    PRODUCT_STAPLED_BOOKLETS(100006),
    PRODUCT_MAGAZINES(100007),
    PRODUCT_CATALOGS(100008),
    PRODUCT_BOOKLETS(100009),
    PRODUCT_ZINES(100010),
    PRODUCT_COMIC_BOOKS(100011),
    PRODUCT_ART_PRINTS(100012),
    PRODUCT_MANGA(100013);

    private final int value;

    SubProductType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    public static SubProductType forCode(int code) {
        for (SubProductType element : values()) {
            if (element.value == code) {
                return element;
            }
        }
        return null;
    }

    @JsonCreator
    public static SubProductType forValue(String v) {
        return SubProductType.forCode(Integer.parseInt(v));
    }
}

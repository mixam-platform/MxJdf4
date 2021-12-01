package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SubProductType {
    INVALID(0),
    PRODUCT_HARD_COVER_BOOKS(1),
    PRODUCT_PAPERBACK_BOOKS(2),
    PRODUCT_PERFECT_BOOKLETS(3),
    PRODUCT_WIRO_BOOKLETS(4),
    PRODUCT_LOOP_BOOKLETS(5),
    PRODUCT_STAPLED_BOOKLETS(6),
    PRODUCT_MAGAZINES(7),
    PRODUCT_CATALOGS(8),
    PRODUCT_BOOKLETS(9),
    PRODUCT_ZINES(10),
    PRODUCT_COMIC_BOOKS(11),
    PRODUCT_ART_PRINTS(12),
    PRODUCT_MANGA(13),
    PRODUCT_WEDDING_BOOK(14),
    PRODUCT_YEARBOOK(15),
    PRODUCT_COOKBOOK(16),
    PRODUCT_COLOURINGBOOK(17),
    PRODUCT_ARTBOOK(18),
    PRODUCT_GRAPHIC_NOVEL(19),
    PRODUCT_LOOKBOOK(20),
    PRODUCT_DIARIES(21),
    PRODUCT_JOURNALS(22);


    private final int value;

    SubProductType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}

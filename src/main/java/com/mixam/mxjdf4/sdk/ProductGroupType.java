package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProductGroupType {
    INVALID(0),
    PRODUCT_BROCHURES(1),
    PRODUCT_FLYERS(2),
    PRODUCT_FOLDED(3),
    PRODUCT_POSTERS(4),
    PRODUCT_LETTERHEADS(5),
    PRODUCT_PHOTO_BOOK(6),
    PRODUCT_BOOK(7),
    PRODUCT_BUSINESS_CARD(8),
    PRODUCT_POSTCARD(9),
    PRODUCT_GREETING_CARD(10),
    PRODUCT_NOTE_BOOK(11),
    PRODUCT_COMPLIMENT_SLIPS(12),
    PRODUCT_ENVELOPES(13),
    PRODUCT_FOLDERS(14),
    PRODUCT_LAYFLAT(15),
    PRODUCT_WALL_CALENDARS(16),
    PRODUCT_DESK_CALENDARS(17),
    PRODUCT_VR_WALL_CALENDARS(18),
    PRODUCT_VR_DESK_CALENDARS(19),
    PRODUCT_TRADITIONAL_BOOK(20),
    PRODUCT_CANVAS(21),
    ;

    private final int value;

    ProductGroupType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}

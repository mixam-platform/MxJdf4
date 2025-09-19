package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MaterialType {

    INVALID(0),
    SILK(1),
    GLOSS(2),
    UNCOATED(3),
    BLUEBACK(4),
    OUTDOOR_PAPER(5),
    ILLUSTRATION_PRINTING_PAPER(6),
    PHOTOGRAPHIC_PRINTING_PAPER(7),
    POSTCARD_BOARD(8),
    RECYCLED_NATURAL_PAPER(9),
    RECYCLED_SILK_PAPER(10),
    FLUORESCENT(11),
    WEATHERPROOF_VINYL(12),
    RECYCLED_UNCOATED_PAPER(13),
    POLYESTER_CANVAS(14),
    PREMIUM_WHITE(15),
    CREME(16),
    E_PHOTO_PAPER(17),
    E_PHOTO_SILK_LUSTRE(18),
    ARCHIVAL_MATT(19),
    ARCHIVAL_UNCOATED(20),
    ARCHIVAL_TEXTURED_MATT(21),
    PHOTO_LUSTRE(22),
    WRAPPED_GREYBOARD(23),
    LINEN(24),
    BUCKRAM(25),
    COLORPLAN(26),
    RECYCLED_UNCOATED(27),
    RECYCLED_NATURAL(28),
    PEARL_POLAR(29),
    PEARL_OYSTER(30),
    UNCOATED_CREME_PAPER(31),
    TINTORETTO_GESSO(32),
    KRAFT(33),
    ICE_GOLD(34),
    FRESCO_GESSO(35),
    RIVES_SHETLAND(36),
    RECYCLED_SILK(37),
    BOOKWOVE(38),
    POLYESTER(39),
    MATTE_PAPER(40),
    POLYFILL_BAG(41),
    LAID(42),
    AQUERELLO(43),
    NETTUNO(44),
    LUX_LAYERED_KRAFT_WHITE(45),
    LUX_LAYERED_WHITE_KRAFT(46),
    ETCHING(47),
    RAG_PEARL(48),
    ;

    private final int value;

    MaterialType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}

package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileFlags {

    // Imposition variants
    private Boolean headToHead;
    private Boolean coverSingles;

    private Boolean spotUv;
    private Boolean spotUv3d;

    // Metallic foil
    private Boolean foilGold;
    private Boolean foilSilver;
    private Boolean foilCopper;
    private Boolean foilRed;
    private Boolean foilBlue;
    private Boolean foilGreen;

    public Boolean getHeadToHead() {
        return headToHead;
    }

    public FileFlags setHeadToHead(Boolean headToHead) {
        this.headToHead = headToHead;
        return this;
    }

    public Boolean getCoverSingles() {
        return coverSingles;
    }

    public FileFlags setCoverSingles(Boolean coverSingles) {
        this.coverSingles = coverSingles;
        return this;
    }

    public Boolean getSpotUv() {
        return spotUv;
    }

    public FileFlags setSpotUv(Boolean spotUv) {
        this.spotUv = spotUv;
        return this;
    }

    public Boolean getSpotUv3d() {
        return spotUv3d;
    }

    public FileFlags setSpotUv3d(Boolean spotUv3d) {
        this.spotUv3d = spotUv3d;
        return this;
    }

    public Boolean getFoilGold() {
        return foilGold;
    }

    public FileFlags setFoilGold(Boolean foilGold) {
        this.foilGold = foilGold;
        return this;
    }

    public Boolean getFoilSilver() {
        return foilSilver;
    }

    public FileFlags setFoilSilver(Boolean foilSilver) {
        this.foilSilver = foilSilver;
        return this;
    }

    public Boolean getFoilCopper() {
        return foilCopper;
    }

    public FileFlags setFoilCopper(Boolean foilCopper) {
        this.foilCopper = foilCopper;
        return this;
    }

    public Boolean getFoilRed() {
        return foilRed;
    }

    public FileFlags setFoilRed(Boolean foilRed) {
        this.foilRed = foilRed;
        return this;
    }

    public Boolean getFoilBlue() {
        return foilBlue;
    }

    public FileFlags setFoilBlue(Boolean foilBlue) {
        this.foilBlue = foilBlue;
        return this;
    }

    public Boolean getFoilGreen() {
        return foilGreen;
    }

    public FileFlags setFoilGreen(Boolean foilGreen) {
        this.foilGreen = foilGreen;
        return this;
    }

}

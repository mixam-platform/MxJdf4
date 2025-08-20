package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class File {

    private FileType type;
    private String name;
    private String url;
    private String checksum;
    private long sizeInBytes;
    private FileFlags flags;
    private Dimensions trimBox;

    public FileType getType() {
        return type;
    }

    public File setType(FileType type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public File setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public File setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getChecksum() {
        return checksum;
    }

    public File setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    public File setSizeInBytes(long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    public FileFlags getFlags() {
        return flags;
    }

    public File setFlags(FileFlags flags) {
        this.flags = flags;
        return this;
    }

    public Dimensions getTrimBox() {
        return trimBox;
    }

    public File setTrimBox(Dimensions trimBox) {
        this.trimBox = trimBox;
        return this;
    }

}

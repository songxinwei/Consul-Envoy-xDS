package com.pathao.xds.dto;

public class ClusterDto {
    public String name;
    public String host;
    public int port;

    public ClusterDto(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public ClusterDto() {
    }
}

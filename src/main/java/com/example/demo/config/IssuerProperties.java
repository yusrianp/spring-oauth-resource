					package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "sb")
public class IssuerProperties {
    private List<String> clusterIssuers;

    public List<String> getClusterIssuers() {
        return clusterIssuers;
    }

    public void setClusterIssuers(List<String> clusterIssuers) {
        this.clusterIssuers = clusterIssuers;
    }

    public IssuerProperties() {
    }

    public IssuerProperties(List<String> clusterIssuers) {
        this.clusterIssuers = clusterIssuers;
    }
}

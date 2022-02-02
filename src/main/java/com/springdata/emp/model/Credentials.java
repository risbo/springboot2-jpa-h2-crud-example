package com.springdata.emp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credentials {

    @JsonProperty("type")
    private String type;
    @JsonProperty("project_id")
    private String projectId;
    @JsonProperty("private_key_id")
    private String privateKeyId;
    @JsonProperty("private_key")
    private String privateKey;
    @JsonProperty("client_email")
    private String clientEmail;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("authU_uri")
    private String authUri;
    @JsonProperty("token_uri")
    private String tokenUri;
    @JsonProperty("auth_provider_x509_cert_url")
    private String authProviderX509CertUrl;
    @JsonProperty("client_x509_cert_url")
    private String clientX509CertUrl;
    @JsonProperty("issuer")
    private String issuer;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("audience")
    private String audience;
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
}

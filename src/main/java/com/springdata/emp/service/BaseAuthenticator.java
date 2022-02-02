package com.springdata.emp.service;


import com.springdata.emp.model.RecordResponse;
import com.springdata.emp.model.TransactionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

@Service
public class BaseAuthenticator {

    private static final Logger BASE_LOG = LoggerFactory.getLogger(BaseAuthenticator.class);

    @Value("#{${base.auth.configMap.configMap}}")
    protected Map<String, String> configMap;
    @Value("base.auth.configMap.accessToken")
    protected String accessToken;
    @Value("base.auth.configMap.authUrl")
    protected String authUrl;
    @Value("base.auth.configMap.authContentType")
    protected String authContentType;
    @Value("base.auth.configMap.authGrantType")
    protected String authGrantType;
    @Value("base.auth.configMap.httpApiUrl")
    protected String httpApiUrl;
    @Value("base.auth.configMap.contextApiGetUrl")
    protected String contextApiGetUrl;
    @Value("base.auth.configMap.httpUserAgent")
    protected String httpUserAgent;
    @Value("base.auth.configMap.httpApiContentType")
    protected String httpApiContentType;
    @Value("${base.auth.configMap.includeMetadataInHeader}")
    protected boolean includeMetadataInHeader;
    @Value("${base.auth.configMap.requiredHeader}")
    protected String[] requiredHeader;
    @Value("base.auth.configMap.requiredHeaderPrefix")
    protected String requiredHeaderPrefix;
    @Value("${base.auth.configMap.httpRequestTimeoutMS}")
    protected int httpRequestTimeoutMS;
    @Value("${base.auth.configMap.isDryRunEnabled}")
    protected boolean isDryRunEnabled;
    @Value("base.auth.configMap.httpBasicAuthenticationUsername")
    protected String httpBasicAuthenticationUsername;
    @Value("base.auth.configMap.httpBasicAuthenticationPassword")
    protected String httpBasicAuthenticationPassword;
    @Value("${base.auth.configMap.dryRunHttpStatusCode}")
    protected int dryRunHttpStatusCode;


    public Object getHttpPost(String payload, String topic, Long offset, Integer partition,
                              Map<String, String> headers, boolean isExpired, boolean isBatch) {
        return null;
    }

    public Object getToken(boolean isExpired) {
        return null;
    }

    public Object getAuthenticationType() {
        return null;
    }

    public RecordResponse publishMessage(String topic, Integer partition, Long offset, String key, Object obj,
                                         Map<String, String> headers, boolean isBatch, Date publishTimestamp, boolean isAsyncRequestEnabled,
                                         String httpAsyncClient) {

        TransactionModel transactionModel= TransactionModel.builder().build();
        RecordResponse recordResponse = RecordResponse.builder()
                .topic("")
                .partition(1)
                .offset(1L)
                .payload("")
                .key("")
                .responseBody("")
                .headers("")
                .httpStatusCode(1)
                .startTimestamp(new Date())
                .transactionModel(transactionModel)
                .build();
        return recordResponse;

    }

    public Object getHttpGetRequest(String key, String value, Boolean tokenIsExpired) {
        return null;
    }

    protected Object sendRequest(Object obj, String topic, String key, int partition, Long offset,
                                 Map<String, String> headers, Boolean tokenIsExpired, Boolean isBatch, Date publishTimestamp) {
        return null;
    }

    public Future<Object> sendRequestAsync(Object obj, String topic, String key, int partition, Long offset,
                                           Map<String, String> headers, Boolean tokenIsExpired, Boolean isBatch, Date publishTimestamp,
                                           String httpAsyncClient, String recordResponse) {

        return null;

    }

    public String getAuthUrl() {
        return authUrl;
    }

    public String getAuthContentType() {
        return authContentType;
    }

    public String getAuthGrantType() {
        return authGrantType;
    }

    public String getHttpApiUrl() {
        return httpApiUrl;
    }

    public String getContextApiGetUrl() {
        return contextApiGetUrl;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Boolean getIncludeMetadataInHeader() {
        return includeMetadataInHeader;
    }


}

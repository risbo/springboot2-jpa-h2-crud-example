package com.springdata.emp.service;

import com.springdata.emp.enums.AuthenticationType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SimpleAuthenticator {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleAuthenticator.class);


    @Autowired
    private BaseAuthenticator baseAuthenticator;


    public Object getToken(boolean isExpired) {

        return baseAuthenticator.getToken(isExpired);

    }


    public Object getHttpPost(String payload, String topic, Long offset, Integer partition, Map<String, String> headers,
                              boolean isExpired, boolean isBatch) {


        return baseAuthenticator.getHttpPost(payload, topic, offset, partition, headers, isExpired, isBatch);
    }

    public AuthenticationType getAuthenticationType() {
        return AuthenticationType.JWT;
    }

}

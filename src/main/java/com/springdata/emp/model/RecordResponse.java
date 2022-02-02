package com.springdata.emp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Future;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordResponse {
    private String topic;
    private Integer partition;
    private Long offset;
    private String payload;
    private String key;
    private String responseBody;
    private String headers;
    private Integer httpStatusCode;
    private Date startTimestamp;
    private long httpResponseTimeMS = -1;
    private Date publishTimestamp;
    private Date completeTimestamp;
    private long totalProcessTimeMS = 0;
    private Future<Object> httpResponseFuture;
    private Map<String, Map<String, Object>> originalRecords;
    private String DatePattern = "yyyy-MM-dd HH:mm:ss.SSS";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DatePattern);
    private TransactionModel transactionModel;
}

package com.binblink.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

/**
 * @Description ��������
 * @Author binblink
 * @Date 2020/12/30 11:13
 */
public class GenericDTO<T> {

    /**
     * ������ˮ��
     */
    private String requestId;
    /**
     * ������ˮ��
     */
    private String msgId;
    /**
     * ������Ψһ��ʶ
     */
    private String traceId;

    /** ������SpanΨһ��ʶ */
    private String spanId;

    /** ��ǰSpan�ĸ�ID */
    private String parentSpanId;
    /**
     * ��������
     */
    private LocalDate accDate;
    /**
     * ���׷���ʱ��
     */
    private LocalDateTime startDateTime;

    /**
     * ���׽���ʱ��
     */
    private LocalDateTime endDateTime;
    /**
     * ����
     */
    private Locale locale;
    /**
     * ·����Ϣ����|����
     */
    private String routeInfo;
    /**
     * ��¼�û�ID
     */
    private String userId;


    private String clientIp;


    private String source;


    private String channel;


    private String business;


    private String uri;


    private String token;


    private String loginName;

    /**
     * ���׺��㵥Ԫ
     */
    private Long trBr;

    /**
     *  ˳��� - ���ڱ�ʾ��ǰ��������������������е�˳��
     */
    private Integer seq;

    private T body;


    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getParentSpanId() {
        return parentSpanId;
    }

    public void setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public LocalDate getAccDate() {
        return accDate;
    }

    public void setAccDate(LocalDate accDate) {
        this.accDate = accDate;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getRouteInfo() {
        return routeInfo;
    }

    public void setRouteInfo(String routeInfo) {
        this.routeInfo = routeInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }
}

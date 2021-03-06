/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wso2telco.services.dep.sandbox.dao.model.domain;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */

@Entity
@Table(name="smstransactionlog")
public class SMSRequestLog {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="sms_id")
    private int smsId;
    
    @Column(name="sender_address")
    private String senderAddress;
    
    private String addresses;
    
    private String message;
    
    @Column(name="client_correlator")
    private String clientCorrelator;
    
    @Column(name="sender_name")
    private String senderName;
    
    @Column(name="notify_url")
    private String notifyURL;
    
    @Column(name="callback_data")
    private String callbackData;
    
    @Column(name="trnstatus")
    private String transactionstatus;
    
    @Column(name="batchsize")
    private Integer batchsize;
    
    @Column(name="txntype")
    private Integer txntype;
    
    @Column(name="criteria")
    private String criteria;
    
    @Column(name="notificationFormat")
    private String notificationFormat;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="effect_date")
    private Date date;
    
    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName="id")
    private User user;
    
    @Column(name="transaction_id")
    private String transactionId;
    
    @Column(name="request_id")
    private String requestId;

    /**
     * @return the smsId
     */
    public int getSmsId() {
        return smsId;
    }

    /**
     * @param smsId the smsId to set
     */
    public void setSmsId(int smsId) {
        this.smsId = smsId;
    }

    /**
     * @return the senderAddress
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * @param senderAddress the senderAddress to set
     */
    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    /**
     * @return the addresses
     */
    public String getAddresses() {
        return addresses;
    }

    /**
     * @param addresses the addresses to set
     */
    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the clientCorrelator
     */
    public String getClientCorrelator() {
        return clientCorrelator;
    }

    /**
     * @param clientCorrelator the clientCorrelator to set
     */
    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    /**
     * @return the senderName
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * @param senderName the senderName to set
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * @return the notifyURL
     */
    public String getNotifyURL() {
        return notifyURL;
    }

    /**
     * @param notifyURL the notifyURL to set
     */
    public void setNotifyURL(String notifyURL) {
        this.notifyURL = notifyURL;
    }

    /**
     * @return the callbackData
     */
    public String getCallbackData() {
        return callbackData;
    }

    /**
     * @param callbackData the callbackData to set
     */
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the Date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String getTransactionstatus() {
        return transactionstatus;
    }

    public void setTransactionstatus(String transactionstatus) {
        this.transactionstatus = transactionstatus;
    }

    public Integer getBatchsize() {
        return batchsize;
    }

    public void setBatchsize(Integer batchsize) {
        this.batchsize = batchsize;
    }

    public Integer getTxntype() {
        return txntype;
    }

    public void setTxntype(Integer txntype) {
        this.txntype = txntype;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getNotificationFormat() {
        return notificationFormat;
    }

    public void setNotificationFormat(String notificationFormat) {
        this.notificationFormat = notificationFormat;
    }

    /**
     * @return the transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId the transactionId to set
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return the requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * @param requestId the requestId to set
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    
}

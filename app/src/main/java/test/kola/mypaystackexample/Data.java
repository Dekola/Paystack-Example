
package test.kola.mypaystackexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("gateway_response")
    @Expose
    private String gatewayResponse;
    @SerializedName("paid_at")
    @Expose
    private String paidAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("channel")
    @Expose
    private String channel;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("ip_address")
    @Expose
    private String ipAddress;
    @SerializedName("metadata")
    @Expose
    private Integer metadata;
    @SerializedName("log")
    @Expose
    private Log log;
    @SerializedName("fees")
    @Expose
    private Integer fees;
    @SerializedName("fees_split")
    @Expose
    private Object feesSplit;
    @SerializedName("authorization")
    @Expose
    private Authorization authorization;
    @SerializedName("customer")
    @Expose
    private Customer customer;
    @SerializedName("plan")
    @Expose
    private String plan;
    @SerializedName("transaction_date")
    @Expose
    private String transactionDate;
    @SerializedName("plan_object")
    @Expose
    private PlanObject planObject;
    @SerializedName("subaccount")
    @Expose
    private Subaccount subaccount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public String getGatewayResponse() {
        return gatewayResponse;
    }

    public void setGatewayResponse(String gatewayResponse) {
        this.gatewayResponse = gatewayResponse;
    }

    public String getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(String paidAt) {
        this.paidAt = paidAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getMetadata() {
        return metadata;
    }

    public void setMetadata(Integer metadata) {
        this.metadata = metadata;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public Integer getFees() {
        return fees;
    }

    public void setFees(Integer fees) {
        this.fees = fees;
    }

    public Object getFeesSplit() {
        return feesSplit;
    }

    public void setFeesSplit(Object feesSplit) {
        this.feesSplit = feesSplit;
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public PlanObject getPlanObject() {
        return planObject;
    }

    public void setPlanObject(PlanObject planObject) {
        this.planObject = planObject;
    }

    public Subaccount getSubaccount() {
        return subaccount;
    }

    public void setSubaccount(Subaccount subaccount) {
        this.subaccount = subaccount;
    }

}

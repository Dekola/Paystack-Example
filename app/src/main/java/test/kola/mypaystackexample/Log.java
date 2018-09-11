
package test.kola.mypaystackexample;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Log {

    @SerializedName("time_spent")
    @Expose
    private Integer timeSpent;
    @SerializedName("attempts")
    @Expose
    private Integer attempts;
    @SerializedName("authentication")
    @Expose
    private Object authentication;
    @SerializedName("errors")
    @Expose
    private Integer errors;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("mobile")
    @Expose
    private Boolean mobile;
    @SerializedName("input")
    @Expose
    private List<Object> input = null;
    @SerializedName("channel")
    @Expose
    private Object channel;
    @SerializedName("history")
    @Expose
    private List<History> history = null;

    public Integer getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Integer timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Integer getAttempts() {
        return attempts;
    }

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    public Object getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Object authentication) {
        this.authentication = authentication;
    }

    public Integer getErrors() {
        return errors;
    }

    public void setErrors(Integer errors) {
        this.errors = errors;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getMobile() {
        return mobile;
    }

    public void setMobile(Boolean mobile) {
        this.mobile = mobile;
    }

    public List<Object> getInput() {
        return input;
    }

    public void setInput(List<Object> input) {
        this.input = input;
    }

    public Object getChannel() {
        return channel;
    }

    public void setChannel(Object channel) {
        this.channel = channel;
    }

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }

}

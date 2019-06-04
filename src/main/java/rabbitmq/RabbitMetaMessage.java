package rabbitmq;

import java.io.Serializable;

public class RabbitMetaMessage implements Serializable {
    //是否是 returnCallback
    private boolean returnCallback;
    //承载原始消息数据数据
    private Object payload;

    public RabbitMetaMessage(Object payload) {
        this.payload = payload;
    }

    public boolean isReturnCallback() {
        return returnCallback;
    }

    public void setReturnCallback(boolean returnCallback) {
        this.returnCallback = returnCallback;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}

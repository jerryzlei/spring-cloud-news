package com.jerry.news.common.utils;

import com.jerry.news.common.model.BaseResponse;

/**
 * @Author： zhanlei
 * @Description：
 * @CreateTime: 16:16 2018/10/29
 * @Modified by:
 */
public class RSAResponse extends BaseResponse {
    private String serverPublicKey;
    private String serverPrivateKey;

    public static class Builder {
        private String serverPublicKey;
        private String serverPrivateKey;

        public Builder setServerPublicKey(String serverPublicKey) {
            this.serverPublicKey = serverPublicKey;
            return this;
        }

        public Builder setServerPrivateKey(String serverPrivateKey) {
            this.serverPrivateKey = serverPrivateKey;
            return this;
        }

        public RSAResponse build() {
            return new RSAResponse(this);
        }

    }

    public static Builder options() {
        return new Builder();
    }

    public RSAResponse(Builder builder) {
        this.serverPrivateKey = builder.serverPrivateKey;
        this.serverPublicKey = builder.serverPublicKey;
    }

    public String getServerPrivateKey() {
        return serverPrivateKey;
    }

    public String getServerPublicKey() {
        return serverPublicKey;
    }
}

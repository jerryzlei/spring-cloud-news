package com.jerry.news.common.utils;

import com.jerry.news.common.model.BaseRequest;
import com.sun.istack.internal.NotNull;


/**
 * @Author： zhanlei
 * @Description：私钥输入参数（其实就是客户端通过服务端返回的公钥加密后的客户端自己生成的公钥）
 * @CreateTime: 16:12 2018/10/29
 * @Modified by:
 */
public class KeyRequest extends BaseRequest {

    /**
     * 客户端自己生成的加密后公钥
     */
    @NotNull
    private String clientEncryptPublicKey;

    public String getClientEncryptPublicKey() {
        return clientEncryptPublicKey;
    }

    public void setClientEncryptPublicKey(String clientEncryptPublicKey) {
        this.clientEncryptPublicKey = clientEncryptPublicKey;
    }
}

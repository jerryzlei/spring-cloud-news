package com.jerry.news.common.encryption;

import com.jerry.news.common.utils.KeyRequest;
import com.jerry.news.common.utils.KeyResponse;
import com.jerry.news.common.utils.RSAResponse;
import com.jerry.news.common.utils.SingleResult;

/**
 * @Author： zhanlei
 * @Description：
 * @CreateTime: 16:17 2018/10/29
 * @Modified by:
 */
public interface EncryptOpenService {
    /**
     * 生成RSA公私钥
     * @return
     */
    SingleResult<RSAResponse> getRSA();
    /**
     * 获得加解密用的密钥
     * @param request
     * @return
     */
    SingleResult<KeyResponse> getKey(KeyRequest request) throws Exception;
}

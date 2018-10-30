package com.jerry.news.client.user.controller;

import com.jerry.news.client.user.TestRequest;
import com.jerry.news.common.encryption.EncryptOpenService;
import com.jerry.news.common.utils.KeyRequest;
import com.jerry.news.common.utils.KeyResponse;
import com.jerry.news.common.utils.RSAResponse;
import com.jerry.news.common.utils.SingleResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author： zhanlei
 * @Description：
 * @CreateTime: 16:57 2018/10/29
 * @Modified by:
 */
@RestController
@RequestMapping("open/encrypt")
public class EncryptController {
    @Autowired
    private EncryptOpenService encryptOpenService;

    @RequestMapping(value = "getRSA", method = RequestMethod.POST)
    public SingleResult<RSAResponse> getRSA() {
        return encryptOpenService.getRSA();
    }

    @RequestMapping(value = "getKey", method = RequestMethod.POST)
    public SingleResult<KeyResponse> getKey(@Valid @RequestBody KeyRequest request) throws Exception {
        return encryptOpenService.getKey(request);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public SingleResult<String> hello(@Valid @RequestBody TestRequest request, BindingResult result) {
        validate(result);
        return SingleResult.buildSuccess("name=" + request.getName());
    }

    protected void validate(BindingResult result) {
        if (result.hasFieldErrors()) {
            List<FieldError> errorList = result.getFieldErrors();
            errorList.stream().forEach(item ->
                    Assert.isTrue(false, item.getDefaultMessage()));
        }
    }
}

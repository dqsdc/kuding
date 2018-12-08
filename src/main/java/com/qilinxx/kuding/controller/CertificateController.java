package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.mapper.CertificateMapper;
import com.qilinxx.kuding.domain.model.Certificate;
import com.qilinxx.kuding.util.ImageUtil;
import com.qilinxx.kuding.util.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: dqsdc
 * @Date: 2018-12-07 15:05
 * @Description:
 */
@Controller
public class CertificateController {

    @Autowired
    CertificateMapper certificateMapper;

    @RequestMapping("t")
    @ResponseBody
    public String test(HttpServletRequest request) throws UnknownHostException {

       return  InetAddress.getLocalHost().getHostAddress();
    }

    @RequestMapping("image")
    @ResponseBody
    public Certificate getImage(String id) throws UnknownHostException {
        if (id == null || "".equals(id))
            return null;
        Certificate certificate = certificateMapper.selectByPrimaryKey(id);
        String cerNo = ImageUtil.createCerNo();
        String small = certificate.getcNameUrl();
        String cerUrl = ImageUtil.build(small, cerNo);
        String host=InetAddress.getLocalHost().getHostAddress();
        certificate.setcCerUrl("http://"+host+":7000"+cerUrl);
        certificate.setcCertificateNo(cerNo);
        certificateMapper.updateByPrimaryKey(certificate);
        return certificate;
    }
}

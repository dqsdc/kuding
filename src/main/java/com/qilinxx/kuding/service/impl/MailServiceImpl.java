package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;


@Component
public class MailServiceImpl implements MailService {


    @Autowired
    private JavaMailSender mailSender;


    @Value("${spring.mail.username}")
    private String mailFrom;

    @Value("${spring.mail.to}")
    private String mailTo;


    @Override
    public void sendMessage(String subject, String content) {
        sendSimpleEmail(mailTo,subject,content);
    }

    /**
     * 发送简单邮件
     *
     * @param to 邮件接收者的邮箱
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    @Override
    public void sendSimpleEmail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mailFrom);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        mailSender.send(message);
    }

    /**
     * 发送html邮件
     *
     * @param to 邮件接收者的邮箱
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    @Override
    public void sendHtmlMail(String to, String subject, String content) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(mailFrom);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送带附件的邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param filepath
     */
    @Override
    public void sendFileMail(String to, String subject, String content, String filepath) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(mailFrom);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);

            FileSystemResource file = new FileSystemResource(new File(filepath));
            String fileName = filepath.substring(filepath.lastIndexOf(File.separator));
            helper.addAttachment(fileName, file);

            mailSender.send(mimeMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

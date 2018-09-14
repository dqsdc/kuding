package com.qilinxx.kuding.util;

import org.apache.commons.lang3.StringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.InputStream;
import java.util.Date;

public class MyUtils {
    public static String getUploadFilePath() {
        String path = MyUtils.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println(path);
//        path = path.substring(1, path.length());
//        try {
//            path = URLDecoder.decode(path, "utf-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        int lastIndex = path.lastIndexOf("/") + 1;
//        path = path.substring(0, lastIndex);
//        File file = new File("");
//        System.out.println("file"+file.getAbsolutePath());
//        return file.getAbsolutePath() + "/";
        return path;
    }

    public static boolean isImage(InputStream imageFile) {
        try {
            Image img = ImageIO.read(imageFile);
            if (img == null || img.getWidth(null) <= 0 || img.getHeight(null) <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String getFileKey(String name) {
        String prefix = "/upload/" + DateKit.dateFormat(new Date(), "yyyy/MM");
        if (!new File(getUploadFilePath() + prefix).exists()) {
            new File(getUploadFilePath() + prefix).mkdirs();
        }

        name = StringUtils.trimToNull(name);
        if (name == null) {
            return prefix + "/" + UUID.UU32() + "." + null;
        } else {
            name = name.replace('\\', '/');
            name = name.substring(name.lastIndexOf("/") + 1);
            int index = name.lastIndexOf(".");
            String ext = null;
            if (index >= 0) {
                ext = StringUtils.trimToNull(name.substring(index + 1));
            }
            return prefix + "/" + UUID.UU32() + "." + (ext == null ? null : (ext));
        }
    }


}
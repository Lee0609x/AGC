package com.lee.agc.utils;

import com.lee.agc.Constants;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;

/**
 * @Author: Lee0609x
 * @Date: 2018/7/28 17:47
 * 根据传入的模板与数据，生成文件
 */
public class FreemarkerUtil {

    private static Configuration configuration;

    public static boolean init() {
        try {
            configuration = new Configuration(Configuration.VERSION_2_3_28);
            //设置模板文件夹目录
            configuration.setDirectoryForTemplateLoading(new File(Constants.TEMPLATE_DIR));
            //设置对象包装器
            configuration.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_28));
            //设置异常处理器
            configuration.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean run(String templateName, String outputFilePath, Map<?,?> root) {
        if (configuration == null) {
           if (!init()) {
               return false;
           }
        }
        try {
            Template template = configuration.getTemplate(templateName);
            File outputFile = new File(outputFilePath);
            if (!outputFile.getParentFile().exists()) {
                outputFile.getParentFile().mkdirs();
            }
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(outputFile));
            template.process(root, writer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}

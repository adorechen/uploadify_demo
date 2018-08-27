package com.my.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Description: To do
 * <p>
 * Author : Adore Chen
 * Created: 2018-08-23
 */
@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
public class IndexControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testIndex() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
        .andExpect(status().isOk())
        .andExpect(content().string("<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "    <title>UploadiFive Test</title>\n" +
                "    <script src=\"http://code.jquery.com/jquery-1.7.2.min.js\"></script>\n" +
                "    <script src=\"static/uploadify/jquery.uploadify.min.js\" type=\"text/javascript\"></script>\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/uploadify/uploadify.css\">\n" +
                "    <style type=\"text/css\">\n" +
                "        body {\n" +
                "            font: 13px Arial, Helvetica, Sans-serif;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "<h1>Uploadify Demo</h1>\n" +
                "<form>\n" +
                "    <div id=\"queue\"></div>\n" +
                "    <input id=\"file_upload\" type=\"file\" name=\"file_upload\" />\n" +
                "</form>\n" +
                "\n" +
                "<script type=\"text/javascript\">\n" +
                "    $(function() {\n" +
                "        $(\"#file_upload\").uploadify({\n" +
                "            'fileObjName' : 'file_upload',\n" +
                "            'swf'         : 'static/uploadify/uploadify.swf',\n" +
                "            'uploader'    : '/upload'\n" +
                "        });\n" +
                "    });\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>"))
        ;
    }
}

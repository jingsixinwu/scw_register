package com.offcn.util;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import lombok.Data;
import lombok.ToString;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@ToString
@Data
public class OssTemplate {

    private String endpoint;
    private String bucketDomain;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;

    /**
     * 返回上传后的文件的访问路径
     *
     * @param inputStream
     * @param fileName
     * @return
     * @throws IOException
     */
    public String upload(InputStream inputStream, String fileName)throws IOException {
        //1、加工文件夹和文件名
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String folderName = sdf.format(new Date());
        fileName = UUID.randomUUID().toString().replace("-","")+"_"+fileName;


       //2. 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
       //3、// 上传文件流，指定bucket的名称
        ossClient.putObject(bucketName, "pic/"+folderName+"/"+fileName, inputStream);

       //4、关闭资源
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        // 关闭OSSClient。
        ossClient.shutdown();
        String url="https://"+bucketName+"."+endpoint+"/pic/"+folderName+"/"+fileName;
        System.out.println("上传的文件的访问路径名为："+url);
        return url;
    }

}

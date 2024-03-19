package com.wei.project.weather;//java环境中文传值时，需特别注意字符编码问题
import java.net.*;
import java.io.*; 
public class DemoTianAPI{ 
public static void main(String args[]) throws Exception { 
    String tianapi_data = ""; 
    try {
        URL url = new URL( "https://apis.tianapi.com/dgryl/index");
        HttpURLConnection  conn = (HttpURLConnection) url.openConnection(); 
        conn.setRequestMethod("POST");
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(5000);
        conn.setDoOutput(true);
        conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
        OutputStream outputStream = conn.getOutputStream();
        String content = "key=0db5da681d17e1844d188913bb3aa4bb";
        outputStream.write(content.getBytes());
        outputStream.flush();
        outputStream.close();
        InputStream inputStream = conn.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader (inputStream,"utf-8");
        BufferedReader bufferedReader = new BufferedReader (inputStreamReader);
        StringBuilder tianapi = new StringBuilder();
        String temp = null;
            while ( null != (temp = bufferedReader.readLine())){
            tianapi.append(temp);
        }
    tianapi_data = tianapi.toString();       
    inputStream.close();
     } catch (IOException e) { 
        e.printStackTrace();
}
   System.out.println(tianapi_data);
}
}
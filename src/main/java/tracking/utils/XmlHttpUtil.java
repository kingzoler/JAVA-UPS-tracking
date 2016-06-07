package tracking.utils;

import java.io.IOException;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlHttpUtil {
    private static final Logger logger = LoggerFactory.getLogger(XmlHttpUtil.class);
    public static final int HTTP_STATUS_OK = 200;

    public static <T> T post(Object request, String url, Class<? extends T> type) {
        return post(new Object[]{request}, url, type);
    }
    
    public static <T> T post(Object[] request, String url, Class<? extends T> type) {
    	StringBuilder sb = new StringBuilder();
    	for(Object obj : request){
    		sb.append(XmlUtil.beanToString(obj));
    	}
        String parameter = sb.toString();
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
        HttpPost httpPost = new HttpPost(url);
        StringEntity stringEntity = new StringEntity(parameter, ContentType.create("text/xml", Consts.UTF_8));
        httpPost.setEntity(stringEntity);
        logger.debug(httpPost.getRequestLine().toString());
        try {
            HttpResponse httpResponse = closeableHttpClient.execute(httpPost);
            HttpEntity entity = httpResponse.getEntity();
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (HTTP_STATUS_OK == statusCode && entity != null) {
                if(type.isAssignableFrom(String.class)) {
                   return  (T) EntityUtils.toString(entity);
                }
                return XmlUtil.stringToBean(EntityUtils.toString(entity), type);
            } else {
                logger.error("call error with status:{}", statusCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                closeableHttpClient.close(); // 关闭流并释放资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

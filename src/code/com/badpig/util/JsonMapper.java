package code.com.badpig.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.TimeZone;

/**
 * 简单封装Jackson，实现JSON与String、Bean、Map、List之间的相互转换
 */
public class JsonMapper extends ObjectMapper {

    private static final long serialVersionUID = 1L;

    public JsonMapper() {
        // 为Null时不序列化
        this.setSerializationInclusion(Include.NON_NULL);
        // 允许单引号
        this.configure(Feature.ALLOW_SINGLE_QUOTES, true);
        // 允许不带引号的字段名称
        this.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // 设置时区
        this.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
        this.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        // 遇到空值处理为空串
        this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>(){
            @Override
            public void serialize(Object value, JsonGenerator jgen,
                                  SerializerProvider provider) throws IOException, JsonProcessingException {
                jgen.writeString(StringUtils.EMPTY);
            }
        });
    }

    /**
     * 内部静态类实例化对象
     */
    private static final class JsonMapperHolder {
        private static final JsonMapper jsonMapper = new JsonMapper();
    }

    private static JsonMapper getInstance() {
        return JsonMapperHolder.jsonMapper;
    }

    /**
     * String字符串转为对象，如：Map、List、Javabean
     * @param json
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> T toObject(String json,Class<T> obj) {
        T t = null;
        try {
            t = JsonMapper.getInstance().readValue(json,obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 对象转为字符串，如：Map、List、Javabean
     * @param obj
     * @return
     */
    public static String toString(Object obj) {
        String str = null;
        try {
            str = JsonMapper.getInstance().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }
}

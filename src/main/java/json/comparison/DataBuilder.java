/**
 * 
 */
package json.comparison;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**  
* @ClassName: DataBuilder  
* @Description: 数据生成器
* @author zysrxx  
* @date 2020年8月13日    
*/
public class DataBuilder {
    private static final String[] chars = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b",
            "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
            "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z" };

    private static final int charNum = 62;

    // 样本String最大长度
    private static final int maxStrLength = 100;

    // 样本String默认长度
    private static final int defaultStrLength = 50;

    // 样本List最大长度
    private static final int maxListSize = 100;

    // 样本List默认长度
    private static final int defaultListSize = 10;

    // 样本Map最大Key数量
    private static final int maxMapSize = 100;

    // 样本Map默认Key数量
    private static final int defaultMapSize = 10;

    // 样本Map中Value的数据类型
    private static final String[] types = new String[] { "boolean", "int", "long", "double", "date", "string"};
    private static final int typeNum = 6;

    private static final Random random = new Random();

    /**
     * 生成随机长度的字符串
     * @return 字符串
     */
    public static String randomString(){
        return randomString(random.nextInt(maxStrLength));
    }

    /**
     * 生成指定长度的字符串
     * @param len 字符串长度
     * @return
     */
    public static String randomString(int len) {
        if (len < 1 || len > maxStrLength) {
            // 如果字符串长度超出范围，使用默认长度
            len = defaultStrLength;
        }

        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            sb.append(chars[random.nextInt(charNum)]);
        }

        return sb.toString();
    }

    /**
     * 生成List样本，List中元素的数量随机
     * @return
     */
    public static List<String> randomStringList() {
        return randomStringList(random.nextInt(maxListSize));
    }

    /**
     * 生成List样本
     * @param size List中元素的数量 
     * @return
     */
    public static List<String> randomStringList(int size) {
        if (size < 1 || size > maxListSize) {
            size = defaultListSize;
        }

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < size; i++) {
            list.add(randomString(random.nextInt(maxStrLength)));
        }

        return list;
    }

    /**
     * 生成随机Map样本，样本中key的数量随机
     * @return
     */
    public static Map<String, Object> randomMap() {
        return randomMap(random.nextInt(maxMapSize));
    }

    /**
     * 生成随机Map样本
     * @param size 样本中key的数量
     * @return
     */
    public static Map<String, Object> randomMap(int size) {
        if (size < 1 || size > maxMapSize) {
            size = defaultMapSize;
        }

        Map<String, Object> map = new HashMap<String, Object>();

        for (int i = 0; i < size; i++) {
            String type = types[random.nextInt(typeNum)];
            if ("boolean".equals(type)) {
                map.put("key" + i, random.nextBoolean());
            } else if ("int".equals(type)) {
                map.put("key" + i, random.nextInt());
            } else if ("long".equals(type)) {
                map.put("key" + i, random.nextLong());
            } else if ("double".equals(type)) {
                map.put("key" + i, random.nextDouble());
            } else if ("date".equals(type)) {
                map.put("key" + i, new Date());
            } else if ("string".equals(type)) {
                map.put("key" + i, randomString(random.nextInt(maxStrLength)));
            }
        }

        return map;
    }
}

package org.knight.cache;

/**
 * 缓存Key的设计
 *
 * @author Wayss.
 * @date 2019/1/20.
 */
public enum CacheKey {

    /**
     * 第一个Key值
     */
    TEST_ONE,
    /**
     * 第二个Key值
     */
    TEST_TWO,
    ;

    /**
     * 所有Key加入APPName前缀，若多个应用使用同一个缓存时可以区分
     */
    private static final String APP_NAME = "WEB-DEMO_";

    private static final String END = "_";

    private String key;

    CacheKey() {
        this.key = APP_NAME + this.name();
    }

    /**
     * 每个Key在使用时加入下划线后缀，根据业务不同选择不同的使用
     *
     * @return
     */
    public String getKey() {
        return this.key + END;
    }

}

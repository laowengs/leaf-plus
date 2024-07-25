package io.github.laowengs.leafplus.api;

public interface ILeafApi {
    /**
     * 获取最新序列
     * @param sequenceId
     * @return
     */
    Long get(String sequenceId);

    /**
     * 初始化一个序列 针对号段模式  管理端使用
     * @return
     */
    String init(String businessType);

    /**
     * 重置一个序列  管理端使用
     * @param sequenceId
     * @return
     */
    boolean reset(String sequenceId);

    /**
     * 获取序列信息
     * @return
     */
    String sequenceInfo();
}

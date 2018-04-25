package com.tencentcloudapi.dcdb.v20180411.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ShardInfo  extends AbstractModel{


    /**
    * 分片ID
    */
    @SerializedName("ShardInstanceId")
    @Expose
    private String ShardInstanceId;
    

    /**
    * 分片Set ID
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;
    

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;
    

    /**
    * 创建时间
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;
    

    /**
    * 内存大小，单位 GB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;
    

    /**
    * 存储大小，单位 GB
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;
    

    /**
    * 分片数字ID
    */
    @SerializedName("ShardId")
    @Expose
    private Integer ShardId;
    

    /**
     * 获取分片ID
     * @return ShardInstanceId 分片ID
     */
    public String getShardInstanceId() {
        return this.ShardInstanceId;
    }

    /**
     * 设置分片ID
     * @param ShardInstanceId 分片ID
     */
    public void setShardInstanceId(String ShardInstanceId) {
        this.ShardInstanceId = ShardInstanceId;
    }

    /**
     * 获取分片Set ID
     * @return ShardSerialId 分片Set ID
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * 设置分片Set ID
     * @param ShardSerialId 分片Set ID
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * 获取状态
     * @return Status 状态
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态
     * @param Status 状态
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取创建时间
     * @return Createtime 创建时间
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * 设置创建时间
     * @param Createtime 创建时间
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * 获取内存大小，单位 GB
     * @return Memory 内存大小，单位 GB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存大小，单位 GB
     * @param Memory 内存大小，单位 GB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取存储大小，单位 GB
     * @return Storage 存储大小，单位 GB
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置存储大小，单位 GB
     * @param Storage 存储大小，单位 GB
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取分片数字ID
     * @return ShardId 分片数字ID
     */
    public Integer getShardId() {
        return this.ShardId;
    }

    /**
     * 设置分片数字ID
     * @param ShardId 分片数字ID
     */
    public void setShardId(Integer ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardInstanceId", this.ShardInstanceId);
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);

    }
}


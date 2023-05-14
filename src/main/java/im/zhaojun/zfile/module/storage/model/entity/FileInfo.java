package im.zhaojun.zfile.module.storage.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 文件基本属性 entity
 * @author zhushidong
 */
@Data
@ApiModel(description = "存储源基本属性")
@TableName(value = "tbl_file_info")
@NoArgsConstructor
public class FileInfo {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "ID, 新增无需填写", example = "1")
    private int id;

    @TableField(value = "storage_key")
    @ApiModelProperty(value = "存储源 key", example = "local")
    private String storeKey;

    @TableField(value = "file_id")
    @ApiModelProperty(value = "文件 id", example = "7534bd5643a6605d83c171f9c8e33655eef4")
    private String fileId;

    @TableField(value = "file_url")
    @ApiModelProperty(value = "文件URL", example = "{storeId/utorrent/2023/05/13/%E7%BD%91%E7%9B%98%E8%B0%83%E7%A0%94.pdf}")
    private String fileUrl;

    @TableField(value = "version")
    @ApiModelProperty(value = "文件版本号", example = "1")
    private int version;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "Create Time", example = "2023-05-14T10:00:00Z")
    private Date createTime;

    @TableField(value = "update_time")
    @ApiModelProperty(value = "Update Time", example = "2023-05-14T11:30:00Z")
    private Date updateTime;


    public FileInfo(String storeKey, String fileId, String fileUrl, int version) {
        this.storeKey = storeKey;
        this.fileId = fileId;
        this.fileUrl = fileUrl;
        this.version = version;
    }
}

package im.zhaojun.zfile.module.storage.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author zhushidong
 */
@Data
@ApiModel(value="文件ID下载请求类")
public class DownloadFileRequest {
    @NotBlank(message = "文件ID 不能为空")
    @ApiModelProperty(notes="文件ID", value = "fileId", required = true, example = "1657324550304600064")
    private String fileId;

    @ApiModelProperty(notes="文件URL", value = "fileUrl", required = false, example = "utorrent/2023/123.jpg")
    private String fileUrl;

    @ApiModelProperty(notes="下载签名", value = "signature", required = false, example = "4718f48da1fce6357fb8b9930235e1...")
    private String signature;
}

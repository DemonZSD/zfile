package im.zhaojun.zfile.module.storage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import im.zhaojun.zfile.module.storage.model.entity.FileInfo;
import im.zhaojun.zfile.module.storage.model.entity.StorageSourceConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 文件信息属性 Mapper 接口
 *
 * @author zhushidong
 */
@Mapper
public interface FileInfoMapper extends BaseMapper<FileInfo> {

    /**
     * 根据fileId 查询对应的file信息
     * @param fileId 文件ID
     * @return fileInfo
     */
    FileInfo getFileInfoById(@Param("fileId") String fileId);

}

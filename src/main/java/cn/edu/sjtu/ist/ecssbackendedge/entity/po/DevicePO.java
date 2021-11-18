package cn.edu.sjtu.ist.ecssbackendedge.entity.po;

import cn.edu.sjtu.ist.ecssbackendedge.model.device.DataEntry;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * @brief 设备PO
 * @author rsp
 * @version 0.1
 * @date 2021-11-08
 */
@Data
@Document(collection = "device")
public class DevicePO {

    /**
     * 设备id
     */
    @Id
    private String id;

    /**
     * 设备名称
     */
    @Field
    private String name;

    /**
     * 设备型号
     */
    @Field
    private String model;

    /**
     * 设备描述，可有可无
     */
    @Field
    private String description;

    /**
     * 设备的数据项列表
     */
    @Field
    private List<DataEntry> values;
}

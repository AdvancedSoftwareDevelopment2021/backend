package cn.edu.sjtu.ist.ecssbackendedge.entity.dto;

import lombok.Data;

import java.util.Date;

/**
 * 设备的实时状态数据
 */
@Data
public class DeviceStatusDTO {

    /**
     * 状态数据id
     */
    private String id;

    /**
     * 对应的设备id
     */
    private String deviceId;

    /**
     * 对应时刻
     */
    private Date timestamp;

    /**
     * 状态信息
     */
    private String status;
}

package cn.edu.sjtu.ist.ecssbackendedge.repository;

import cn.edu.sjtu.ist.ecssbackendedge.entity.po.DeviceStatusPO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @brief 设备状态repository
 * @author rsp
 * @version 0.1
 * @date 2021-11-08
 */
@Component
public interface DeviceStatusRepository extends MongoRepository<DeviceStatusPO, String> {

    void deleteDeviceStatusPOSByDeviceId(String deviceId);

    void deleteDeviceStatusById(String id);

    DeviceStatusPO findDeviceStatusById(String id);

    List<DeviceStatusPO> findDeviceStatusPOSByDeviceId(String deviceId);

    List<DeviceStatusPO> findDeviceStatusPOSByTimestampBeforeAndTimestampAfter(Date before, Date after);

}

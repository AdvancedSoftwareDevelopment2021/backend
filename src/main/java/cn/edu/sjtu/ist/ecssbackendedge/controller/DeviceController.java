package cn.edu.sjtu.ist.ecssbackendedge.controller;

import cn.edu.sjtu.ist.ecssbackendedge.entity.dto.Device;
import cn.edu.sjtu.ist.ecssbackendedge.service.DeviceService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @brief 设备 Controller
 * @author rsp
 * @version 0.1
 * @date 2021-10-23
 */
@Slf4j
@RestController
@RequestMapping(value = "/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    // test
    @GetMapping(value = "/hello")
    public ResponseEntity<?> getDevice() {
        return new ResponseEntity<>("hello, device!", HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<?> insertDevice(@RequestBody Device device) {
        return new ResponseEntity<>(deviceService.insertDevice(device), HttpStatus.OK);
    }

    @DeleteMapping(value = "")
    public ResponseEntity<?> deleteDevice(@RequestParam(value = "id") Long id) {
        return new ResponseEntity<>(deviceService.deleteDevice(id), HttpStatus.OK);
    }

    @PutMapping(value = "")
    public ResponseEntity<?> updateDevice(@RequestParam(value = "id") Long id, @RequestBody Device device) {
        return new ResponseEntity<>(deviceService.updateDevice(id, device), HttpStatus.OK);
    }

    @GetMapping(value = "")
    public ResponseEntity<?> getDevice(@RequestParam(value = "id") Long id) {
        return new ResponseEntity<>(deviceService.getDevice(id), HttpStatus.OK);
    }

}

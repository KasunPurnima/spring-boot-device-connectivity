package com.example.deviceconnectivity.Controller;


import com.example.deviceconnectivity.DeviceConnectivityApplication;
import com.example.deviceconnectivity.dto.ErroInfo;
import com.example.deviceconnectivity.dto.OrangeApiRequest;
import com.example.deviceconnectivity.dto.OrangeApiResponse;
import com.example.deviceconnectivity.dto.UeId;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@Slf4j
public class DeviceController {

    private static final Logger logger = LogManager.getLogger(DeviceConnectivityApplication.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("applicationName ");
        return "Hello ";
    }

    @ApiOperation(value = "Get the current connectivity status", nickname = "Get the current connectivity status", notes = "Get the current connectivity status", httpMethod = "POST")
    @PostMapping("/status")
    public ResponseEntity<Object> callOrangeApi(@RequestBody OrangeApiRequest requestBody) {
        try {
            OrangeApiResponse orangeApiResponse = new OrangeApiResponse();
            orangeApiResponse.setUeId(requestBody.getUeId());
            orangeApiResponse.setUePort(requestBody.getUePort());
            orangeApiResponse.setEventType(requestBody.getEventType());
            orangeApiResponse.setEventStatus("ROAMING_ON");

            if (!orangeApiResponse.getUeId().getMsisdn().substring(0, 3).equals("123")) {
                throw new Exception("Invalid msisdn");
            }
            return ResponseEntity.ok(orangeApiResponse);
        } catch (Exception e) {
            ErroInfo erroInfo = new ErroInfo();
            erroInfo.setCode("INVALID_ARGUMENT");
            erroInfo.setStatus(400);
            erroInfo.setMessage("Invalid input");
            return ResponseEntity.badRequest().body(erroInfo);
        }
    }

}
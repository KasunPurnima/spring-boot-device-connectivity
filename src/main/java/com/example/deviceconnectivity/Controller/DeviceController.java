package com.example.deviceconnectivity.Controller;


import com.example.deviceconnectivity.DeviceConnectivityApplication;
import com.example.deviceconnectivity.dto.ErroInfo;
import com.example.deviceconnectivity.dto.OrangeApiRequest;
import com.example.deviceconnectivity.dto.OrangeApiResponse;
import com.example.deviceconnectivity.dto.UeId;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@Slf4j
public class DeviceController {

    //    String baseUrl = System.getenv("BASEURL");
    private static final Logger logger = LogManager.getLogger(DeviceConnectivityApplication.class);

    @GetMapping("/hello")
    public String hello() {
        //     logger.info("Hello " + emoji);
        logger.info("applicationName ");
        return "Hello ";
    }


    @PostMapping("/status")
    public ResponseEntity<Object> callOrangeApi(@RequestBody OrangeApiRequest requestBody) {
        try {

            OrangeApiResponse orangeApiResponse = new OrangeApiResponse();
//            UeId ueId = new UeId();
//            ueId.setExternalId("123456789@domain.com");
//            ueId.setIpv4Addr("192.168.0.1/24");
//            ueId.setIpv6Addr("2001:db8:85a3:8d3:1319:8a2e:370:7344");
//            ueId.setMsisdn("124456789");
//
//            orangeApiResponse.setUeId(ueId);
//            orangeApiResponse.setUePort(5060);
//            orangeApiResponse.setEventType("UE_ROAMING_STATUS");
//            orangeApiResponse.setEventStatus("ROAMING_ON");

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
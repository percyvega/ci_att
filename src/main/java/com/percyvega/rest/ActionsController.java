package com.percyvega.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.percyvega.model.CarrierInquiry;
import com.percyvega.util.JacksonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("actions")
public class ActionsController {

    private static final Logger logger = LoggerFactory.getLogger(ActionsController.class);

    @RequestMapping(value = "post", method = RequestMethod.POST)
    public CarrierInquiry post(@RequestBody CarrierInquiry carrierInquiry) {
        try {
            logger.debug("Processing: " + JacksonUtil.toJson(carrierInquiry));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        carrierInquiry.setResponse(new Date().toString() + " - Carrier: " + carrierInquiry.getCarrierName());
        return carrierInquiry;
    }

}

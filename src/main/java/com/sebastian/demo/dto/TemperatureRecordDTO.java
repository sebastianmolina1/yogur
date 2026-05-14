package com.sebastian.demo.dto;

import com.sebastian.demo.domain.model.TemperatureLog;

import lombok.Data;

@Data
public class TemperatureRecordDTO {
    private Double temperature;
    private TemperatureLog.LogType type;
}



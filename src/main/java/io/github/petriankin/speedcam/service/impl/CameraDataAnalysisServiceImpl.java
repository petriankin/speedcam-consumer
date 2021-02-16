package io.github.petriankin.speedcam.service.impl;

import io.github.petriankin.speedcam.dto.CameraDataDto;
import io.github.petriankin.speedcam.service.CameraDataAnalysisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CameraDataAnalysisServiceImpl implements CameraDataAnalysisService {

    @Value("${speed-threshold:60}")
    private Integer speedThreshold;

    @Override
    public void checkAndSave(CameraDataDto dto) {
        if (dto.getSpeed() > speedThreshold) {
            log.debug("Speed of car with number {} is bigger than {}", dto.getLicensePlate(), speedThreshold);

        }
    }
}

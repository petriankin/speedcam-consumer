package io.github.petriankin.speedcam.service.impl;

import io.github.petriankin.speedcam.dto.CameraDataDto;
import io.github.petriankin.speedcam.service.CameraDataAnalysisService;
import io.github.petriankin.speedcam.service.SpeedCameraDataConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SpeedCameraDataConsumerServiceImpl implements SpeedCameraDataConsumerService {

    private final CameraDataAnalysisService dataAnalysisService;

    @Override
    @KafkaListener(topics = {"speedcam"})
    public void consume(CameraDataDto dto) {
        log.info("consumed {}", dto);
        dataAnalysisService.checkAndSave(dto);
    }
}

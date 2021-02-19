package io.github.petriankin.speedcam.service.impl;

import io.github.petriankin.speedcam.dto.CameraDataDto;
import io.github.petriankin.speedcam.service.CameraDataAnalysisService;
import io.github.petriankin.speedcam.service.CameraDataConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CameraDataConsumerServiceImpl implements CameraDataConsumerService {

    private final CameraDataAnalysisService dataAnalysisService;

    @Override
    @KafkaListener(topics = {"${kafka.topic}"})
    public CameraDataDto consumeAndProcess(CameraDataDto dto) {
        log.info("consumed {}", dto);
        dataAnalysisService.checkAndSave(dto);
        return dto;
    }
}

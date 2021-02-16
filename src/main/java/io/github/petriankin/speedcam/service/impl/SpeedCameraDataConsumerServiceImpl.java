package io.github.petriankin.speedcam.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.petriankin.speedcam.dto.CameraDataDto;
import io.github.petriankin.speedcam.service.SpeedCameraDataConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SpeedCameraDataConsumerServiceImpl implements SpeedCameraDataConsumerService {

    private final ObjectMapper objectMapper;

    @Override
    public CameraDataDto save(CameraDataDto dto) {
        throw new UnsupportedOperationException("Not implemented yet");
    }


    @Override
    @KafkaListener(topics = {"speedcam"})
    public void consume(CameraDataDto dto) {
        log.info("consumed {}", writeValueAsString(dto));

    }

    @SneakyThrows
    private String writeValueAsString(CameraDataDto dto) {
            return objectMapper.writeValueAsString(dto);
    }
}

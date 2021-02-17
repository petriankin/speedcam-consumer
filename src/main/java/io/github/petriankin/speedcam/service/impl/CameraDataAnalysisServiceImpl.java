package io.github.petriankin.speedcam.service.impl;

import io.github.petriankin.speedcam.domain.CameraData;
import io.github.petriankin.speedcam.dto.CameraDataDto;
import io.github.petriankin.speedcam.repository.CameraDataRepository;
import io.github.petriankin.speedcam.service.CameraDataAnalysisService;
import io.github.petriankin.speedcam.service.mapping.CameraDataMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class CameraDataAnalysisServiceImpl implements CameraDataAnalysisService {

    private final CameraDataMapper mapper;
    private final CameraDataRepository repository;

    @Value("${speed-threshold:60}")
    private Integer speedThreshold;

    @Override
    @Transactional
    public void checkAndSave(CameraDataDto dto) {
        if (dto.getSpeed() > speedThreshold) {
            log.info("Speed of car with license plate {} is bigger than {}", dto.getLicensePlate(), speedThreshold);
            CameraData cameraData = mapper.toEntity(dto);
            repository.save(cameraData);
        }
    }
}

package io.github.petriankin.speedcam.service.mapping;

import io.github.petriankin.speedcam.domain.CameraData;
import io.github.petriankin.speedcam.dto.CameraDataDto;
import org.springframework.stereotype.Service;

import java.time.Instant;

// TODO: 16.02.2021 use mapstruct
@Service
public class CameraDataMapper {

    public CameraData toEntity(CameraDataDto dto) {
        return CameraData.builder()
                .cameraId(dto.getCameraId())
                .licensePlate(dto.getLicensePlate())
                .dateTime(Instant.parse(dto.getDateTime()))
                .speed(dto.getSpeed())
                .build();
    }

}

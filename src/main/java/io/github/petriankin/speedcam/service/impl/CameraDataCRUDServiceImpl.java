package io.github.petriankin.speedcam.service.impl;

import io.github.petriankin.speedcam.domain.CameraData;
import io.github.petriankin.speedcam.repository.CameraDataRepository;
import io.github.petriankin.speedcam.service.CameraDataCRUDService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CameraDataCRUDServiceImpl implements CameraDataCRUDService {

    private final CameraDataRepository cameraDataRepository;

    @Override
    public CameraData save(CameraData cameraData) {
        return cameraDataRepository.save(cameraData);
    }

    @Override
    public CameraData getById(UUID uuid) {
        return cameraDataRepository.findById(uuid)
                .orElseThrow(() -> new RuntimeException("Camera data not found"));
    }
}

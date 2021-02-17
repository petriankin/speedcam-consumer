package io.github.petriankin.speedcam.service;

import io.github.petriankin.speedcam.domain.CameraData;

import java.util.UUID;

public interface CameraDataCRUDService {

    CameraData save(CameraData cameraData);

    CameraData getById(UUID uuid);
}

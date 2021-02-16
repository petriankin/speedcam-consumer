package io.github.petriankin.speedcam.service;


import io.github.petriankin.speedcam.dto.CameraDataDto;

public interface SpeedCameraDataConsumerService {

    CameraDataDto save(CameraDataDto dto);

    void consume(CameraDataDto dto);
}

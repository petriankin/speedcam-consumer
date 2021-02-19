package io.github.petriankin.speedcam.service;


import io.github.petriankin.speedcam.dto.CameraDataDto;

public interface CameraDataConsumerService {

    void consume(CameraDataDto dto);
}

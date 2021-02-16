package io.github.petriankin.speedcam.service;

import io.github.petriankin.speedcam.dto.CameraDataDto;

public interface CameraDataAnalysisService {

    void checkAndSave(CameraDataDto dto);
}

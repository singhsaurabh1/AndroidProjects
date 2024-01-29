package com.example.imageapplication.services;

import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.YuvImage;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.concurrent.BlockingDeque;

public class PreProcessingService extends Service {

    BlockingDeque<YuvImage> rawImage;
    BlockingDeque<Bitmap> processedImage;

    public PreProcessingService(BlockingDeque<YuvImage> rawImage, BlockingDeque<Bitmap> processedImage) {
        this.rawImage = rawImage;
        this.processedImage = processedImage;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

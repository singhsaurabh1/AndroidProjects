package com.example.imageapplication;

import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.YuvImage;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LiveData {

    BlockingDeque<YuvImage> rawImage;
    BlockingDeque<Bitmap> processedImage;

    ExecutorService mainServicePool;


    int NUMBER_OF_CORES;

    public LiveData(BlockingDeque<YuvImage> rawImage, BlockingDeque<Bitmap> processedImage) {
        this.rawImage = rawImage;
        this.processedImage = processedImage;
    }

    public void start(){
        NUMBER_OF_CORES=Runtime.getRuntime().availableProcessors();

        mainServicePool= Executors.newFixedThreadPool(2);
    }

    public void stop() throws InterruptedException {
        mainServicePool.awaitTermination(100, TimeUnit.MILLISECONDS);
        rawImage.clear();
        processedImage.clear();

    }

}

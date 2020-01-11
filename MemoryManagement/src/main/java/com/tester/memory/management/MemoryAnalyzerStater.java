package com.tester.memory.management;

import javax.management.Notification;
import javax.management.NotificationListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MemoryAnalyzerStater implements NotificationListener {
    private final ExecutorService executorService;
    private final MemoryAnalyzerConfig config;

    public MemoryAnalyzerStater(ExecutorService executorService, MemoryAnalyzerConfig config) {
        this.executorService = executorService;
        this.config = config;
    }

    public static void main(String[] args) {


        MemoryAnalyzerStater thisInstance = new MemoryAnalyzerStater(Executors.newSingleThreadExecutor() , new MemoryAnalyzerConfig());
        thisInstance.start();
    }

    public void start(){
        executorService.submit(new MemoryAnalyzerRunner(config));
    }

    @Override
    public void handleNotification(Notification notification, Object handback) {
      //  CompositeData cd = new CompositeDataSupport(CompositeType.ALLOWED_CLASSNAMES_LIST);
    }
}

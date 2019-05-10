package com.chain.resposibility.case1;

import java.util.Objects;
import java.util.Optional;

public class TextProcess implements Process {
    private Process otherProcess;

    @Override
    public void setNextProcess(Process otherProcess) {
        this.otherProcess = otherProcess;
    }

    @Override
    public void readProcess(String fileName) {
        Optional<String> fileNameOpt= Optional.of(fileName);

        if(fileNameOpt.isPresent() && fileNameOpt.get().endsWith("txt")){
            System.out.println("Text file processing.....");
        }else{
            if(Objects.isNull(otherProcess)){
                System.out.println(fileNameOpt.get() + " Not processed.");
            }
            otherProcess.readProcess(fileName);
        }
    }
}

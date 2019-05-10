package com.chain.resposibility.case1;

import java.util.Objects;
import java.util.Optional;

public class PdfFileProcess implements Process {
    private Process otherProcess;

    @Override
    public void setNextProcess(Process otherProcess) {

        this.otherProcess = otherProcess;
    }

    @Override
    public void readProcess(String fileName) {
        Optional<String> fileNameOpt= Optional.of(fileName);

        if(fileNameOpt.isPresent() && fileNameOpt.get().endsWith("pdf")){
            System.out.println("Pdf file processing.....");
        }else{
            if(Objects.isNull(otherProcess)){
                System.out.println(fileNameOpt.get() + " Not processed.");
            }else {
                otherProcess.readProcess(fileName);
            }
        }
    }
}

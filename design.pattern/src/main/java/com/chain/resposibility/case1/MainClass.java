package com.chain.resposibility.case1;

public class MainClass {
    public static void main(String[] args) {
        Process textProcess = new TextProcess();
        Process docProcess = new WordProcess();
        Process pdfFileProcess = new PdfFileProcess();
        textProcess.setNextProcess(docProcess);
        docProcess.setNextProcess(pdfFileProcess);

        textProcess.readProcess("myFile.pdf");



    }

}

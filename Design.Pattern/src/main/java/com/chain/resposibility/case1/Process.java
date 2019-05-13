package com.chain.resposibility.case1;

public interface Process {
    public void setNextProcess(Process otherProcess);
    public void readProcess(String fileName);
}

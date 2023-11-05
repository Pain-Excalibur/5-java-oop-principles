package com.example.task04;

public class ConsoleHandler implements MessageHandler
{
    public void transferData(String outputString)
    {
        System.out.printf(outputString);
    }

}
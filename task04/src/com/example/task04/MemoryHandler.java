package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler
{
    ArrayList<String> memory = (ArrayList)java.util.Collections.emptyList();
    public void transferData(String outputString)
    {
        memory.add(outputString);
        if(memory.size()>=5)
        {
            for(string out: memory)
            {

            }
        }
    }
}
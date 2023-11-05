package com.example.task04;

import java.io.*;

public class FileHandler implements MessageHandler
{
    public void transferData(String outputString)
    {
        {
            try
            {
                File file = new File("log.txt");
                file.createNewFile();

                FileWriter fw = new FileWriter( file.getAbsoluteFile( ) );
                fw.write(outputString);
                fw.close();
            }
            catch( IOException e )
            {
            }
        }

    }
}
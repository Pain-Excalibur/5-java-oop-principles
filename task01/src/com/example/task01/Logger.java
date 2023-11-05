package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Logger
{
    private final String name;
    private Level level;
    private String message;

    public String getName()
    {
        return name;
    }

    private static ArrayList<Logger> loggersList = new ArrayList<>();

    public static Logger getLogger(String name)
    {
        for (Logger logger : loggersList)
        {
            if (logger.name.equals(name))
            {
                return logger;
            }
        }
        return new Logger(name);
    }

    public Logger(String name)
    {
        this.name = name;
        loggersList.add(this);
    }

    public enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public void debug(String message)
    {
        this.level = Level.DEBUG;
        this.message = message;
        log(this.level,this.message);
    }
    public void debug(String message,Object... args)
    {
        this.level = Level.DEBUG;
        this.message = message;
        log(this.level,this.message, args);
    }

    public void info(String message)
    {
        this.level = Level.INFO;
        this.message = message;
        log(this.level,this.message);
    }
    public void info(String message,Object... args)
    {
        this.level = Level.INFO;
        this.message = message;
        log(this.level,this.message, args);
    }

    public void warning(String message)
    {
        this.level = Level.WARNING;
        this.message = message;
        log(this.level,this.message);
    }
    public void warning(String message,Object... args)
    {
        this.level = Level.WARNING;
        this.message = message;
        log(this.level,this.message, args);
    }

    public void error(String message)
    {
        this.level = Level.ERROR;
        this.message = message;
        log(this.level,this.message);
    }
    public void error(String message,Object... args)
    {
        this.level = Level.ERROR;
        this.message = message;
        log(this.level,this.message, args);
    }

    public void log(Level level, String message)
    {
        this.level = level;
        this.message = message;
        if(this.level.ordinal() >= currentLevel.ordinal())
        {
            System.out.printf(String.format("[%s] %s %s - %s", this.level, new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date()), this.name, this.message));
        }
    }

    public void log(Level level, String message, Object... args)
    {
        this.level = level;
        this.message = String.format((message) + "%n",args);
        if(this.level.ordinal() >= currentLevel.ordinal())
        {
            System.out.printf(String.format("[%s] %s %s - ", this.level, new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date()), this.name) + this.message + "%n", args);
        }
    }

    private static Level currentLevel = Level.DEBUG;

    public static Level getLevel()
    {
        return currentLevel;
    }

    public static void setLevel(Level level)
    {
        currentLevel = level;
    }


}

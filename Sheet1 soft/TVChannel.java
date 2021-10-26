/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram.tv;

/**
 *
 * @author الاء
 */
public class TVChannel
{
    private int channel;
    private int volumeLevel1;
    private boolean on;
    public TVChannel()
    {
        channel = 0;
        volumeLevel1 = 0;
        on = false;
    }
    public void turnOn()
    {
        on = true;
    }
    public void turnOff()
    {
        on = false;
    }
    public void setChannel(int newChannel)
    {
        if(newChannel>=1 && newChannel<=120)
        {
            channel = newChannel;
        }
    }
    public void setVolume(int newVolumeLevel1)
    {
        if(newVolumeLevel1>=1 && newVolumeLevel1 <=7)
        {
            volumeLevel1 = newVolumeLevel1;
        }
    }
    public void channelUP()
    {
        if(channel>=1 && channel<=120)
        {
            channel ++;
        }
    }
    public void channelDown()
    {
        if(channel>=1 && channel<=120)
        {
            channel--;
        }
    }
    public void VolumeUP()
    {
        if(volumeLevel1>=1 && volumeLevel1<=7)
        {
            volumeLevel1++;
        }
    }
      public void VolumeDown()
    {
        if(volumeLevel1>=1 && volumeLevel1<=7)
        {
            volumeLevel1--;
        }
    }
      public void printTVData()
      {
          System.out.println("the channel is " + channel);
          System.out.println("the volumeLevel is " + volumeLevel1);
          System.out.println("tv on" + on);
      }
}
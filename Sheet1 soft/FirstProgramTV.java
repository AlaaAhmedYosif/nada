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
public class FirstProgramTV
{
 public static void main(String[] args)
 {
    TVChannel tv = new TVChannel();
    tv.setChannel(50);
    tv.setVolume(2);
    tv.VolumeUP();
    tv.VolumeDown();
    tv.turnOff();
    tv.printTVData();
 }
}

package com.kodilla.exception.nullpointer;

import dodatkowe.MirrorString;
import dodatkowe.Potegu;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Hello!");
        }catch (MessageNotSentException o) {
            System.out.println("Message is not send");

        }

        Potegu potegu = new Potegu();

       System.out.println(potegu.potegowanie(1,2));


        MirrorString mirrorString = new MirrorString();

        System.out.println(mirrorString.mirroringString("abC"));


    }
}
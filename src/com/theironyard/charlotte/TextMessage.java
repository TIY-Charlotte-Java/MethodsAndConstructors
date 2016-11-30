package com.theironyard.charlotte;

/**
 * Created by Ben on 11/30/16.
 */
public class TextMessage {
    int fromNumber;
    int toNumber;
    String bodyOfMessage;
    String signature;
    Boolean sendSuccessful;

    public TextMessage(int from, int to, String text, String sig, boolean sent) {
        this.fromNumber = from;
        this.toNumber = to;
        this.bodyOfMessage = text;
        this.signature = sig;
        this.sendSuccessful = sent;
    }

    //getter
    public int getSendingNumber() {
        return fromNumber;
    }

    //setter
    public void setSendingNumber(int newFrom) {
        fromNumber = newFrom;
    }

    //getter
    public int getRecievingNumber() {
        return toNumber;
    }

    //setter
    public void setRecievingNumber(int newTo) {
        toNumber = newTo;
    }

    //getter
    public String getMessageBody() {
        return bodyOfMessage;
    }

    //setter
    public void setMessageBody(String newText) {
        bodyOfMessage = newText;
    }

    //getter
    public String getSignature() {
        return signature;
    }

    //setter
    public void setSignature(String newSig) {
        signature = newSig;
    }

    //getter
    public boolean getSendSuccessful() {
        return sendSuccessful;
    }

    //setter
    public void setSendSuccess(boolean newSent) {
        if (sendSuccessful) {
            sendSuccessful = newSent;
        } else {
            System.out.println("Send Unsuccessful. Try Again Later");
        }
    }
}

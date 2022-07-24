package org.mouritech.codeanswers;

public class Exercise6 {

    private String original;
    private String stringing1;
    private String stringing2;
    private String stringing3;

    public Exercise6(){

    }

    private void step1(){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < original.length(); i++) {
            str.append(original.charAt(i));
            str.append(original.charAt(i));
        }
        stringing1 = str.toString();
        System.out.println("Step1: " + stringing1);
    }

    private void step2(){
        StringBuilder str = new StringBuilder("");
        for (int i = stringing1.length(); i > 0; i--) {
            str.append(stringing1.charAt(i-1));
        }
        stringing2 = str.toString();
        System.out.println("Step2: " + stringing2);
    }

    private void step3(){
        StringBuilder str = new StringBuilder(stringing2);
        str.deleteCharAt(stringing2.length()-1);
        stringing3 = str.toString();
        System.out.println("Step3: " + stringing3);
    }

    public String processString(String stringToProcess){
        original = stringToProcess;
        step1();
        step2();
        step3();
        return stringing3;
    }



}

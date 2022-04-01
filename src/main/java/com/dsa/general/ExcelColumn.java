package com.dsa.general;


public class ExcelColumn {

    public static void main(String[] args) {
        System.out.println("Excel Column");
        char c='z';

        System.out.println(c-25);
        System.out.println('a'-0);


        int n=705;
        // System.out.println(n/28);

        printExcelColumn(n);

    }

    private static void printExcelColumn(int n) {
        StringBuilder columnName = new StringBuilder();

        // String s="";
        while(n>0){
            int reminder=n%26;
            if(reminder==0){
                columnName.append("Z");                
            } else{ 
                columnName.append((char) ('Z'-26+reminder));            }
            n=n/26;
        }

        System.out.println(columnName.reverse());
    }
    
}

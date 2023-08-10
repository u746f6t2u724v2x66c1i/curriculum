       IDENTIFICATION DIVISION.
       PROGRAM-ID. ex0103.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 DATA1 PIC 9(10).
       01 DATA2 PIC X(20).
       PROCEDURE DIVISION.
           DISPLAY "Enter a numeric value: ".
           ACCEPT DATA1.
           DISPLAY "Enter a text value: ".
           ACCEPT DATA2.
           DISPLAY "Numeric value entered: " DATA1.
           DISPLAY "Text value entered: " DATA2.
           STOP RUN.

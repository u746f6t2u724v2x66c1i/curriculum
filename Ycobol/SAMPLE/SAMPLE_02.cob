      *項目に値を入れる
       IDENTIFICATION DIVISION.
       PROGRAM-ID. SAMPLE-02.
*
       ENVIRONMENT DIVISION.
*
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 NUM PIC 9(3).
*
       PROCEDURE DIVISION.
       MAIN.
       MOVE 256 TO NUM
       DISPLAY "NUM の内容は " NUM
       STOP RUN.
